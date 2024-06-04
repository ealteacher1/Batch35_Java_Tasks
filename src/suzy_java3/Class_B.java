package suzy_java3;

public class Class_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//	Calling private  methods from class A --
		
		
		Class_A ob = new Class_A() ;
		ob.lifetime();
		
		Class_A ob1 = new Class_A ();
		ob.weekdays() ;
		
		Class_A ob2= new Class_A ();
		ob2.sun();
		
		
//		calling private methods with input arguments from class A --
		Class_A ob3 =new Class_A ();
		ob3.boy();
		
		Class_A ob4 =new Class_A ();
		ob4.bus();
		

//		calling private method with return type --
		
		int s1= (20);
		System.out.println("int s1 is returning :20 ");
		
		
		String c = "happy";
		System.out.println("this methos is returning :happy ");
		
		
		String kids ="joy ";
		System.out.println("the kids bring out : joy");
		
	}
}
	
				

		

		
	


