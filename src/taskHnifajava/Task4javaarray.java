package taskHnifajava;

public class Task4javaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	     int bal [] = {20,50,87,03,68 };
	     

	{
	  //Question 2: for each loop print all the value 
	  
		     for (int z : bal) { 
		    	 
		  System.out.println(z);
	  }}
		  
		  
		  //Question 3 :find out the length of the array and print all the value from 1st index to last index with for loop:
		    
		  System.out.println(bal[0]);
		  System.out.println(bal[1]);
		  System.out.println(bal[2]);
		  System.out.println(bal[3]);
		  System.out.println(bal[4]);
		  
		  
		  //Question 3 :print all value from las index(a.length-1) to first index ;
		  
		  for (int v=bal.length-1; v>=0; v--) {
			  System.out.println(bal[v]);
		  }
		  
		  //Question 4:Print all the value 5th index to 2nd index;
		 
		  for (int i=4 ; i>=1; i--)  {
			  
		  System.out.println(bal[i]);
		  }
	}}
		