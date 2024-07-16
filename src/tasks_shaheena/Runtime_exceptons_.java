package tasks_shaheena;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class Runtime_exceptons_ {
	//Unchecked exceptions, on the other hand, are problems that Java doesn't force you to plan for.
   // * You can handle them if you want, but you're not required to. They're often due to programming errors.*/

    //Unchecked Exception Examples
	//Example One: NullPointerException
	//A NullPointerException in Java occurs when you try to use an object reference 
	//that has not been initialized (i.e. it is null). Here’s an example:
	
	
	public static void main(String[] args) {
		
	    try {
	    	
            int a = 10, b = 0;
            
            System.out.println("Result: " + a/b);
            
           } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception: cannot divide by 0");
        }

	
		
		
            
            
            	
            	String fileName = "file does not exist"; 
            	File file = new File(fileName);
            	try {
            	    FileInputStream stream = new FileInputStream(file); 
            	    } catch (FileNotFoundException e) {
            	    	System.out.println(e);
            	    }
            	String input2 = "test";
                List<String> inputList = null;
                try {
                    NullCheck(input2, inputList, input2);
                } catch (NullPointerException e) {
                    System.out.println(e);
                } 
                
                
                
            }
            	     
            	
            
            	 
            	

		    public static void NullCheck( String str1,  List<String> strList,  String str2) {
		    System.out.println(str1.length() + strList.size() + str2.length());	
		
	
		    
		    try {
	            int a = 10, b = 0;
	            System.out.println("Result: " + a/b);
	        } catch (ArithmeticException ae) {
	            System.out.println("Arithmetic Exception: cannot divide by 0");
	        }

		    String[] strArray = {"Hello", "World"}; //Initializing strArray
	        if (strArray[0] != null) { //Check for null
	            System.out.println(strArray[0].length());
	            
	            String[] strArray1 = new String[2];
	            System.out.println(strArray[0].length()); //Trying to call a method on a null object
	            
        
		   // String input1 = null;
           //  void simpleNullCheck(input1);
        

       //  static void simpleNullCheck(String str1) {
           // System.out.println(str1.length());
        }}}
        
    
		

	


