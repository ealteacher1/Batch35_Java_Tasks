package Tahsin_Class_41to45_Tasks1to7;

public class Task2_C3 extends Task2_C2{
	
	// Global 
	static String C3 = "C3 Class (Child)";
	
	// Child
	public void childA() {
		System.out.println("Child A");
	}
	
	public void childB() {
		System.out.println("Child B");
	}
	
	public void childC() {
		System.out.println("Child C");
	}
	
	@Override
	public void A() {
		System.out.println("A method from child C3");
	}
	
	@Override
	public void B() {
		System.out.println("B method from child C3");
	}
	
	@Override
	public void C() {
		System.out.println("C method from child C3");
	}
	
}
