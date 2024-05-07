package METHODE;

public class Class_B {

	

	    public static void main(String[] args) {
	        Class_A obj = new Class_A();
	        // Call all methods from Class_A
	        int[][] twoDArray = obj.return2DArray();
	        System.out.println("2-dimensional array from Class_B:");
	        for (int[] row : twoDArray) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }

	        int[] oneDArray = obj.return1DArray();
	        System.out.println("1-dimensional array from Class_B:");
	        for (int num : oneDArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        int intValue = obj.returnInt();
	        System.out.println("Integer value from Class_B: " + intValue);

	        String stringValue = obj.returnString();
	        System.out.println("String value from Class_B: " + stringValue);

	        boolean boolValue = obj.returnBoolean();
	        System.out.println("Boolean value from Class_B: " + boolValue);
	    }
	}
