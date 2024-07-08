package CollectionInJava;

import java.util.ArrayList;

import collectionaInJava.Arraylist;

public class Arraylist_generic_2 {

	public static void main(String[] args) {
		ArrayList<Integer> aphone=new ArrayList<Integer>();
		//
		aphone.add(12);
		aphone.add(22);
		aphone.add(222);
		aphone.add(323);
        aphone.add(888);
        System.out.println(aphone.size());
        
        for(int a=0;a<aphone.size();a++) {
        	System.out.println(aphone.get(a));
        }
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("sam");
		names.add("salim");
		names.add("sab");		
		names.add("luqman");
		names.add("sahra");
		System.out.println(names.size());
		
	      for(int b=0;b<names.size();b++) {
	        	System.out.println(names.get(b));
		
		
		ArrayList<Double> grades=new ArrayList<Double>();
		grades.add(12,12d);
		grades.add(99.88d);
		grades.add(12.12d);
		grades.add(99.99d);
		grades.add(88.88d);
		System.out.println(grades.size());
		
		for(int c=0;c<grades.size();c++) {
			System.out.println(grades.get(c));
		}
		
	}
	}
}
