package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Array_Task8 {

	public static void main(String[] args) {
		/*
		Create a multi-dim String array with 3 rows and 2 columns and put 2 String values
		in any of the cells of table.
		- Print all value with for loop
		- Print value in first row, second column
		- Length of rows and columns 
		*/ 
		String pets[][] = new String[3][2];
		pets[0][1] = "cat";
		pets[2][0] = "dog";
		System.out.println(pets.length); // length of rows
		System.out.println(pets[0].length); // length of columns
		System.out.println(pets[0][1]);
		
		for (String[] a:pets) {
			for (String b:a) {
				System.out.println(b);
			}
		}
		
		/* End */
	}
}
