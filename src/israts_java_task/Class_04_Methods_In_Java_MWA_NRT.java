package israts_java_task;

public class Class_04_Methods_In_Java_MWA_NRT {

	public static void main(String[] args) {
		addition ();
		subtraction ();
		multification ();
		if_else();
		whileloop();
	}
	//Task-1-Printing Method Without Arguments -non return type -Task-1
		public static void addition() {
			int x=10;
			int y =20;
			System.out.println(x+y);
		}
	    public static void subtraction () {
	    	int a=10;
	    	int b=5;
	    	System.out.println(a-b);
	    }
	   public static void multification () {
		   float x=5.9f;
		   double y=69.96;
		   System.out.println(x*y);
	   }
	   public static void if_else () {
		   boolean x= true;
		   boolean y= false;
		   if(x=y) {
			   System.out.println(false);
		   }
			   else {
			 System.out.println(true);}
			   }
		  public static void whileloop () {
			  int a=10;
			  String Easy="Nice";
			  while (a>=5) {
				  System.out.println(a+Easy);
				  a--;
}
		  }
		  
}
