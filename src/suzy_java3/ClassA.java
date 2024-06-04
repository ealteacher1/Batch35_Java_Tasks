package suzy_java3;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	Calling private methods --
		ClassA ob = new ClassA() ;
		ob.life();
		
		ClassA ob1 = new ClassA ();
		ob.days();
		
		ClassA ob2= new ClassA ();
		ob2.summer();
		
//		calling private methods with input arguments --
		
		ClassA ob3 =new ClassA ();
		ob3.boy();
		
		ClassA ob4 =new ClassA ();
		ob4.bus();
		
		int s1= (20);
		System.out.println("int s1 is returning :20 ");
		
		String c = "happy";
		System.out.println("this method is returning :happy ");
		
		String kids ="joy ";
		System.out.println("the kids bring out : joy");
		
		
	}
// Create 3 private methods --
	
// USING ENCAPSULATION  --
	
//	method 1 --
	
	
	private static void life () {
		System.out.println( "life");
	}
	public void lifetime() {
		life() ;
		
		
	}
//	method 2 --
	private static void days () {
		System.out.println("daya of the week ");
	}
	public void weekdays () {
		days();
	}
	

	
//	method 3--
	
	
	private static void summer () {
		System.out.println("summer vibes ");
	
	}
	
	public void sun () {
		summer();

	}
// create 2 private methods with input parameters --
	
//first method --
	private void garden (int a) {
		int x =5;
		System.out.println("the value int d  is :5 ");
	}
	public void boy () {
	garden (5);
}

// second method --
private void car (String a) {
	String t = "blue ";
	System.out.println("the color of the car is : blue ");
}
public void bus () {
	car("blue");
}

//Create 3 private methods with return type --
private static  int s (int g) {
	int s1 = 5;
	return s1 ;
}
	
private static String happy () {
	String c = "joy";
	return c; 
}
private static String house () {
	String j = "Remy";
	String k ="Emily";
	String kids  = j+k;
	return kids ;

}


}

	
	
	





	
	
	
		








