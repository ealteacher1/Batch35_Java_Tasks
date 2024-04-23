package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Array_Task6 {

	public static void main(String[] args) {
		/*
		Create an Object array without limiting the index length and put 5 int values
		- Print all value with for loop
		- Length of array and print all value from first index to last index with for loop
		- Print all value from last index (a.length-1) to first index
		(Print reverse order)
		- Print value of index number 2 and index number 3 individually
		- Print all value from 5th index to 2nd index
		*/
		Object tahsin[] = {1, 2, 3, 4, 5, };
		System.out.println(tahsin.length);
		
		for (Object a:tahsin) {
			System.out.println(a);
		}
		
		for (int b=0; b<tahsin.length; b++) {
			System.out.println(tahsin[b]);
		}
		
		for (int c=tahsin.length-1; c>=0; c--) {
			System.out.println(tahsin[c]);
		}
		
		System.out.println(tahsin[1]);
		System.out.println(tahsin[2]);
		
		for (int d=4; d>=1; d--) {
			System.out.println(tahsin[d]);
		}
	
		/* End */
	}
}
