package METHODE;

public class Return_type_2 {

	public static void main(String[] args) {
		 // Method 1: Return 1-dimensional object array
        Object[] objArray = return1DimObjectArray();
        System.out.println("1-dimensional Object array:");
        for (Object obj : objArray) {
            System.out.print(obj + " ");
        }
        System.out.println();
        
        // Method 2: Return 1-dimensional integer array
        int[] intArray = return1DimIntArray();
        System.out.println("1-dimensional Integer array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Method 3: Return 2-dimensional string array
        String[][] stringArray = return2DimStringArray();
        System.out.println("2-dimensional String array:");
        for (String[] row : stringArray) {
            for (String str : row) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
        
        // Method 4: Return 2-dimensional object array
        Object[][] obj2DArray = return2DimObjectArray();
        System.out.println("2-dimensional Object array:");
        for (Object[] row : obj2DArray) {
            for (Object obj : row) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }
    }


	// Method 1: Return 1-dimensional object array
    public static Object[] return1DimObjectArray() {
        Object[] array = {5, "false", 6.0, true};
        return array;
    }
    
 // Method 2: Return 1-dimensional integer array
    public static int[] return1DimIntArray() {
        int[] array = {0, 2, 3, 4};
        return array;
    }
    
    // Method 3: Return 2-dimensional string array
    public static String[][] return2DimStringArray() {
        String[][] array = {{"Rima", "B"}, {"Israa", "Lamari"}, {"Adel", "Lamari"}};
        return array;
    }
    
    // Method 4: Return 2-dimensional object array
    public static Object[][] return2DimObjectArray() {
        Object[][] array = {{"mum", 1}, {"dad", 1}, {"daughter", 1}};
        return array;
    }
}
