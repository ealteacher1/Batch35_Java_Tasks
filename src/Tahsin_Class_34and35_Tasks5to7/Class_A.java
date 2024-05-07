package Tahsin_Class_34and35_Tasks5to7;

public class Class_A {

	public static void main(String[] args) {
		// Calling Non-Static Methods
		Class_A CallingFromA = new Class_A();
		CallingFromA.Example1();
		CallingFromA.Example2();
		CallingFromA.Example3();
		CallingFromA.Example4();
		CallingFromA.Example5();
		CallingFromA.Example6();
		
		Class_C CallingFromC = new Class_C();
		CallingFromC.Example7();
		CallingFromC.Example8();
		CallingFromC.Example9();
		CallingFromC.Example10();
		CallingFromC.Example11();
		CallingFromC.Example12();
	}

	// Constructor
	public Class_A() {
		System.out.println("Class 34 & 35 Task 5");
		System.out.println("Calling From Class_A");
	}
	
	//Access Modifiers
	// Integer One-Dimensional Array
	public void Example1() {
		int example1[] = {1, 2, 3};
		for(int ex1:example1) {
			System.out.println(ex1);
		}
	}
	
	// String One-Dimensional Array
	public void Example2() {
		String example2[] = {"Doc", "Bala", "Layla"};
		for (String ex2:example2) {
			System.out.println(ex2);
		}
	}
	
	// Object One-Dimensional Array
	public void Example3() {
		Object example3[] = {"Age", 25, true};
		for (Object ex3:example3) {
			System.out.println(ex3);
		}
	}
	
	// Integer Two-Dimensional Array
	public void Example4() {
		int example4[][] = {{3, 9}, {4, 16}};
		for (int[] ex4:example4) {
			for(int Ex4:ex4) {
				System.out.println(Ex4);
			}
		}
	}
	
	// String Two-Dimensional Array
	public void Example5() {
		String example5[][] = {{"male", "Tahsin"}, {"female", "Nishat"}};
		for (String[] ex5:example5) {
			for (String Ex5:ex5) {
				System.out.println(Ex5);
			}
		}
	}
	
	// Object Two-Dimensional Array
	public void Example6() {
		Object example6[][] = {{3, "cats"}, {2, "girls"}, {1, "boy"}};
		for(Object[] ex6:example6) {
			for(Object Ex6:ex6) {
				System.out.println(Ex6);
			}
		}
	}
	
	/* End */
}
