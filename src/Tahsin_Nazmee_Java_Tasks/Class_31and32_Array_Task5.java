package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Array_Task5 {

	public static void main(String[] args) {
		/*
		Create an Object array with 10 index and put any value on index number 1 (ex:a[0),
		index number 5, and index number 8.
		- Length of array and print all value with for each loop
		- Print all value from first index to last index with for loop
		- Print value of index number 2 and index number 3 individually
		- Print all value from last index (a.length-1) to first index
		(Print reverse order)
		- Print all value from 5th index to 8th index
		- Print all value from 8th index to 4th index 
		*/ 
		Object tahsin[]= new Object[10];
		tahsin[0] = "tahsin";
		tahsin[4] = 'm';
		tahsin[7] = 8;
		System.out.println(tahsin.length);
		
		for (Object a:tahsin) {
			System.out.println(a);
		}
		
		for (int b=0; b<tahsin.length; b++) {
			System.out.println(tahsin[b]);
		}
		
		System.out.println(tahsin[1]);
		System.out.println(tahsin[2]);
		
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
