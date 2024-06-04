package suzy_java_task;

public class Class4_task3_method_without_argument_return_type {

	public static void main(String[] args) {
		String goodhealth =love  ();
System.out.println(goodhealth);
      int  happylife = money () ;
      System.out.println(happylife);
      int redness = red();
      System.out.println(redness);
      int sweetdreams=red ();
      System.out.println(sweetdreams);
      int lifstyle=moon();
      System.out.println(lifstyle);
      Object park=  garden() ;
      System.out.println(park);
      Object[]smile=life() ;
      for(Object a: smile) {
    	  System.out.println(a);
    	  int[]b=bank();
    	  for(int c : b) {
    		  System.out.println(c);
    		  String[] []kind =hope ();
    		 for(String []  X :kind ) {
    			 for(String y: X) {
    			 System.out.println(y);
    			 Object[][]fun=adventure();
    			 for(Object[] s : fun) {
    				 for(Object t : s) {
    					 System.out.println(t);
    				 }
    			 }
    		 }
    		  
    	  }
    	  }
      }
    		  
	}
//method without argument return type

	
//	with string
	public static String love () {
		String joy="happy";
		String life="new ";
		String health= joy+life ;
		System.out.println(health);
		return health;
	
	}
	 
//	with integer
	public static int money () {
	int dance =20 ;
	int dance1=10;
	int spend =dance+dance1 ;
	return spend ;

	}
	
	
//	with while loop 
	public static int red () {
		int a =20;
		int b= 10;
		while (a>=20);
		int no = a+b;
		a--;
		return no ;
	}
		
		
//	with do while loop 
	public static int moon  () {
	     int dog = 30;
	        do {
	            System.out.println(" value of dog"+ dog);
	            dog--;
	        } while (dog>=20.);
	        return dog ;

	}
	        
//with object 
	        public static Object garden () {
	            int flower1 = 20;
	            String flower2 ="yes";
	            Object flower3 = flower1+flower2;
	            return flower3;
	            
	        }     
	            
//	create 4 return type  methods 
	            
//  create 1 dim object array --
	        
	   public static  Object []life(){
		   Object smile []={"luck",2 ,'s'};
		  return smile ; 
	   
	            
	   }             
        

//create 1 dim integer array --
public static int[] bank () {
int b[] ={10,20,30};
return b;
          
}    
	
//create 2 dim string array --
public static String [][] hope (){
String food [][]= {{"joyful","emily," ,"remy" },{"day","night","nice"}};
return food ;
}
	

//CREATE 2 OBJECT DIM ARRAY 
public static Object [][]adventure(){
	Object beach[][]= {{"sad","why","not"},{"sun","light","rainbow"}};
	return beach ;
}
		
		
		
}	
		
		
	
	
	




