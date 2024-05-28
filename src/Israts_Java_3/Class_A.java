package Israts_Java_3;

public class Class_A {

	public static void main(String[] args) {
		Class_A c=new Class_A ();
		c.profit();
		Class_A d = new Class_A ();
		d.totalexpense();
		Class_A e = new Class_A ();
		e.a(10, 15);
		Class_A e1 = new Class_A ();
		e1.a1(10, " bucks $ ");
		Class_A e3 = new Class_A ();
		e3.s3("Blue", " Sky ");
		
		int abc=ab(50,30);
		System.out.println("printing out first private method with arguments  : " +abc);
         
		float attractive = fun(3.9f, 1.2f);
	    System.out.println("The value of float attractive : " + attractive);
		
		String lovesong=  sing ();
		 System.out.println(lovesong);
	}
	
	//ENCAPSULATION....
	
	//1ST METHOD.
	private void profit () {
		int income =5000;
		int expense = 2000;
		int profit=income-expense ;
        System.out.println("First private method :"+profit);
        
		
	}
    public void net_profit() {
     profit();
     }
     
   //2nd private method ..
     private void totalexpense () {
 		int shopping  =5000;
 		int traveling = 2000;
 		int total= shopping+traveling ;
        System.out.println("Second private method :"+total);
      }
     public void profit1 () {
    	 totalexpense();
     }
   //3rd Private method with input parameter..
     private void a (int x,int y) {
    	 int x1=10;
    	 int y1=20;
    	 int z=x1*y1;
    	 System.out.println("Third private method :"+z);
     }
     public void z1 () {
    	 a(10,15);
     }
   // 4rth private method with input parameter....
     private void a1 (int x,String y) {
    	 int x2=10;
    	 String s= " bucks $";
    	 Object o= x2 + s;
    	 System.out.println("Fourth private method : " + o);
     }
     public void a2 () {
    	 a1(10,"bucks");
     }
   //5th private method with input parameter....
     private void s3 (String x,String y) {
    	 String x2="Blue";
    	 String s= " Sky ";
    	 String s1= x2 + s;
    	 System.out.println("Fifth private method : " + s1);
     }
     public void s2() {
    	 s3("Blue","Sky ");
     }
     
    // Creating private static  method with return type ..
     
     private static int ab (int a,int b) {
    	 int a1=50;
    	 int b1=30;
    	 int c1=a1-b1;
    	 return c1;
     }
     
     private  static float fun(float pretty, float pleasing) {
 		float attractive = pretty - pleasing;
 		return attractive;
    }
     private  static String sing () {
			String lyrics1 = "Thinking out ";
			String lyrics2 =" loud";
			String lyrics3= lyrics1 + lyrics2;
			return lyrics3;	
    	 	
     }
     public void si () {
    	 ab(10,15);
 		System.out.println("printing out first private method with arguments  ");

    	 fun(10.50f,15.5f);
 	    System.out.println("printing out second private method with arguments  " );
 	    
 	    sing();
		 System.out.println("printing out third private method with arguments");

    	 
     }
} 
