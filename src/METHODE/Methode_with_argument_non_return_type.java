package METHODE;

public class Methode_with_argument_non_return_type {

	public static void main(String[] args) {
		
		concatenateStrings("i love, ", "Dad");
		 checkVowelOrConsonant('c');
		 calculateCircleArea(6.0);
		 checkNumberType(56);
		  celsiusToFahrenheit(40.0);
		

	}
	// Method 1: Concatenate two strings
    public static void concatenateStrings(String str1, String str2) {
        String result = str1 + str2;
        System.out.println("Concatenated String: " + result);
    }
    
    // Method 2: Check if a character is a vowel or consonant
    public static void checkVowelOrConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
    
    // Method 3: Calculate the area of a circle
    public static void calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
    
    // Method 4: Check if a number is positive, negative, or zero
    public static void checkNumberType(double num) {
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }
    }
 // Method 5: Convert temperature from Celsius to Fahrenheit
    public static void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
