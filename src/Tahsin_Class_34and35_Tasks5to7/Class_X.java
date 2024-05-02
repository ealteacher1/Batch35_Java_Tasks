package Tahsin_Class_34and35_Tasks5to7;

import Tahsin_Nazmee_Java_Tasks.ClassAM_2;

public class Class_X {

	public static void main(String[] args) {
		// Calling Static and Non-Static Methods
		Class_X CallingFromX = new Class_X();
		Example1();
		CallingFromX.Example2();
		CallingFromX.Example3();
		
		Class_Y CallingFromY = new Class_Y();
		Class_Y.Example4();
		CallingFromY.Example5();
		CallingFromY.Example6();
		
		ClassAM_1.PublicStatic();
		ClassAM_1.ProtectedStatic();
		ClassAM_1.DefaultStatic();
		
		ClassAM_2 CallingFromAM_2 = new ClassAM_2();
		CallingFromAM_2.PublicNonstatic();
	}
	
	// Access Modifiers
	// Static
	public static void Example1() {
		int num1 = 12;
		int num2 = 7;
		int multiply = num1 * num2;
		System.out.println(multiply);
	}
	
	// Non-Static
	public void Example2() {
		String names[] = {"Tahsin", "Reyazul", "Israt", "Suzy"};
		for (String Names:names) {
			System.out.println(Names);
		}
	}
	
	// Non-Static
	public void Example3() {
		int ten = 10;
		int five = 5;
		if (ten>five) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	/* End */
}
