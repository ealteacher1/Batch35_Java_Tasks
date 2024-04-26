package Tahsin_Nazmee_Java_Tasks;

public class Class_34and35_Task3 {

	public static void main(String[] args) {
		// Printing methods without arguments (return type)
		System.out.println(example1());
		System.out.println(example2());
		System.out.println(example3());
		System.out.println(example4());
		
		int Value = example5();
		while(Value<=10) {
			System.out.println("Value: "+Value);
			Value++;
		}
		
		Object[] Array1 = ArrayExample1();
		for(Object array1:Array1) {
			System.out.println(array1);
		}
		
		int[] Array2 = ArrayExample2();
		for(int array2:Array2) {
			System.out.println(array2);
		}
		
		String[][] Array3 = ArrayExample3();
		for(String[] array3:Array3) {
			for(String arr3:array3) {
				System.out.println(arr3);
			}
		}
		
		Object[][] Array4 = ArrayExample4();
		for(Object[] array4:Array4) {
			for(Object arr4:array4) {
				System.out.println(arr4);
			}
		}
		/* End of Main*/
	}
	
	// Methods without arguments (return)
	// Addition
	public static int example1() {
		int add1 = 15;
		int add2 = 72;
		int addition = add1 + add2;
		return addition;
	}
	
	// Subtraction
	public static int example2() {
		int sub1 = 52;
		int sub2 = 14;
		int subtraction = sub1 - sub2;
		return subtraction;
	}
	
	// Concatenation with String
	public static String example3() {
		String s1 = "Tahsin ";
		String s2 = "Nazmee";
		String s3 = s1 + s2;
		return s3;
	}
	
	// Concatenation with Object
	public static Object example4() {
		int count = 25;
		String diamonds = " diamonds";
		Object diamond25 = count + diamonds;
		return diamond25;
	}
	
	// While Loop
	public static int example5() {	
		int value = 6;
		return value;
	}
	
	// One-Dimensional Object Array 
	public static Object[] ArrayExample1() {
		Object arrayExample1[] = {3, "cats", "black", "white", "orange", true};
		return arrayExample1;
	}
	
	// One-Dimensional Integer Array
	public static int[] ArrayExample2() {
		int arrayExample2[] = {1, 2, 3};
		return arrayExample2;
	}
	
	// Two-Dimensional String Array
	public static String[][] ArrayExample3() {
		String arrayExample3[][] = {{"vegetable", "carrot"}, {"fruit", "mango"}};
		return arrayExample3;
	}
	
	// Two-Dimensional Object Array
	public static Object[][] ArrayExample4(){
		Object arrayExample4[][] = {{11, "students"}, {4, "males"}, {7, "females"}};
		return arrayExample4;
	}

	/* End of Methods*/
}
