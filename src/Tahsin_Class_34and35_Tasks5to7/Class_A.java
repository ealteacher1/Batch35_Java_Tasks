package Tahsin_Class_34and35_Tasks5to7;

public class Class_A {

	public static void main(String[] args) {
		// Non-Static Method
		Class_A CallingFromA = new Class_A();
		CallingFromA.Example1();
		CallingFromA.Example2();
		CallingFromA.Example3();
		
		Class_C CallingFromC = new Class_C();
		CallingFromC.Example4();
		CallingFromC.Example5();
		CallingFromC.Example6();
	}

	// Constructor
	public Class_A() {
		System.out.println("Class 34 & 35 Task 5");
		System.out.println("Calling From Class_A");
	}
	
	//Access Modifiers
	public void Example1() {
		int example1[] = {1, 2, 3};
		for(int ex1:example1) {
			System.out.println(ex1);
		}
	}
	
	public void Example2() {
		Object example2[][] = {{3, "cats"}, {2, "girls"}, {1, "boy"}};
		for(Object[] ex2:example2) {
			for(Object Ex2:ex2) {
				System.out.println(Ex2);
			}
		}
	}
	
	public void Example3() {
		int day = 2;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
		}
	}
	
	/* End */
}
