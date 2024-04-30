package reyazul_Task2;

public class Class4_Task2_Method_with_arguments_non_return_type {

	public static void main(String[] args) {
		 // Call the methods with different data types
		riyu (" Love is ", " Everything in our life");
		
		israt (" I want small size", " hot coffee with 2 sugar and 3 milk ");
		reyaz ('T');
		suzy(45,20);
		taha (8.9f,3.2f);
		wow (10,30);
		
		
       
    }

    // Method with String input variable
	
	public static void riyu (String love , String life) {
		
		System.out.println(love +life);
		}
	// same 
		public static void israt (String milk, String coffee) {
			
			System.out.println( milk+coffee);
			}
		
		// with char 
		
		public static void reyaz (char kmnaco) {
			System.out.println(" The character will be: " +kmnaco );
		}
		
		//with double 
		public static void suzy (double moon1, double moon2) {
			double Moon = moon1*moon2;
			System.out.println( "Result: "+Moon);
		}
		
		// float 
		
		public static void taha (float dance, float joy) {
			System.out.println(" the value for folat will be: $" +dance/joy);
		}
		
		// if else 
		
		public static void wow (int de, int ce) {
			if (de > ce) {
				System.out.println("it will be greater than ");
			}else {
				System.out.println( "it gonna be equal to ");
			}
		}

}
