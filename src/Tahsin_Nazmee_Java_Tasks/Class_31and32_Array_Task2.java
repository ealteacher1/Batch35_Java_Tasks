package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Array_Task2 {

	public static void main(String[] args) {
		/*
		Create an string array with 11 indexes and put any value on index number 1 (ex: a[0]),
		index number 3, and index number 6. 
		- Length of array and print all value with for each loop
		- Print value of index number 3 and index number 5 individually
		- Length of array and print all value from first index to last index with for loop
		- Length of array and print all value from last index (a.length-1) to first index
		(Printing should be in reverse order)
		- Length of array and print all value from 5th index to 8th index
		- Length of array and print all value from 8th index to 4th index
		*/
		String fruits[] = new String[11];
		fruits[0] = "apple";
		fruits[2] = "grape";
		fruits[5] = "mango";
		System.out.println(fruits.length);
		
		for (String a:fruits) {
			System.out.println(a);
		}
		
		System.out.println(fruits[2]);
		System.out.println(fruits[4]);
		
		for (int b=0; b<fruits.length; b++) {
			System.out.println(fruits[b]);
		}
		
		for (int c=fruits.length-1; c>=0; c--) {
			System.out.println(fruits[c]);
		}
		
		for (int d=4; d<=7; d++) {
			System.out.println(fruits[d]);
		}
		
		for (int e=7; e>=3; e--) {
			System.out.println(fruits[e]);
		}
		
		/* End */
	}
}
