package Israts_Java_4;

public class Task_4_TC_B extends Task_4_TC_A {  // CHILD /PARENT 

	public static void main(String[] args) {  
		Task_4_TC_B b = new Task_4_TC_B (); // CALLING CONSTRUCTOR 
	}
     
	public void D () {
		System.out.println("Calling D from TC_B");
	}
	
	public void E () {
		System.out.println("Calling E from TC_B"); 
	}
	
	public void F() {
		System.out.println("Calling F from TC_B"); 
	}
	
	// CONSTRUCTOR 
	
	Task_4_TC_B () {
		System.out.println("DEFAULT Constructor from 2nd  class "); // DEFAULT CONSTRUCTOR 
	}
	Task_4_TC_B (int y ) {
		System.out.println(" Constructor from 2nd  class ");  // MODIFIED CONSTRUCTOR 
	}
}

