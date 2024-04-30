package israts_java_task;

public class Class_4_Methods_MWA_NRT {

	public static void main(String[] args) {
         dance("Dancing like a free bird ", "in style" );
         hi('H');
         hightime (59.20,12.30);
         Umbrella(10,30);
         Lowtime( 15.5f,5.5f);
	}
//Task-2-
//Method With Arguments -Non Return Type 
//with string	
	public static void dance (String free,String style ) {
		System.out.println(free+style );
	}
//with char	
	public static void hi (char laugh ) {
		System.out.println("The Character will be = "+ laugh);
	}
	
//with double 
	public static void hightime (double Double  ,double dine ) {
		double eat=Double+dine;
		System.out.println(eat +" is going to cost us for double dine  " );
	}
//with if -else
     public static void Umbrella (int a,int b)	{
    	 if (a>=b) {
    		 System.out.println("life"+a);
    	 }
    	 else {
    		 System.out.println("Life is beautiful ");
    	 }
    	 }
//with double 
 	public static void Lowtime (float game   ,float zone  ) {
 	
 		System.out.println(game*zone);
     }
}


