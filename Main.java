package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	Text txtResult = new Text("");

	 public static void main(String[] args) {
	        launch(args);
	    }

	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();

			TextField textField = new TextField();
			Label label = new Label("الرجاء إدخال الطلب:");
			label.setStyle("-fx-font-size: 15pt; -fx-font-weight: bold; -fx-padding: 20px 0 0 0;");

			txtResult.setStyle("-fx-font-size: 30pt; -fx-font-weight: bold;"); ;


			textField.setPrefWidth(600);
			textField.setPrefHeight(30);

			textField.setTranslateX(250);
			textField.setTranslateY(85);
			textField.setAlignment(Pos.BASELINE_RIGHT);
			textField.setStyle(
					"-fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.5), 5, 0, 0, 5);"
					+ "-fx-font-size: 12pt; -fx-font-weight: bold ;-fx-background-radius:15;"
					);

			
			ListView<String>  listView = new ListView<>();
			
			listView.setPrefSize(600, 300);
			listView.setStyle(
					"-fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.5), 5, 0, 0, 5);"
					+ "-fx-font-size: 15pt; -fx-font-weight: bold ;-fx-background-radius:15;"
					);

			
			listView.setTranslateX(250);
			listView.setTranslateY(200);
			label.setTranslateX(700);
			label.setTranslateY(15);
		
			
			textField.textProperty().addListener((observable, oldValue, newValue) -> {
			    // Split the new text value by spaces and get the last word
			    String lastWord = newValue.trim().split("\\s+")[(newValue.trim().split("\\s+")).length - 1];
			    BuildModel.run();
			    HashMap<String, CorpusRecord> model = BuildModel.model;
			    List<String> results = autocomplete(lastWord, model);
			    
			    for(String str : results) {
			        System.out.println(str);
			    }

			    // Assuming 'listView' is the instance of your ListView
			    listView.getItems().clear(); // Clear previous autocomplete suggestions
			    listView.getItems().addAll(results); // Add new suggestions to the ListView
			});
			
			AtomicBoolean isFirstTime = new AtomicBoolean(true);
			listView.setOnMouseClicked(event -> {
				int  i =0;
			    String selectedText = listView.getSelectionModel().getSelectedItem();
			    if (selectedText != null) {
			        String existingText = textField.getText().toString();
			        String newText = "";
			        int lastSpaceIndex = existingText.lastIndexOf(" ");
			        if (lastSpaceIndex != -1) {
			            // If there's more than one word in the text field, keep all but the last word
			            newText = existingText.substring(0, lastSpaceIndex);
			        } else {
			        	if(i<1) {
			            // If there's only one word in the text field, keep the text as it is
			            newText = existingText;
			        	}
			        }
			        if (isFirstTime.get()) {
			           textField.setText(" "+ newText + selectedText + "  ");
			            isFirstTime.set(false);  // Set the flag to false after the first time
			        } else {
			            textField.setText(newText + " " + selectedText + " ");
			        }
			    }
			    i++;
			});  
			
		

			// Create an Image object with the image path
			Image image = new Image(getClass().getResourceAsStream("Resturant.jpg"));

			// Create a BackgroundSize object
			BackgroundSize backgroundSize = new BackgroundSize(120, 120, true, true, true, false);

			// Create a BackgroundImage object with the above image and size
			BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);

			// Set the background of the pane
			root.setBackground(new Background(backgroundImage));


			root.getChildren().addAll(listView, textField , label,txtResult);
			Scene scene = new Scene(root,1000,600);
			primaryStage.setTitle("Natural Language Processing  ( NLP )");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	

	public static List<String> autocomplete(String prefix, HashMap<String, CorpusRecord> model){
	    List<String> topMatches = new ArrayList<>();
	    PriorityQueue<WordProbabilityPair> topKPairs = new PriorityQueue<>(new WordComparator());

	    int k = 8;   // Change this value to the number of autocomplete suggestions you want

	    for (HashMap.Entry<String,CorpusRecord> entry : model.entrySet()) {
	        String key = entry.getKey();

	        // Check if the key starts with the given prefix
	        if(key.startsWith(prefix)) {
	            CorpusRecord value = entry.getValue();

	            // Add to PriorityQueue
	            topKPairs.offer(new WordProbabilityPair(key, value));

	            // If we have more than k pairs, remove the one with the lowest probability
	            if (topKPairs.size() > k) {
	                topKPairs.poll();
	            }
	        }
	    }

	    while(!topKPairs.isEmpty()) {
	        // This will give you the top k pairs in reverse order (lowest probability first)
	        // If you want highest probability first, you can use a stack or just reverse the list
	        topMatches.add(topKPairs.poll().word.substring(prefix.length()).trim());
	    }

	    // If no matches found, add suitable message to the list
	    if(topMatches.isEmpty()) {
	        topMatches.add("لم يتم العثور على الطلب");
	    }
	    
	 

	    return topMatches;
	} 



	


}
