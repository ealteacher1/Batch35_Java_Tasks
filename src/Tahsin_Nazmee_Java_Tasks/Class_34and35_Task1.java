package Tahsin_Nazmee_Java_Tasks;

public class Class_34and35_Task1 {

	public static void main(String[] args) {
		// Printing methods without arguments (non-return type)
		example1();
		example2();
		example3();
		example4();
		example5();
	}
	
	// Method without arguments (non-return type)
	// Addition
	public static void example1() {
		int add1 = 1000;
		int add2 = 500;
		int addition = add1 + add2;
		System.out.println(addition);
	}
	
	// Subtraction
	public static void example2() {
		int sub1 = 2500;
		int sub2 = 1500;
		int subtraction = sub1 - sub2;
		System.out.println(subtraction);
	}
	
	// If-Else Statement
	public static void example3() {
		String firstname = "Tahsin";
		String lastname = "Nazmee";
		
		if (firstname != lastname) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	// While Loop
	public static void example4() {
		int age = 25;
		String Age = "Age = ";
		
		while (age<=30) {
			System.out.println(Age+age);
			age++;
		}
	}
	
	// For Loop with Object Array
	public static void example5() {
		Object tahsin[] = {"Tahsin", 25, 'M'};
		System.out.println(tahsin.length);
		
		for (Object t:tahsin) {
			System.out.println(t);
		}
	}
	
	/* End */
}
