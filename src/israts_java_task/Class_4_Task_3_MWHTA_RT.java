package israts_java_task;

public class Class_4_Task_3_MWHTA_RT {

	public static void main(String[] args) {
		String lovesong=  sing ();
		 System.out.println(lovesong);
		 int profitgain =monthlysalary();
		 System.out.println(profitgain);
		 int shore =sea(); 		 
     	System.out.println( shore);
     	Object freestyle = dance ();
     	System.out.println(freestyle);
     	float flower= f();
     	System.out.println(flower);
     	Object [] laugh = Smile();
     	 for (Object a:laugh) {
     		 System.out.println(a);
     		 int [] c =cat ();
     		 for (Object d:c) {
     			 System.out.println(d);
     			 String [][] happy = Celebration ();
     			 for (String joy[]:happy) {
     				 for (String chuckle :joy) {
					System.out.println (chuckle);
     			 }
     			Object snigger [][] = giggle();
     			for (Object guffaw []:snigger) {
     				for (Object titter:guffaw) {
     					System.out.println(titter);
     				}
     			}
     			 }
     		 }
     	 }
     	 
     
     	
	        }
	
//Task_3 
// Method without 	arguments -Return type --
	
//string 
		public static String sing () {
			String lyrics1 = "Thinking out ";
			String lyrics2 =" loud";
			String lyrics3= lyrics1 + lyrics2;
			System.out.println(lyrics3);
			return lyrics3;	
		}
		
//with int (subtraction)-
    public static int monthlysalary() {
    	int income = 5000;
    	int expense = 1000;
    	int profit =income-expense;
    	return profit ;
    }
//with while-loop -
    public static int sea () {
        int shore= 50;
        while (shore<=100) {
        	System.out.println("Yes"+ shore);
 	       shore++ ;		 
        }
        
        return shore;
        }  
// with object 
    public static Object dance () {
      int  under  = 55;
      String stars = "full of stars ";
      Object freestyle = under+stars ;
      System.out.println(freestyle);
      return freestyle;
    }
// with do while loop
    public static  float f () {
        float flower= 35.50f;
        do {
            System.out.println(" value for f: "+flower);
            flower--;
        }
        while (flower>=30.50);
         return flower;
       }
//Task-2_4 Types of Methods without arguments ( 1-dim object array,1 dim int array,2 dim array,2 dim object array)-
//1 Dim_Object array 
    
    public static Object [] Smile ( ) {
    	Object  laugh []= { "Beautiful",40,'c'};
    	
    	return laugh;
    	
    }
// 1 dim int array -
    public static int [] cat () {
    	int c [] = {50,20,10};
    	return c;
    }
// 2 dim string array-
    public static String [][] Celebration () {
    	String happy [][]= {{"Eid ", "Is The "},{ " Biggest Religious Celebration "}};
    	return happy;
    	
    }
// 2 dim object array -
    public static Object [] [] giggle () {
    	Object snigger [] [] = {{"Howl",55,'g'},{"Roar of Lauhgter",95.30, 66}};
    	return snigger ;
    }
    

}

