package METHODE;

public class Method_with_out_arguemeny_return_type {

	public static void main(String[] args) {
		 // Call the methods and print the returned values
        System.out.println("Addition result: " + addition());
        System.out.println("Division result: " + division());
        System.out.println("Is 15 Rima? " + isRima());
        System.out.println("First character: " + getFirstChar());
        System.out.println("Concatenated string: " + concatenate());

	}
	
	// Method 1: Return integer value (addition)
    public static int addition() {
        int a = 20;
        int b = 3;
        return a + b;
    }

    // Method 2: Return double value (division)
    public static double division() {
        double dividend = 55.0;
        double divisor =4.0;
        return dividend / divisor;
    }
    
    // Method 3: Return boolean value (check if a number is Rima)
    public static boolean isRima() {
        int number = 15;
        return number % 2 == 0;
    }
    
    // Method 4: Return character value
    public static char getFirstChar() {
        String text = "Israa";
        return text.charAt(0);
    }
    
 // Method 5: Return string value (concatenate)
    public static String concatenate() {
        String str1 = "love, ";
        String str2 = "mum!";
        return str1 + str2;
    }
}
