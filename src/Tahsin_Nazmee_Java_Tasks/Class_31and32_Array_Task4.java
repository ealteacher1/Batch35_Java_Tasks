package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Array_Task4 {

	public static void main(String[] args) {
		/*
		Create an int array without limiting the index length and put 5 int values.
		- Print all value with for each loop
		- Length of array and print all value from first index to last index with for loop
		- Print all value from last index (a.length-1) to first index (Print reverse order)
		- Print all value form 5th index to 2nd index
		*/ 
		int tahsin[] = {1, 2, 3, 4, 5, };
		System.out.println(tahsin.length);
		
		for (int a:tahsin) {
			System.out.println(a);
		}
		
		for (int b=0; b<tahsin.length; b++) {
			System.out.println(tahsin[b]);
		}
		
		for (int c=tahsin.length-1; c>=0; c--) {
			System.out.println(tahsin[c]);
		}
		
		for (int d=4; d>=1; d--) {
			System.out.println(tahsin[d]);
		}
		
		/* End */
	}
}
