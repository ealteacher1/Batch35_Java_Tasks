package Israts_Java_4;

public class Task_5_C1 extends Task_5_C2 {  // Descendants/Grand child 

	public static void main(String[] args) {

	}
	
	public void A () {
		System.out.println("Calling A from Task_5_C1");
	}
	
	public void B () {
		System.out.println("Calling B from Task_5_C1");
	}
	
	public void C() {
		System.out.println("Calling C from Task_5_C1");
		
	}
	public void E () {  // OVERRIDDEN METHOD 
		System.out.println("Calling B from Task_5_C2");
	}

}
