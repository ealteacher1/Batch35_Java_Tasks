package Tahsin_Nazmee_Java_Tasks;

public class Class_34and35_Task2 {

	public static void main(String[] args) {
		// Printing methods with arguments (non-return type)
		example1("The addition is ", 19.2, 5.7);
		example2("The subtraction is ", 7, 2);
		example3(91, 87, 94);
		example4("The multiplication is ", 32, 21);
		example5("The value of a is ", 5);
	}
	
	// Methods with arguments (non-return type)
	// Addition
	public static void example1(String Addition, double add1, double add2) {
		double addition = add1 + add2;
		System.out.println(Addition+addition);
	}
	
	// Subtraction
	public static void example2(String Subtraction, float sub1, float sub2) {
		float subtraction = sub1 - sub2;
		System.out.println(Subtraction+subtraction);
	}
	
	// If-Else
	public static void example3(int Computer, int Science, int Math) {
		int total = Computer + Science + Math;
		float avg = total / 3f;
		System.out.println("Total: " + total);
		System.out.println("Grade Average: " + avg);
		
		if (avg>=90 && avg<=100) {
			System.out.println("Student got grade A");
		} else if (avg>=80 && avg<=89) {
			System.out.println("Student got grade B");
		} else if (avg>=70 && avg<=79) {
			System.out.println("Student got grade C");
		} else if (avg>=60 && avg<=69) {
			System.out.println("Student got grade D");
		} else {
			System.out.println("Student got grade E");
		}		
	}
	
	// Multiplication
	public static void example4(String Multiplication, int multiply1, int multiply2) {
		int multiplication = multiply1 * multiply2;
		System.out.println(Multiplication+multiplication);
	}
	
	// Do-While Loop
	public static void example5(String A, int a) {
		do {
			System.out.println(A+a);
			a--;
		} while (a>0);
	}
	
	/* End */
}

