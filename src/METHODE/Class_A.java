package METHODE;

public class Class_A {

	 public static void main(String[] args) {
	        Class_A obj = new Class_A();
	        // Call all newly created methods and print their return values
	        int[][] twoDArray = obj.return2DArray();
	        System.out.println("2-dimensional array:");
	        for (int[] row : twoDArray) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }

	        int[] oneDArray = obj.return1DArray();
	        System.out.println("1-dimensional array:");
	        for (int num : oneDArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        int intValue = obj.returnInt();
	        System.out.println("Integer value: " + intValue);

	        String stringValue = obj.returnString();
	        System.out.println("String value: " + stringValue);

	        boolean boolValue = obj.returnBoolean();
	        System.out.println("Boolean value: " + boolValue);
	    }
	// Non-static method returning a 2-dimensional array
    public int[][] return2DArray() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        return array;
    }

    // Non-static method returning a 1-dimensional array
    public int[] return1DArray() {
        int[] array = {1, 2, 3, 4, 5};
        return array;
    }

    // Non-static method returning an integer
    public int returnInt() {
        return 5;
    }

    // Non-static method returning a string
    public String returnString() {
        return "love, daughter!";
    }

    // Non-static method returning a boolean
    public boolean returnBoolean() {
        return true;
    }

    
   
}


