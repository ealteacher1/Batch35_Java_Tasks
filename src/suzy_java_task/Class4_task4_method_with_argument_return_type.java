package suzy_java_task;



public class Class4_task4_method_with_argument_return_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dept = y(10,20);
		System.out.println("the amount of dept :"+ dept );
		float luck =happy (0.2f,0.3f);
		System.out.println("the name of the kidos "+ luck );
		double garden = honey(0.5,0.8);
		System.out.println("the beautiful bee :"+ garden);
		int summer =cream (40,50);
		System.out.println("wondrful :"+ summer);
		boolean friendship = monkey(5,10) ;
		System.out.println("the condition is :"+ friendship);
		Object []smile = life(20);
		for (Object joy:smile ) { 
			System.out.println(joy);
		}
	    int []car =bank(10);
	    for(int tree :car) {
	    	System.out.println(tree);
	    	
	    }
	    String [][]cookies= hope ("girl");
	    for (String []boy:cookies) {
	    	for (String kids:boy) {
	    		System.out.println(kids);
	    	}
	    }
	    	
	    Object [][] city = adventure(20);
	    for(Object []sugar:city ) {
	    	for(Object winter: sugar ) {
	    		System.out.println(winter);
	    	}
	    }
	}
	    
	    
	    
			
		
		

	

// task 4--
	
//	with integer --
	public static int y(int a,int b) {
		  int dept = a+b;	
	        return dept ;
	        
	}
	
// with Float
	public static float happy (float emily,float remy  ) {
		float luck= emily -remy;
		return luck ;
	}
		
//		with double 
		public static double honey (double bee, double yellow) {
			double garden = bee *yellow;
			return  garden ;
		}
			
// with int using remainder--
			public static int cream (int dog,int cat ) {
				int summer = dog %cat ;
				return summer ;
				
			}
//	if else condition with boolean   --
				
			public static boolean monkey (int y,int z) {
		        boolean friendship= true;

		        if(y>=z ) {

		            friendship =true;

		            System.out.println("the condition is  :"+true); 
		        }
		            else {

		            System.out.println("the condition is : "+ false);
		        }

		        return friendship ;
		        
			}
		        
//	creation 4 return type methods --
		        
            
//create 4 return type  methods 
            
//create 1 dim object array --
        
   public static  Object []life(int a){
	   Object smile []={"luck",2 ,'s'};
	  return smile ; 
   
            
   }             
    

//create 1 dim integer array --
public static int[] bank (int c) {
int b[] ={10,20,30};
return b;
      
}    

//create 2 dim string array --
public static String [][] hope (String v){
String food [][]= {{"joyful","emily," ,"remy" },{"day","night","nice"}};
return food ;
}


//CREATE 2 OBJECT DIM ARRAY 
public static Object [][]adventure(int s ){
Object beach[][]= {{"sad","why","not"},{"sun","light","rainbow"}};
return beach ;
}
	
					 
				
						
					
				}
			
		
		
		
	
	        

	
	
	

