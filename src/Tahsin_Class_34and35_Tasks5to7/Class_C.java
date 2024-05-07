package Tahsin_Class_34and35_Tasks5to7;

public class Class_C {

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
	public Class_C() {
		System.out.println("Calling from Class_C");
	}
	
	// Access Modifiers
	// Integer One-Dimensional Array
	public void Example7() {
		int example7[] = {4, 5, 6};
		for (int ex7:example7) {
			System.out.println(ex7);
		}
	}
	
	// String One-Dimensional Array
	public void Example8() {
		String example8[] = {"Group Members", "Reyazul", "Israt", "Suzy", "Tahsin"};
		for (String ex8:example8) {
			System.out.println(ex8);
		}
	}
	
	// Object One-Dimensional Array
	public void Example9() {
		Object example9[] = {2, "males", 2, "females", true};
		for(Object ex9:example9) {
			System.out.println(ex9);
		}
	}
	
	// Integer Two-Dimensional Array
	public void Example10() {
		int example10[][] = {{5, 25}, {6, 36}};
		for (int[] ex10:example10) {
			for (int Ex10:ex10) {
				System.out.println(Ex10);
			}
		}
	}
	
	// String Two-Dimensional Array
	public void Example11() {
		String example11[][] = {{"red", "apple"}, {"yellow", "banana"}, {"purple", "grape"}};
		for(String[] ex11:example11) {
			for(String Ex11:ex11){
				System.out.println(Ex11);
			}
		}
	}
	
	// Object Two-Dimensional Array
	public void Example12() {
		Object example12[][] = {{3, "Hobbies"}, {"Basketball", true}, {"Working Out", true}, {"Soccer", false}};
		for (Object[] ex12:example12) {
			for (Object Ex12:ex12) {
				System.out.println(Ex12);
			}
		}
	}
	
	/* End */
}
