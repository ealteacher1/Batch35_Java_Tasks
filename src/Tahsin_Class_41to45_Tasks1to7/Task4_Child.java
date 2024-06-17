package Tahsin_Class_41to45_Tasks1to7;

public class Task4_Child extends Task4_Parent {

	public static void main(String[] args) {
		// Top Casting
		Task4_Parent ob1 = new Task4_Child();
		Task4_Grandparent ob2 = new Task4_Child();
	}
	
	// Child Constructor
	Task4_Child(){
		System.out.println("Child Constructor");
	}

}
