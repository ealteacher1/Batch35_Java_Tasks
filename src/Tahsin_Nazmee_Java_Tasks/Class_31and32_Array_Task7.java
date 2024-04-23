package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Array_Task7 {

	public static void main(String[] args) {
		/*
		Create a multi-dim Object array with 2 rows and 2 columns and put 4 int values
		in all cells of the table.
		- Print all value with for loop
		- Print value in first row, second column
		- Print length of rows and columns
		*/ 
		Object tahsin[][] = new Object[2][2];
		tahsin[0][0] = 6;
		tahsin[0][1] = 7;
		tahsin[1][0] = 8;
		tahsin[1][1] = 9;
		System.out.println(tahsin.length); // length of rows
		System.out.println(tahsin[0].length); // length of columns
		System.out.println(tahsin[0][1]);
		
		for (int a=0; a<tahsin.length; a++) {
			for (int b=0; b<tahsin.length; b++) {
				System.out.println(tahsin[a][b]);
			}
		}
		
		for (Object[] c:tahsin) {
			for (Object d:c) {
				System.out.println(d);
			}
		}
		
		/* End */
	}
}
