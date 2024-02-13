package application;

import java.util.ArrayList;
import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {

		BuildModel.main(args);
		HashMap<String, CorpusRecord> model=BuildModel.model;

	
	}
	public static double findGram(String data  , HashMap<String, CorpusRecord> model){
		System.out.println("propapility");
		double sumProbability=0;
		int size = size(data);
		ArrayList<String> ls = new ArrayList<String>();
		if(size ==1 ){
			 ls = words1(data);
		}
		else if(size == 2){
			 ls = words2(data);
		}
		else if(size == 3){
			 ls = words3(data);
		}
		else if(size == 4){
			 ls = words4(data);
		}
		else if (size == 5){
			 ls = words5(data);
		}
		else if (size == 6){
			ls = words6(data);
		}
		else if (size == 7){
			ls = words7(data);
		}
		else if (size == 8){
			ls = words8(data);
		}
		else if (size == 9){
			ls = words9(data);
		}
		else if (size == 10){
			ls = words10(data);
		}
		else if (size == 11){
			ls = words11(data);
		}
		else if (size == 12){
			ls = words12(data);
		}
		else if (size == 13){
			ls = words13(data);
		}
		else if (size == 14){
			ls = words14(data);
		}
		else if (size == 15){
			ls = words15(data);
		}
		else if (size > 15){
			ls = words15(data);
		}



		for (HashMap.Entry<String,CorpusRecord> entry : model.entrySet()) {
			if(entry!= null){
			    String key = entry.getKey();
			    CorpusRecord value = entry.getValue();
			    for (String gram : ls) {
			    	if(key.equals(gram)){
				    	  double probability = value.getProbability();
				    	  sumProbability += probability;
			    	}
			    	}
//			    System.out.println(key + ": " + value);
			}
		}
		double averageProbability = sumProbability/ls.size() ;
		double percentageCopy = (1 - averageProbability) ;
		return averageProbability;
	}

	static int size(String str){
		String[] arr=str.split(" ");
		return arr.length;
	}

	static ArrayList<String> words1(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		return ls;

	}

	static ArrayList<String> words2(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[0]+" "+arr[1]);
		return ls;

	}
	static ArrayList<String> words3(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
	return ls;

	}

	static ArrayList<String> words4(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		return ls;

	}

	static ArrayList<String> words5(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		return ls;

	}

	static ArrayList<String> words6(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		return ls;

	}

	static ArrayList<String> words7(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		return ls;

	}

	static ArrayList<String> words8(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		return ls;

	}

	static ArrayList<String> words9(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		return ls;

	}

	static ArrayList<String> words10(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		return ls;

	}

	static ArrayList<String> words11(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		return ls;

	}

	static ArrayList<String> words12(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]);
		return ls;

	}

	static ArrayList<String> words13(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]);
		return ls;

	}
	
	static ArrayList<String> words14(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]+" "+arr[13]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]+" "+arr[13]);
		return ls;

	}

	static ArrayList<String> words15(String str){
		String[] arr=str.split(" ");
		System.out.println(" size i s"+ arr.length);
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		ls.add(arr[3]);
		ls.add(arr[0]+" "+arr[1]);
		ls.add(arr[1]+" "+arr[2]);
		ls.add(arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]+" "+arr[13]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]+" "+arr[13]);
		ls.add(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]+" "+arr[13]+" "+arr[14]);
		ls.add(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]+" "+arr[10]+" "+arr[11]+" "+arr[12]+" "+arr[13]+" "+arr[14]);
		return ls;

	}








}
