package suzy_java3;

public class Suzy_task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		create 5 non static global variables with value and change their value in static method in the same class --
		int age =10;
		String life ="happy ";
		boolean x=true;
		double a=4.5 ;
		float f= 0.2f;
	}

	int age;
	Object life;
	boolean x;
	double a;
	float t;
			
//	change the value in static method --
	
	public static void changevalue () {
		Suzy_task4 changevalue =new Suzy_task4 (); 
		changevalue.age =20;
	System.out.println("change of age ");

	Suzy_task4 ob1 =new Suzy_task4 ();
 		ob1.life ="unhappy";
 		System.out.println("happy life");

 		Suzy_task4 ob =new Suzy_task4 ();
 		ob.x= false;
		System.out.println("true");
 		
 		Suzy_task4 ob2 =new Suzy_task4 ();
 		ob2.a = 4.6;
 		System.out.println("the value is ");
 		
 		Suzy_task4 ob3=new Suzy_task4 ();
 		ob3.t=0.1f;
 		System.out.println("the value is ");
 	}
	
	
//	Create 2 class type non static variable --
		public void classtype1 () {
			System.out.println("1");
		}
		public void classtype2 () {	
			System.out.println("2");
				
//			calling ns variable --
			Suzy_task4 jojo =new Suzy_task4 ();
			jojo.classtype1();
			
			Suzy_task4 love = new Suzy_task4();
			love.classtype2();
		
		
			
		
		}	
		
		
		
		
		
		
	


	
			
			
		}
		

	


