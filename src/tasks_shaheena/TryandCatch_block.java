package tasks_shaheena;

          import java.io.FileNotFoundException;
          import java.io.PrintWriter;

          //Create 3 compile time error and handle them with try and catch block

          //We use the try-catch block for exception handling in our code. try is the start of the block and catch is at the end
     
          //The catch block requires a parameter that should be of type Exception.

           public class TryandCatch_block {
        	   

	        public static void main(String[] args) {
		  
		  
		  
		     try {
	          int arr[] = {5,6,7,8,9};
	          
	          // Code that may throw an exception
	          System.out.println(arr[6]); // This statement will throw ArrayIndexOutOfBoundsException
	          
	         } catch (ArrayIndexOutOfBoundsException e) {
	          // Code to handle ArrayIndexOutOfBoundsException
	          System.out.println(e);
	          
	          } finally {
	    	   
	          // Code that is always executed
	          System.out.println("finally block");
	          
	          
	          PrintWriter pw; 
	          
	          
	          try {  
	        	  
	           //may throw exception  
	            pw = new PrintWriter("jtp.txt");  
	            pw.println("saved"); 
	            
	            
	          }  
	          
	           // providing the checked exception handler  
	           catch (FileNotFoundException e) {  
	                
	           System.out.println(e); 
	              
	          }  
	          
	           System.out.println("File saved successfully");  
	           
	           
	           
	          
	           
	           try {
	           
	           //may throw exception 
	           int data=90/0;   
	                            
	           // if exception occurs, the remaining statement will not exceute  
	           System.out.println("rest of the code"); 
	           
	           } 
	           
	           // handling the exception   
	           catch(ArithmeticException e) 
	           
	           { 
	        	   
	           System.out.println(e); 
	           
	           }  
	                
	           }
		  
	           }
	  
	           }
	                
      
              
	          
	          
	          
	          
	          
	          
	          
	       
	       
	
		

	   

       
