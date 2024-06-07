package Israts_Java_4;

public class Task_3_DP_2 extends Task_3_DynamicPolymorphism {

	public static void main(String[] args) {
		Task_3_DP_2 dp2= new Task_3_DP_2 ();
		dp2.A();
		dp2.B();
		dp2.C(50);
		dp2.D();
		dp2.E();
		dp2.F();
		dp2.A1();
		dp2.B1();
		
		dp2.C1(); // unique method called from parent class 

	}
	
	public void D () {
		System.out.println("D from DP_2");
	}
	public void E() {
		System.out.println("E from DP_2");
	}
	
	public void F () {
		System.out.println("F from DP_2");
	}
	
	@Override
	public void C (int a) {
		System.out.println("C from Task 3"); // method from parent class 
	}
	@Override
	public void A1 () {
		System.out.println("A1 from Task 3 ");  // method from parent class
	}
	@Override
	public void B1 () {
		System.out.println("B1 from Task 3 "); // method from parent class
	}

}
