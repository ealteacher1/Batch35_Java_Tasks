package Tahsin_Class_34and35_Tasks5to7;

import Tahsin_Nazmee_Java_Tasks.ClassAM_2;

public class Class_Y {

	public static void main(String[] args) {
		// Calling Static and Non-Static Methods
		Class_X CallingFromX = new Class_X();
		Class_X.Example1();
		CallingFromX.Example2();
		CallingFromX.Example3();
		
		Class_Y CallingFromY = new Class_Y();
		Example4();
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
	public static void Example4() {
		int num1 = 33;
		int num2 = 3;
		int divide = num1 / num2;
		System.out.println(divide);
	}
	
	// Non-Static
	public void Example5() {
		Object pets[][] = {{3, "cats"}, {0,"dog"}};
		for (Object[] petsArray:pets) {
			for (Object Pets:petsArray) {
				System.out.println(Pets);
			}
		}
	}
	
	// Non-Static
	public void Example6() {
		int value = 7;
		do {
			System.out.println("The value is " + value);
			value--;
		} while(value>=4);
	}
	
	/* End */
}
