package Tahsin_Class_34and35_Tasks5to7;

import Tahsin_Nazmee_Java_Tasks.ClassAM_2;

public class Class_X {

	public static void main(String[] args) {
		// Calling Static and Non-Static Methods
		Example1();
		Example2(2);
		System.out.println(Example3());
		System.out.println(Example4(55, 10));
		
		Class_X CallingFromX = new Class_X();
		CallingFromX.Example5();
		CallingFromX.Example6(32, 17);
		System.out.println(CallingFromX.Example7());
		System.out.println(CallingFromX.Example8(44, 11));
		CallingFromX.Example9();
		CallingFromX.Example10(15);
		int example11[] = CallingFromX.Example11();
		for (int ex11:example11) {
			System.out.println(ex11);
		}
		System.out.println(CallingFromX.Example12("orange ", "mango"));
		
		// Calling From Different Class
		ClassAM_1.PublicStatic();
		ClassAM_1.ProtectedStatic();
		ClassAM_1.DefaultStatic();
		
		// Calling From Different Package
		ClassAM_2 CallingFromAM_2 = new ClassAM_2();
		CallingFromAM_2.PublicNonstatic();
	}
	
	// Access Modifiers
	// Static (Without Arguments, Non-Return Type)
	public static void Example1() {
		int num1 = 12;
		int num2 = 7;
		int multiply = num1 * num2;
		System.out.println(multiply);
	}
	
	// Static (With Arguments, Non-Return Type)
	public static void Example2(int a) {
		String names[] = {"Tahsin", "Reyazul", "Israt", "Suzy"};
		for (String Names:names) {
			System.out.println(Names);
		}
	}
	
	// Static (Without Arguments, Return Type)
	public static int Example3() {
		int add1 = 10;
		int add2 = 5;
		int addition = add1 + add2;
		return addition;
	}
	
	// Static (With Arguments, Return Type)
	public static int Example4(int sub1, int sub2) {
		int subtraction = sub1 - sub2;
		return subtraction;
	}
	
	// Non-Static (Without Arguments, Non-Return Type)
	public void Example5() {
		Object pets[][] = {{3, "cats"}, {0,"dog"}};
		for (Object[] petsArray:pets) {
			for (Object Pets:petsArray) {
				System.out.println(Pets);
			}
		}
	}
	
	// Non-Static (With Arguments, Non-Return Type)
	public void Example6(int add1, int add2) {
		int addition = add1 + add2;
		System.out.println(addition);
	}
	
	// Non-Static (Without Arguments, Return Type)
	public String Example7() {
		String first = "Tahsin ";
		String last = "Nazmee";
		String full = first + last;
		return full;
	}
	
	// Non-Static (With Arguments, Return Type)
	public int Example8(int div1, int div2) {
		int divide = div1 / div2;
		return divide;
	}
	
	// Non-Static (Without Arguments, Non-Return Type)
	public void Example9() {
		String details[][] = {{"black", "hair"}, {"brown", "eyes"}};
		for (String[] detailsArray:details) {
			for (String Array:detailsArray) {
				System.out.println(Array);
			}
		}
	}
	
	// Non-Static (With Arguments, Non-Return Type)
	public void Example10(int num) {
		if (num>=12) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	// Non-Static (Without Arguments, Return Type)
	public int[] Example11() {
		int numbers[] = {1, 2, 3};
		return numbers;
	}
	
	// Non-Static (With Arguments, Return Type)
	public String Example12(String color, String fruit) {
		String detail = color + fruit;
		return detail;
	}
	
	/* End */
}
