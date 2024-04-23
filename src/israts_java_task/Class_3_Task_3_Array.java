package israts_java_task;

public class Class_3_Task_3_Array {

	public static void main(String[] args) {
		
// Task - 03--
		String Rain []= new String [5];
		Rain [0]= "Rose";
		Rain [1]= "Is";
		Rain [2]= "Red";
		Rain [3]= "As";
		Rain [4]= "Blood";
	for (int i=0; i <=Rain.length-1;i++) {
		System.out.println(" The Value of String : " +Rain[i]);
	}
//Print the value of Index number 2 and 3 individually--
	System.out.println("The value of Index 1: " +Rain[1]);
	System.out.println("The value of Index 2 : "+Rain[2]);
   
	
// Print all the value from 1st to last index--
	for (int i=0;i<=Rain.length-1;i++) {
		System.out.println("The value of string : "+ Rain[i]);
	}
// Print all the value from last index to first index --
	for (int i=Rain.length-1;i>=0;i--) {
		System.out.println("The value of string : "+ Rain[i]);
	}
// Print all the value from 5th to 2nd index--
	for (int i=4;i>=1;i--) {
		System.out.println("The value of string "+ Rain[i]);
	}



	}
}