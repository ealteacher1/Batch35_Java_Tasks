package suzy_java3;

public class Class_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//	Calling private  methods from class A --
		
		
		ClassA ob = new ClassA() ;
		ob.lifetime();
		
		ClassA ob1 = new ClassA ();
		ob.weekdays() ;
		
		ClassA ob2= new ClassA ();
		ob2.sun();
		
		
//		calling private methods with input arguments from class A --
		ClassA ob3 =new ClassA ();
		ob3.boy();
		
		ClassA ob4 =new ClassA ();
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
	
				

		

		
	


