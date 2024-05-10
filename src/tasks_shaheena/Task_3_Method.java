package tasks_shaheena;


public class Task_3_Method {

	public static void main(String[] args) {
		/*Create 5 Return type Methods which will return Different data type Values.
		 *Create Different Data Type and Calculations inside them and Call them in Main method (You can use,addition,Subtraction,If else,Print Statement etc)
		 *.And Prove that it is returning the Value (By Printing the Calling method’s value, you can prove that)
		 */
		  

		
	  Task_3_Method  ob  = new  Task_3_Method();
		
		int x=ob.addition();
		int y=ob.subtraction();
		String  z=ob.ClassType();
		double j=ob.rectangle();
		int k=ob.comparenumber();
		
		
		System.out.println("sum of  of addition: " + x);
		System.out.println("result of subtraction: " + y);
		System.out.println(z);
		System.out.println("Area of rectangle is: "+ j);
		System.out.println("Compare two numbers:" + k);
		
		
		//i dim  Object array, for each loop 
	   Object array1[]= ABC();
		
	   for (Object s  : array1 )
			
		System.out.println( s );  // prints hello world 
		
		//System.out.println("\n");
	   
	int Array2[]=EFG();
	for(int i=0; i<=Array2.length-1;i++) {
		System.out.println(Array2[i]);
		
	}
		
	
	// String 
		
	/*	String Array3[][]= hobby();
		
		
		for (String str[] : Array3) 
			
			for(String  t : str) 
			System.out.println("my hobbies are:  " + t);
				
		}*/
		

		/*Object array4[][]=Books();
		
		for (Object obj[] : array4) 
		for (Object h : obj)
			System.out.println(h); */
		
				

			
			
			}
	
	


	
	
	

   

	//this  datatype  method is  returning int data type
	//so we have to sore it in int datatype box
	
	public int addition(){
	
		int a = 10;
		int b=50;
		int sum =a+b;
		return  sum;
	}
	
	
		   public int  subtraction() {
		      int d=90;
		      int e=40;
		      int result = d - e;
		      return result;
		  }
		
	//returning String class type , storing value in Class
	
	public String ClassType(){
		String s = "I like";
		String s1=" EAL Computer Class";
		return s+s1;
	
	}
	
	// double data type , storing value in double data type 
	public double rectangle() {
	
		double W = 40.50;
		double L= 60.50;
		double area =W*L;
		return area;
	
     }
      public int comparenumber() {

	
       int  a =5;
       int b= 10;

       if (a>b)
	   
    	   return a;
       
       else
	   
    	   return b;

      
    	 
    	 
    	 
            }
    
         
      
      /*       2)  Create 4 Return type Methods. 4 DIfferent Methods will return(1 dim Object Array,1 dim Int array,
                   2 Dim String Array,2 Dim Object Array).
                   And Proven that it is returning the Value (By Printing the Calling method’s value,
                   you can prove that But remember,  if it is returning an Array, You have to put the return value in an Array box.
                   And  you can prove it by printing with for Each loops . For loops– check next 2 examples for reference*/
   
       
      
      // Object array , for each loop 
    
    	 public static Object[] ABC() {
    		 Object onedimArray[]= {"Hello", "world"};
    	 
    	       return onedimArray; 
    	 
    	 }
    	
    	 
    	 //int   one dim  Array 
    	 
    	 public static int[] EFG(){
    		int oneDimintArray[]= {4,5,6} ;
    		     		return oneDimintArray;
    		  
    	  } }

          

           // two dim string object

          /*    public  static String [][] hobby(){
    		    String twodimArr[][]= {{ "Gardening", "Singing"},{"Traveling", "Reading"}};
    		    return  twodimArr;
    		
    	         }  */
    	  
    		
           
                // two dim Object array

    	   /*   public static Object[][] Books(){
    		    Object twodimArray[][]={{"Shakespeare" , "Romeo & Juliet" }, { "Jane Austen", "Pride and Prejudice"}};
    		    return twodimArray;
    		  
    		  
    	            }
    		
    	                } */
    		
    	 
   

 
    	

	


