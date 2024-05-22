package Tahsin_Class_37to40_Tasks1to5;

public class Task3_A {

	public static void main(String[] args) {
		// Task 3
		// Encapsulation
	}
	
	// Private
	private void example1() {
		System.out.println("Example 1");
	}
	
	private void example2() {
		System.out.println("Example 2");
	}
	
	private void example3() {
		System.out.println("Example 3");
	}
	
	private void example4(int a, int b) {
		int c = a + b;
		System.out.println("Example 4: " + c);
	}
	
	private void example5(String first, String last) {
		String fullname = first + last;
		System.out.println("Example 5: " + fullname);
	}
	
	private Object example6() {
		String example = "Example ";
		int number = 6;
		Object exNum = example + number;
		return exNum;
	}
	
	private int example7() {
		int a = 9;
		int b = 8;
		int c = a * b;
		return c;
	}
	
	private String example8() {
		String petType = "Cat";
		String petColor = "Black Stripes ";
		String pet = petColor + petType;
		return pet;
	}
	
	// Public
	public void CallingPrivate() {
		example1();
		example2();
		example3();
		example4(13, 27);
		example5("Tahsin ", "Nazmee");
		System.out.println(example6());
		System.out.println("Example 7: " + example7());
		System.out.println("Example 8: " + example8());
	}

}
