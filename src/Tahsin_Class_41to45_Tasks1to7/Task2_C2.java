package Tahsin_Class_41to45_Tasks1to7;

public class Task2_C2 extends Task2_C1{
	
	// Global
	String C2 = "C2 Class (Parent)";
	
	// Parent
	public void parentA() {
		System.out.println("Parent A");
	}
	
	public void parentB() {
		System.out.println("Parent B");
	}
	
	public void parentC() {
		System.out.println("Parent C");
	}
	
	@Override
	public void D() {
		System.out.println("D method from parent C2");
	}
	
	@Override
	public void E() {
		System.out.println("E method from parent C2");
	}

}
