package Israts_Java_3;
//TASK-4 QUESTIONS 
		/* 1)Where we create Local Variable?
		 * Answer: Inside Method 
		   2)What is the difference between local NS variable and Global NS Variables?
		   Answer :
		   3)Which Variables copy will be given to Object? NS/STatic/LocalNS?
		   Answer: NS variable 
		   4)Can we create local variable as Static? 
		   Answer: No
		   */
public class Task_4 {
	
	int a= 100;
	String b= " Product being developed for the market in the fraction of price which is  ";
	float c= 14.99f;
	String d= "customer love the product and the price and its ";
	boolean e= true;
	 // Class type NS variable 
	Task_4 f;
	Task_4 g;
	
	


	public static void main(String[] args) {
		Task_4 changing = new Task_4 ();
		changing.change();
		
		
		// Calling class type non-static variable in static method 
		 Task_4 callns=new Task_4 () ;
		   callns.classtype(callns);
		   callns.classtype1(new Task_4 ());

		

	}
	public static void change () {
		Task_4 changing = new Task_4 ();
		changing.a=90;
		String b= " Product being developed successfully and customer loved the  price which is  ";
		float c= 10.99f;
		String d= "customer love the product and the price and its ";
		boolean e= true;
		System.out.println(changing.a);
		System.out.println(changing.b);
		System.out.println(changing.c);
		System.out.println(changing.d);
		System.out.println(changing.e);
  
	}
	
	// Class type non static variable 
    public void classtype ( Task_4 f) {
    	System.out.println(f);
    }
    public void classtype1 ( Task_4 g) {
    	System.out.println(g);
    }
}
