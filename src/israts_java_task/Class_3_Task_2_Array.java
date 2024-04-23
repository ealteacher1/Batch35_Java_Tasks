package israts_java_task;

public class Class_3_Task_2_Array {

	public static void main(String[] args) {
//Task_02--
		int Flower []= new int [11];
		Flower [0]=5;
		Flower [2]=10;
		Flower [5]=15;
//Find out the length of Array--
		System.out.println(Flower.length);
		for (int j=0; j<=Flower.length-1;j++) {
		System.out.println("Array Value : "+ Flower[j]); 
		}
//Print value of index 3 and 5 individually--
		System.out.println(Flower[2]);	
		System.out.println(Flower[4]);
//Print the length of array and print the value of 1st index to last index--
		for (int j=0; j<=Flower.length-1;j++) {
		System.out.println("Array Value "+Flower[j]); 
		}
//Print the value from last index to 1st index--
		System.out.println("From last to first index");
		for (int j=Flower.length-1;j>=0;j--) {
		System.out.println("Array Value " +Flower[j]);
			}
//Print all the value from 5th index to 8th index--
		for (int j=4;j<=7;j++) {
			System.out.println("Array Value  "+Flower[j]);
		}
//Print the value from 8th index to 4th index--
		for (int j=7;j>=3;j--) {
			System.out.println("Array Value Is " +Flower[j]);
		}

		}
	
		}
		
	


