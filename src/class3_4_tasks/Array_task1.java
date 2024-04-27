package class3_4_tasks;

public class Array_task1 {

	public static void main(String[] args) {
		int abc[]=new int[11];
		abc[1]=10;
		abc[7]=20;
		abc[9]=40;
	// Question 1:	
		System.out.println(abc.length);
	//  For each loop:
		for (int d:abc) {
		System.out.println(d);	
		}
	// Question 2:	
		System.out.println(abc.length);
	//  For loop:
		for(int x=0; x<=abc.length-1; x++) {
		System.out.println(abc[x]);	
		}
	// Question 3:
	    System.out.println(abc[5]);	
	    System.out.println(abc[7]);
		 
	// Question 4:
	   System.out.println(abc.length);
	// Using for loop  :
	   for(int x=abc.length-1; x>=0; x--) {
	   System.out.println(abc[x]);
	   }
	// Question 5:
	   System.out.println(abc.length);
	   for(int x=5; x<=8; x++) {
	   System.out.println(abc[x]);	   
	   }
	// Question 6:
	   System.out.println(abc.length);
	   for(int x=8; x>=4; x--) {
	   System.out.println(abc[x]);	   
	   }	 
	 

	}

}
