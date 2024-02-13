package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map.Entry;

public class BuildModel {

	static HashMap<String, CorpusRecord> model;
	private static File file;
	

	public static void main(String[] args) {

		BuildModel(ArrayListData());
		assignProbabilitiesForTheModel();
		DataToCSVFile.DataToCSVFile(model);

	}

	public static void run() {
		BuildModel(ArrayListData());
		assignProbabilitiesForTheModel();
		DataToCSVFile.DataToCSVFile(model);
	}

	// read arabic corpus from file

	private static StringBuilder readFile(File file) {

		StringBuilder string_builder = new StringBuilder();
		try {
			String line;
			// FileInputStream to read a file as a stream of bytes
			InputStream fileInputStream = new FileInputStream(file);

			// InputStreamReader to convert the byte stream into a character stream
			Reader reader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

            // BufferedReader to buffer and read the characters efficiently
			BufferedReader bufferedReader = new BufferedReader(reader);


			while ((line = bufferedReader.readLine()) != null) {
				string_builder.append(line).append(" ");
			}
			bufferedReader.close();
			//System.out.println("Finshed Reading ");
		} catch (Exception e) {

			System.err.print("Warning");
		}
		return string_builder;
	}

	// put data after Normaliz it and fixe data Quality in array list

	private static void readName() {
		
		File folder = new File("C:\\Users\\hp\\Desktop\\NLP\\Data");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
           if (file.isFile()) {
              System.out.println(file.getName());
           }
        }
        
		
	}
	
	
	public static void separateSentences(String inputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            int sentenceCount = 1;

            while ((line = reader.readLine()) != null) {
                String[] sentences = line.split("\\. ");

                for (String sentence : sentences) {
                    sentence = sentence.trim();
                    if (!sentence.isEmpty()) {
                        String outputFileName = "C:\\Users\\Hadeel\\Downloads\\NLPData\\NLP\\Data\\0" + sentenceCount + ".txt";
                        try (FileWriter writer = new FileWriter(outputFileName)) {
                            writer.write(sentence);
                            //System.out.println("Sentence " + sentenceCount + " saved in \"" + outputFileName + "\".");
                        } catch (IOException e) {
                            System.out.println("Error writing to file: " + e.getMessage());
                        }
                        sentenceCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
	
	private static ArrayList<StringBuilder> ArrayListData() {
        
		String inputFile = "corpos.txt";
        separateSentences(inputFile);
		
		File folder = new File("C:\\Users\\Hadeel\\Downloads\\NLPData\\NLP\\Data");
        File[] listOfFiles = folder.listFiles();
        
		
		ArrayList<StringBuilder> ArrayListBuilder = new ArrayList<>();
        StringBuilder CleanData;
        String dataAsString;
        ArabicNormalizer arabicNormalizer;

        for (File file : listOfFiles) {
        	if (file.isFile()) {
        		dataAsString = readFile(file).toString();
        		arabicNormalizer = new ArabicNormalizer(dataAsString);
        		CleanData = new StringBuilder(arabicNormalizer.getOutput());
        		ArrayListBuilder.add(CleanData);
        	}
        }

        return ArrayListBuilder;
	}


	// split the data in 1,2,3,4 gram and bild model for them using ngrams method
    // Array list data  --> data after normalizer (bulder array list)
	public static void BuildModel(ArrayList<StringBuilder> builderArrayList) {

		model = new HashMap<>();

		for (StringBuilder string_builder : builderArrayList) {
			for (int n = 1; n <= 4; n++) {
				String[] ngrams = BuildModel.ngrams(string_builder.toString(), n);
				if (ngrams == null)
					continue;
				for (String ngram : ngrams) {
					if (ngram.length() <= 1)
						continue;
					//if ngram does not exist --> put it into model
					// else  if ngram exist  increment the Frequency
					if (model.get(ngram) == null) {
						model.put(ngram.trim(), new CorpusRecord());
					} else {
						CorpusRecord corpusRecord = model.get(ngram);
						corpusRecord.setFrequency(corpusRecord.getFrequency() + 1);
					}
				}
			}
		}

	}


    // length = number of grams
	public static String[] ngrams(String string, int length) {
		String[] parts = string.split(" ");
		try {
			String[] result = new String[parts.length - length + 1];
			for (int i = 0; i < parts.length - length + 1; i++) {
				StringBuilder StringBuilder = new StringBuilder();
				for (int k = 0; k < length; k++) {
					if (parts[i + k].length() <= 1)
						continue;
					if (k > 0)
						StringBuilder.append(" ");
					StringBuilder.append(parts[i + k]);
				}
				result[i] = StringBuilder.toString();
			}
			return result;
		} catch (NegativeArraySizeException | IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	// method to set the probability for the model using method calculateProbability  (key = gram)

	private static void assignProbabilitiesForTheModel() {
		for (Entry<String, CorpusRecord> entry : model.entrySet()) {
			String key = entry.getKey();
			CorpusRecord value = entry.getValue();
			String[] splitter = key.split(" ");
			if (splitter.length == 1)
				value.setProbability(1);
			else {
				value.setProbability(calculate_Probability(splitter));
			}
		}
	}

	// calculate probability

	private static float calculate_Probability(String[] split) {
		int numerator = 0, denominator = 0;
		try {
			if (split.length == 2) {
				String num = split[0] + " " + split[1];
				String den = split[0];
				numerator = model.get(num).getFrequency();
				denominator = model.get(den).getFrequency();
				return (float) numerator / denominator;
			} else if (split.length == 3) { // length -> 3
				String num = split[0] + " " + split[1] + " " + split[2];
				String den = split[0] + " " + split[1];
				numerator = model.get(num).getFrequency();
				denominator = model.get(den).getFrequency();
				return (float) numerator / denominator;
			} else if (split.length == 4) { // length -> 4
				String num = split[0] + " " + split[1] + " " + split[2] + " " + split[3];
				String den = split[0] + " " + split[1] + " " + split[2];
				numerator = model.get(num).getFrequency();
				denominator = model.get(den).getFrequency();
				return (float) numerator / denominator;
			} else {
				System.out.println(" 1  ");

			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		return (float) numerator / denominator;
	}


	// class to clean the corpus

	public static class NormalizerData {

		private static String output = "";

		public NormalizerData() {
			super();
		}

		public static String getOutput() {
			return output;
		}

	}

	// method to write the model toscv file

	public static class DataToCSVFile {

		public static void DataToCSVFile(HashMap<String, CorpusRecord> model) {
			File file;
			PrintWriter writer;
			try {
				file = new File("model.csv");
				writer = new PrintWriter(file);

				model.forEach((key, value) -> writer.println(key + ", " + value.getFrequency() + ", " + value.getProbability()));
				writer.close();
				System.out.println(" Finshed Writing");
			} catch (FileNotFoundException e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
