package METHODE;

public class Methode_with_out_arguement_non_return {

	public static void main(String[] args) {
		
		
		addition();
		subtraction(5.0,2.0);
		checkrimaOrisraa(9);
		 printtexte("i love mum");
		 multiplication(5.0f, 2.0f);
		
	}
	
		    // Method 1: Addition
		    public static void addition() {
		        int a =5;
		        int b=2;
		        System.out.println(a+b);
		       
		        
		    }
		    
		    // Method 2: Subtraction
		    public static void subtraction(double a, double b) {
		        double result = a - b;
		        System.out.println("Subtraction result: " + result);
		    }
		    
		 // Method 3: If-else statement
		    public static void checkrimaOrisraa(int number) {
		        if (number % 2 == 0) {
		            System.out.println(number + " is rima.");
		        } else {
		            System.out.println(number+ " is israa.");
		        }
		    }
		    
		    // Method 4: Print statement
		    public static void printtexte(String texte) {
		        System.out.println("texte: " + texte);
		    }
		    
		 // Method 5: Multiplication
		    public static void multiplication(float a, float b) {
		        float result = a * b;
		        System.out.println("Multiplication result: " + result);
		    }
}
		

