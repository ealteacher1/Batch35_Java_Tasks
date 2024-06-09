package Israts_Java_4;

public class Task_4_TC_A {  // GRAND PARENT 

	public static void main(String[] args) {
		Task_4_TC_A a= new Task_4_TC_A (); // CALLING CONSTRUCTOR 

	}
     
	

	public void A () {
		System.out.println("Calling A from TC_A");
	}
	
	public void B () {
		System.out.println("Calling B from TC_A");
	}
	
	public void C() {
		System.out.println("Calling C from TC_A");
	}
	
	//CONSTRUCTOR 
	
	Task_4_TC_A () {
		System.out.println("DEFAULT Constructor from 1st class ");  // DEFAULT CONSTRUCTOR 
	}
	Task_4_TC_A (int x) {
		System.out.println(" Constructor from 1st class ");  // MODIFIED CONSTRUCTOR 
	}
}
