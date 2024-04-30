package Tahsin_Class_34and35_Tasks5to7;

public class Class_C {

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
	public Class_C() {
		System.out.println("Calling from Class_C");
	}
	
	// Access Modifiers
	public void Example4() {
		Object example4[] = {'m', "brown", 25, true};
		for(Object ex4:example4) {
			System.out.println(ex4);
		}
	}
	
	public void Example5() {
		String example5[][] = {{"red", "apple"}, {"yellow", "banana"}, {"purple", "grape"}};
		for(String[] ex5:example5) {
			for(String Ex5:ex5){
				System.out.println(Ex5);
			}
		}
	}
	
	public void Example6() {
		int a = 5;
		int b = 22;
		if (a<b) {
			System.out.println("The value is " + true);
		} else {
			System.out.println("The value is " + false);
		}
	}
	
	/* End */
}
