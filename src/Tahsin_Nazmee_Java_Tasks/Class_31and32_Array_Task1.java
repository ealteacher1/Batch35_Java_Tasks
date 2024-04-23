package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Array_Task1 {

	public static void main(String[] args) {
		/* 
		Create an integer array with 10 index and put value on index number 1 (ex: a[]), 
		index number 7, and index number 9.
		- Length of array and print all value with for each loop
		- Length of array and print all value from first index to last index with for loop
		- Print value of index number 5 and index number 7 individually
		- Length of array and print all value from last index (a.length-1) to first index
		(Printing should be in reverse order)
		- Length of array and print all value from 5th index to 8th index
		- Length of array and print all value from 8th index to 4th index
		*/
		int tahsin[] = new int [10];
		tahsin[0] = 1;
		tahsin[6] = 7;
		tahsin[8] = 9;
		System.out.println(tahsin.length);
		
		for (int a:tahsin) {
			System.out.println(a);
		}
		
		for (int b=0; b<tahsin.length; b++) {
			System.out.println(tahsin[b]);
		}
		
		System.out.println(tahsin[4]);
		System.out.println(tahsin[6]);
		
		for (int c=tahsin.length-1; c>=0; c--) {
			System.out.println(tahsin[c]);
		}
		
		for (int d=4; d<=7; d++) {
			System.out.println(tahsin[d]);
		}
		
		for (int e=7; e>=3; e--) {
			System.out.println(tahsin[e]);
		}
		
		
		/* End */
	}
}
