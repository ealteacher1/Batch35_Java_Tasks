package tasks_shaheena;

import java.util.ArrayList;

public class Generic_ArrayList_Task {

	
	
	// Create 3 Generic Array list and Array list Name will be “Phone (IntType)”, “Names (StringType)”, “Grades (DoubleType)”
	//a. Put Specific Data type (ArrayListType) 5 Primitive Data Type values Inside each Arraylists
	//b. Print the length of the Phone, Names and Grades Array list.
	//c.Print the Values of Each array list with For Loop and For Each Loop.


	public static void main(String[] args) {
		
		// Array List - Phone
		ArrayList <Integer> Phone = new ArrayList<Integer>();
		
		
		Phone.add(456666);
		Phone.add(355677);
		Phone.add(567890);
		Phone.add(123456);
		Phone.add(667890);
		
		
		System.out.println(" Length of Array List Phone is: " + Phone.size());
	
		
		
		System.out.println("***********Prints all values by for loop**************** ");
		
		for (int i = 0; i<Phone.size(); i ++){
		System.out.println(Phone.get(i));	
			
		}
        
		System.out.println("**************Prints all values by for each loop**************");
		
		
		for (int j : Phone) {
		System.out.println(j);	
			
		}
		
		
		// Array List Names 
		
		ArrayList <String> Names = new ArrayList<String>();
		
		Names.add("Sunny");
		Names.add("Tony");
		Names.add("Johny");
		Names.add("Ronny");
		Names.add("Annie");
		
		
		System.out.println("Length of Array List Names is:" + Names.size());
		
		
		System.out.println("*************Prints all values of Names arrayList by for loop*****************");
		
		for (int k = 0; k<Names.size(); k++) {
		
			
		System.out.println(Names.get(k));
			
		 } 
		
	    System.out.println("********Prints all values of Names array list by for each loop");
		
		 for (String  h : Names) {
			 
		System.out.println(h);
		 } 
		 
		 
		ArrayList <Double> Grades= new ArrayList<Double>();
		 
		Grades.add(68.55);
		Grades.add(85.25);
		Grades.add(90.75);
		Grades.add(98.25);
		Grades.add(99.99);
		Grades.add(95.58);
		
		
		System.out.println("Length of Grades Array list is: " + Grades.size());
		
		
		System.out.println("*******Prints all values of array list Grades by for loop************");
	    
        
	
	     for (int g= 0; g< Grades.size(); g++) {
	    
	     System.out.println(Grades.get(g));
	    	  
	      }
	    	
	      
	     System.out.println("*******Prints all values of array list Grades by for each loop***********");
	    
	    
	     for  (Double d: Grades) {
		  
		 System.out.println(d);
	      }
	      }
	      }

