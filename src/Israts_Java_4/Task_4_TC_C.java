package Israts_Java_4;

public class Task_4_TC_C extends Task_4_TC_B{  // GRAND CHILD 

	public static void main(String[] args) {
		Task_4_TC_B c=new Task_4_TC_C (); // CALLING CONSTRUCTOR 
		

	}
	public void G () {
		System.out.println("Calling G from TC_C");
	}
	public void H () {
		System.out.println("Calling H from TC_C");
	}
	public void I () {
		System.out.println("Calling I from TC_C");
	}
	
	// CONSTRUCTOR 
	
	Task_4_TC_C () {
		System.out.println("DEFAULT Constructor from 3rd class ");  // DEFAULT CONSTRUCTOR 
	}
	Task_4_TC_C (int z) {
		System.out.println(" Constructor from 3rd class ");  // MODIFIED CONSTRUCTOR 
	}
}
