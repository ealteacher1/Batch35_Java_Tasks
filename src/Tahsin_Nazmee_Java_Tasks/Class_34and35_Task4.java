package Tahsin_Nazmee_Java_Tasks;

public class Class_34and35_Task4 {

	public static void main(String[] args) {
		// Printing methods with arguments (return type)
		System.out.println(example1(15, 13));
		System.out.println(example2(38.6, 25.8));
		System.out.println(example3(24, 9));
		System.out.println(example4("Tahsin ", 'M', ". Nazmee"));
		System.out.println(example5(91, 83, 97));
		
		Object[] Array1 = ArrayExample1(1);
		Array1[0] = 4;
		Array1[1] = "males";
		Array1[2] = 7;
		Array1[3] = "females";
		Array1[4] = true;
		for(Object array1:Array1) {
			System.out.println(array1);
		}
		
		int[] Array2 = ArrayExample2(2);
		Array2[0] = 1;
		Array2[2] = 3;
		for(int array2:Array2) {
			System.out.println(array2);
		}
		
		String[][] Array3 = ArrayExample3("animals");
		Array3[0][0] = "cat";
		Array3[0][1] = "dog";
		Array3[1][0] = "tiger";
		Array3[1][1] = "wolf"; 
		for(String[] array3:Array3) {
			for(String arr3:array3) {
				System.out.println(arr3);
			}
		}
		
		Object[][] Array4 = ArrayExample4(4);
		Array4[0][0] = 2005;
		Array4[0][1] = "basketball";
		Array4[1][0] = 2007;
		Array4[1][1] = "soccer";
		Array4[2][0] = 2010;
		Array4[2][1] = "football";
		for(Object[] array4:Array4) {
			for(Object arr4:array4) {
				System.out.println(arr4);
			}
		}
		
		/* End of Main */
	}
	
	// Methods with arguments (return type)
	// Addition
	public static int example1(int add1, int add2) {
		int addition = add1 + add2;
		return addition;
	}
	
	// Subtraction
	public static double example2(double sub1, double sub2) {
		double subtraction = sub1 - sub2;
		return subtraction;
	}
	
	// Remainder
	public static float example3(int rem1, int rem2) {
		float remainder = rem1 % rem2;
		return remainder;
	}
	
	// Concatenate with String
	public static String example4(String first, char middle, String last) {
		String initials = first + middle + last;
		return initials;
	}
	
	// Calculating grade with If-Else Statement
	public static float example5(int Math, int Science, int English) {
		int total = Math + Science + English;
		float avg = total / 3;
		
		if (avg>=90 && avg<=100) {
			System.out.println("Grade A");
		} else if (avg>=80 && avg<=89) {
			System.out.println("Grade B");
		} else if (avg>=70 && avg<=79) {
			System.out.println("Grade C");
		} else if (avg>=60 && avg<=69) {
			System.out.println("Grade D");
		} else {
			System.out.println("Grade E");
		}
		return avg;
	}
	
	// One-Dimensional Object Array
	public static Object[] ArrayExample1(Object a) { 
		Object arrayExample1[] = new Object[5];
		return arrayExample1;
	}
	
	// One-Dimensional Integer Array
	public static int[] ArrayExample2(int b) {
		int numbers[] = new int[3];
		return numbers;
	}
	
	// Two-Dimensional String Array
	public static String[][] ArrayExample3(String c) {
		String animals[][] = new String[2][2];
		return animals;
	}
	
	// Two-Dimensional Object Array
	public static Object[][] ArrayExample4(Object d) {
		Object sports[][] = new Object[3][2];
		return sports;
	}
	
	/* End of Methods */
}
