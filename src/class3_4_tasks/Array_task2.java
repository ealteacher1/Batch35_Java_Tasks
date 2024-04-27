package class3_4_tasks;

public class Array_task2 {

	public static void main(String[] args) {
		String fruits[]=new String[12];
		fruits[1]="apple";
		fruits[3]="kiwi";
		fruits[6]="orange";
		
	//  Question 1:
	   	System.out.println(fruits.length);
	   	for(String fruit:fruits) {
	   	System.out.println(fruit);	
	   	}
	//  Question 2:
	   	System.out.println(fruits[3]);
	   	System.out.println(fruits[5]);
	   	
	//  Question 3:
	   	System.out.println(fruits.length);
	   	for(int y=0; y<=fruits.length-1; y++) {
	   	System.out.println(fruits[y]);	
	   	}
	    			
	// Question 4:
	   	for(int y=fruits.length-1; y>=0; y--) {
	   	System.out.println(fruits[y]);	
	    }

	// Question 5:
	   for(int y=5; y<=8; y++) {
	   System.out.println(fruits[y]);	   
	   }
	   
	// Question 6:
	   for(int y=8; y>=4; y--) {
	   System.out.println(fruits[y]);	   
	   }		 
	}

}
