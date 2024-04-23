package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Array_Task3 {

	public static void main(String[] args) {
		/*
		Create an string array without limiting the index length and put 5 string values.
		- Print all value with for each loop
		- Print value of index number 2 and index number 3 individually
		- Print all value from first index to last index with for loop
		- Print all value from last index (a.length-1) to first index
		(Print in reverse order)
		- Print all value from 5th index to 2nd index
		*/
		String animal[] = {"cat", "dog", "cow", "bird", "rat",};
		System.out.println(animal.length);
		
		for (String a:animal) {
			System.out.println(a);
		}
		
		System.out.println(animal[1]);
		System.out.println(animal[2]);
		
		for (int b=0; b<animal.length; b++) {
			System.out.println(animal[b]);
		}
		
		for (int c=animal.length-1; c>=0; c--) {
			System.out.println(animal[c]);
		}
		
		for (int d=4; d>=1; d--) {
			System.out.println(animal[d]);
		}
		
		/* End */
	}
}
