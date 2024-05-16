package tasks_shaheena;



public class ClassA {

	public static void main(String[] args) {
		
		
		/*Create a new class as Class_A and Create 3 Non-static method of Each type (Total 12 NS method)inside the new class.
		 * one method should return 2 dimensional array and one method must return 1 dimensional array.
		 * 
		 * a. Call all newly created methods from Main method of the same class and Prove that return types are returning values.
		 * b.Call all methods from the Main methods of Different class’s from the Same Package.
		 * c.Create another class Named “Class_C”. Create another public NS method, Method name should be Calling From C inside that method,
		 * Call all NS methods from CLass A. and prove that Return type methods are returning something.
		 */

		
		
		//Task 5.a
		
		
		//a. calling methods from same class
		
		
		               ClassA obj= new ClassA();
		
		               obj.addition();
		               obj.Subtraction();
		               obj.Multiplication();
		               obj.ifelse(35, 50);
		               obj.FavTennisplayer(" Rafael",  "Nadal");
		               obj.Mymonthlysavings(5000, 3500, "April");
		
		               double  x= obj.addition2();
		               System.out.println("the sum of double:" + x);
		
		
		
		
		              /* int Array1[]=obj.numbers();
	                   for(int i=0; i<=Array.length-1;i++) {
	   	  
		               System.out.println(Array1[i]);*/
		
		
	
		              
			
		          // 2 dim String Array 
			
				    String Array2[][]=obj.FavFlowers();
				
				
				    for (String str[] : Array2) 
					
					for(String  f : str) 
					System.out.println("my favorite flowers  are:  " + f);
						
	     
				   
				   
				    Object array3[][]=obj.Plants();
					
					 for (Object ob[] : array3) 
					 for (Object b : ob)
					 System.out.println(b); 
					
					
					
				
							
			         
			         
			         // 1 dim object array
				
					Object Bridal[]={"bridal dress", 5000, "Bridal makeup", 4000};
					obj.obj5(Bridal);
					
					
					//2 dim object array 
					Object [][] accoutbalance= {{"checking", 2200, "Savings", 3400},{ "CD" , 5500,"401k", 6000}};
			         obj.obj2(accoutbalance);
			        
			        // 1 dim int array
			        int []marks= {55, 65, 75, 85,};
			        obj.display(marks);
			     
			         
	                }
	
	     
	    
	
	
	              //Non Static Methods..Without Arguement, Non-Return type
	               public  void addition() {
 	               int a= 150;
 	               int b=200;
 	               int total= a+b;
 	               System.out.println("Result of Addition:=   " +total);
 	  
                 }
	              public  void Subtraction() {
			
			     int c= 80;
			     int d =35;
			     int x=c-d;
			     System.out.println( "Result of Subtraction:=  " +x);
			  

                }

	            public void Multiplication() {
			    float e =5.3f;
			    float f = 4.5f;
			    float total = e*f;
			    System.out.println("Result of multiplication := " +total);
			 			  	  


              }
	   
	  
	            //Non static method , with arguments, Non-return type
	  
	 
	  
	            // if else

	           public  void ifelse(int a , int b ) {
	    	 
	    	   if (a== b ) {
	    		 
	     
	   		  System.out.println("Statement is true");
	   		  
	    	  }else {
	   			  
	   	      System.out.println("Statement is false");
	   			  
             }}
	    	
	    	
	    	
	    	   public void FavTennisplayer(String a, String b ) {
	        	  
	           String  FavTennisplayer= a + b ;
	        	  
	           System.out.println("My favorite Tennis player:" + FavTennisplayer);
	        	  
	        	  
	           }
	    	 
	    	    public void Mymonthlysavings(int income, int expense, String nameOfMonth) {
	 			
	    		int Mymonthlysavings=income-expense;
	    					
	    		System.out.println("My Monthly Savings : " +nameOfMonth+ "=" + Mymonthlysavings);
	    					
	    					
                }


               //Non Static Method,  without argument, Return type


               public double addition2(){
       	       double sum = 796.58+ 345.50;
       	       return sum; 
       	      
       	      
                 }
       	   
               // 1  dim  array , for each loop 
          
             /*  public  int[] numbers(){
           	   int oneDimintArray[]= {4,5,6} ;
               return oneDimintArray;
           		     		
                
                 }	*/
           		  

         
		       //2 dim String Array 
               public String [][] FavFlowers(){
       	       String twodimArr[][]= {{ "Rose",  "Tulips"},{"Jasmine", "Daffodils"}};
       	       return  twodimArr;
       		

           
                }
               
               
               //2 dim object Array 
               public Object[][] Plants(){
       	       Object twodimArray[][]={{"Rosemary" , "Thyme" }, { "Basil", "Parsely"}};
       	       return twodimArray;
       		  
       		  
       	        }              
                 
               
               //Non static Method , with arguments, Return type 
              
               
               
               // 1 dim object array
               public  Object [] obj5(Object s[]) {
       		
               for (Object  x : s)
       		   System.out.println(x);
       			
               return s;
       	 
               }
               
               // 2 dim object array 
               
              
               
               public Object [][] obj2(Object ob[][]){
       	    	
       	       for (Object rb []: ob )
       	       for (Object sb :rb)
       	       System.out.println(sb);
       	    	
       	       return ob;
       	    	
       	    	
       	    	
               }	
                   
                   
               
              // i dim  int array
                    
               
               public  int [] display(int m []){
                  		
               for (int k:m)
                  		
               System.out.println(k);
                  		
               return m;    
  	         

                }

	            }


