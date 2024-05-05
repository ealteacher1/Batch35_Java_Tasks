package tasks_shaheena;

public class Task_2_Method {

	public static void main(String[] args) {
		
		
		    
		   //Create 5 Methods with different Data Type variables, Input Variables will be(String, Char, Double,etc)
		   //and Calculations inside them and Call them in Main method (You can use, addition, Subtraction, If else, Print Statement etc) 
		
		      
		
		
		   //Method with argument 
				
		      
	            myaccount(1000, 2000, 10000);
	            
			    myDrinks(" Water ",   " MilkShake ",   " Coconut Water ",   " Coffee " );
			    
			    myGrade('A');
			    
			    myNum(80.50d, 75.50d );
			    
			    myNum1(950.50d,150.50d);
			    
			    classicalSingers("1. Ustad Karim Khan", " 2. Ustad Rashid Khan " ," 3. Gangubai Hangal");
			    
			    ifelse(9, 10);
			    
			    num(40);  
			
	
	
	
	
	             }
			
 
				
				// integer 
				public  static void myaccount(int c, int s, int d) {
					
				int  myaccount=c+s+d;
				
				System.out.println("Account Balance: " +myaccount);
					
					
					
					
				}

				// String 
				public static void myDrinks( String  wt, String  ms, String cw, String  cf ) {
					
				String 	myDrinks= wt +  ms  +  cw  +  cf;
				
				
				System.out.println("List of my daily Drinks: "   + myDrinks);
				
				
				}
				
				// char 
				
				public static void myGrade(char x) {
					
				char myGrade=x;
				
			    System.out.println("My Grade is: " + myGrade);
			    
			    
			    
				}
				
				//double 
				
				public static void myNum(double d, double e) {
					double myNum=d+e;
				System.out.println("My number is:= "+ myNum );	
				
				
					
				}
				
				//double subtraction
				
				public static void myNum1(double a, double b) {
					double myNum1=a-b;
				System.out.println("subtraction:= "+ myNum1 );	
				
		        }
				
				
				//String 
		         
				public static void classicalSingers(String k, String r, String g  ) {
		        	  
		          String  classicalSingers= k + r + g;
		        	  
		          System.out.println("My favoriteClassical singers:" + classicalSingers );
		          }
		          
		         
				// if else

		        public static void ifelse(int a , int b ) {
		    	 
		    	if (a== b ) {
		    		 
		     
		   			  System.out.println("Statement is true");
		    	}else {
		   			  
		   			  System.out.println("Statement is false");
		   			  
		    	    }
		          }
		     
		     public static void  num(int x) {
		    	 
		    	 
		    	 if (x % 2== 0) {
		    		 
		    	 System.out.println("the number is even" );
		    	
		    	 }else {
		    	
		    		 System.out.println("the number is odd");
		         }
		        }
		     }
		     
		     
		    

	


