package tasks_shaheena;

public class Task_4_methods {

	public static void main(String[] args) {
		/* 1) Create 5 Return type Methods which will return Different data type Values.
		 * Put different Different Data Type Input parameter and do some Calculations inside the method body,
		 * Return a Value and Call the method from Main method (You can use, addition, Subtraction, If else, Print Statement etc).
		 * And Prove that it is returning the Value (By Printing the Calling method’s value, you can prove that) */
		 
		 
		 

             int result =getSum(7,5);
             System.out.println("sum of two integer:" +  result);
             
             String str = myneighbor("Robin", "   Flushing");
             System.out.println(str);
	
             
             double d1=subtract(9.50 - 2.50);
             System.out.println(d1);
             
             String st=  displayFullname("Nelson" , "   Mandela");
             System.out.println(st);
             
             
             long lg =subtractlong(45678903456878l-35678903456878l);
             
                System.out.println(lg);

	
	         boolean bl = EvenorOdd(10);
	         System.out.println(bl);
		
           
	         //no. 2 answers
	        
	         
	         //1 dim int array
	         int []marks= {55, 65, 75, 85,};
	         display(marks);
	         
	         // 1 dim String array
	         
	         String[] fashionDesigners= {"COCO Channel", "Calvin Klien","D vesace","Christian Dior"};
	         str1(fashionDesigners);

	         // 1 dim Object array
	          Object [] devicesnprices= { "MacComputer", 3500, "Windows Computer", 2500, "iphone", 1000 };
	          obj1(devicesnprices);
	
	          
	          // 2 dim string array
	          
	          String[][] wordsOfWisdom={{"learn from yesterday"},{"Live for today"}};
	          str2(wordsOfWisdom);
	
	         // 2 dim object array
	          
	          Object [][] empsalary= {{"Rony", 1500, "Sunny", 1400},{ "Johny" , 2500,"Tony", 2000}};
	          obj3(empsalary);
	
	
	
	
	
	
	           }
               
	
	



                     //int 

	                 public static int getSum(int a , int b){
		             int sum = a+b ;
		             return (sum);	
		             
	               }
		
	
	                  // String 
	                  public static String myneighbor(String name, String city)	{
		              String st = name+city;
		              return (st);
		
	
		
                    
	               }
	                  //  double
	                 public static double  subtract(double c) {
		             return ( c);
		
	                }
	
	
	                 //String 
	                 public static String displayFullname(String firstName, String LastName  ) {
		             return(firstName+ LastName);
		
	                }
	
	                // long
	                public static long subtractlong(long l) {
		            return (l); 
		 
		 
		 
	                 } 
	 
	                 // if else 
  
	                public  static  boolean EvenorOdd(int value) {
	               
	                if  ((value %2)==0) {
		            
	                return true;  
		   
	                }else {
		   
		            return  false;
		            
	                 }
	                
	    
		   
	                 }
    
   
   
        /* 2) Create 4 Return type Methods. 4 DIfferent Methods will return (1 dim Object Array, 1 dim int array, 2 Dim String Array,2 Dim Object Array).
		 *  Put different Data Type Input parameter And Prove that it is returning the Value (By Printing the Calling method’s value, you can prove that
		 *  But remember, if it is returning an Array, You have to put the return value in an Array box.
		 *  And you can prove it by printing with for Each loops/.For loops)– check next 2 examples for reference.
		 */
	
	
		
	             // 1 dim object array
	                
	              public static  Object [] obj1(Object c[]) {
			      for (Object  x : c)
				  System.out.println(x);
			
			      return c;
	 
	 
	 
	             }
	 
	
	             //1 dim int array , for each loop
	              
	              public static int [] display(int m []){
		
		          for (int k:m)
		
	              System.out.println(k);
		
		          return m;
		          
	               }
	
	              // 1 dim String array 
	              
	              public static  String  [] str1(String s[]) {
	            	  
		          for (String  h : s)
		        	  
			      System.out.println(h);
		
		          return s;

                  }
	              
	              // 2 dim String array
	              
	
	              public static String [][] str2(String n[][]){
		  
		          for (String ab[] : n)
			      for (String x:ab)
			    	  
			      System.out.println(x);
		   
		          return n;

		   
		          }
	   
	              // 2 dim object array
	              
	             public static Object [][] obj3(Object ob[][]){
	    	
	    	
	    	     for (Object rb []: ob )
	    		 for (Object sb :rb)
	    			 
	    		System.out.println(sb);
	    	    return ob;
	    	    
	              }
	     
                  }
	    




	


