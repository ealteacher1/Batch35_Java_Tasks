package reyazul_Task2;

public class Class4_Task2_Method_with_arguments_non_return_type {

	public static void main(String[] args) {
		
		
		 // Call the methods with different data types
        printString("Hello, ");
        printChar('W');
        calculateDouble(3.5, 2.0);
        checkIfElse(5, 3);
        int result = addition(10, 20);
        System.out.println("Result of addition: " + result);
    }

    // Method with String input variable
    public static void Riyu (String message) {
    	
        System.out.println(message + "World!");
    }

    // Method with char input variable
    public static void printChar(char ch) {
        System.out.println("The character is: " + ch);
    }

    // Method with double input variables and calculation
    public static void calculateDouble(double a, double b) {
        double result = a * b;
        System.out.println("Result of multiplication: " + result);
    }

    // Method with int input variables and if-else condition
    public static void checkIfElse(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than or equal to " + a);
        }
    }

    // Method with int input variables and addition calculation
    public static int addition(int a, int b) {
        return a + b;
    }
}

	}
	
	// Method with arguments - non return type;
	
	
	
	

}
