package METHODE;

public class Class_C {

	// Method to call all non-static methods from Class_A
    public void callingFromC() {
        Class_A obj = new Class_A();
        int[][] twoDArray = obj.return2DArray();
        System.out.println("2-dimensional array from Class_C:");
        for (int[] row : twoDArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int[] oneDArray = obj.return1DArray();
        System.out.println("1-dimensional array from Class_C:");
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int intValue = obj.returnInt();
        System.out.println("Integer value from Class_C: " + intValue);

        String stringValue = obj.returnString();
        System.out.println("String value from Class_C: " + stringValue);

        boolean boolValue = obj.returnBoolean();
        System.out.println("Boolean value from Class_C: " + boolValue);
    }

    public static void main(String[] args) {
        Class_C obj = new Class_C();
        obj.callingFromC();
    }
}
