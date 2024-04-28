package class3_4_tasks;

public class Array_task4 {

	public static void main(String[] args) {
	
		 int abc[]= {6,2,7,4,8 };
		    
//	    Question 1:
	      for(int numbers:abc) {
	      System.out.println(numbers); 	  
	      }

//	    Question 2:
		  System.out.println(abc.length); 
		  for(int x=0; x<=abc.length-1; x++) {
		  System.out.println(abc[x]);	  
		  }
		  
//	    Question 3:
		  for(int x=abc.length-1; x>=0; x--) {
		  System.out.println(abc[x]);
		  }
		  
//	    Question 4:
		  for(int x=4; x>=2; x--) {
		  System.out.println(abc[x]);	  
		  }	

	}

}
