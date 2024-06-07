package Israts_Java_4;

public class Task_3_DynamicPolymorphism {

	public static void main(String[] args) {
		Task_3_DynamicPolymorphism dp1 = new Task_3_DynamicPolymorphism ();
		dp1.A();
		dp1.B();
		dp1.C(20);
		
	}
	
	public void A () {
		System.out.println("A from Task 3 ");
	}
    
	public void B () {
		System.out.println("B from Task 3");
	}
	
	public void C (int a) {
		System.out.println("C from Task 3");
	}
	public void A1 () {
		System.out.println("A1 from Task 3 ");
	}
	public void B1 () {
		System.out.println("B1 from Task 3 ");
	}
	public void C1 () {
		System.out.println("C1 from Task 3 ");
	}
}
