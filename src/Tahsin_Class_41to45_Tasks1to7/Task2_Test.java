package Tahsin_Class_41to45_Tasks1to7;

public class Task2_Test extends Task2_C3{

	public static void main(String[] args) {
		Task2_C3 ob = new Task2_C3();
		
		// Calling Child Class
		System.out.println(C3);
		ob.childA();
		ob.childB();
		ob.childC();
		
		// Calling Parent Class
		System.out.println(ob.C2);
		ob.parentA();
		ob.parentB();
		ob.parentC();
		
		// Calling Grandparent Class
		System.out.println(C1);
		ob.grandparentA();
		ob.grandparentB();
		ob.grandparentC();
		
		// Override
		ob.A();
		ob.B();
		ob.C();
		ob.D();
		ob.E();
	}

}
