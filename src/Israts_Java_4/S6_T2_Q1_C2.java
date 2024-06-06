package Israts_Java_4;

public class S6_T2_Q1_C2 extends S6_T2_Q1_C1 {
	
	
	  // CHILD...

	public static void main(String[] args) {
		S6_T2_Q1_C2 B1= new S6_T2_Q1_C2 ();
		B1.A1();
		B1.B1(10);
		B1.C1("HEllo");
		B1.D2();
		B1.E2(15);
		B1.F2("WORLD");

	}
    
	public void D2 () {
		System.out.println("D2 from C2");
	}
	
	public void E2 (int a) {
		System.out.println("E2 from C2");
	}
	
	public void F2 (String b) {
		System.out.println("F2 from C2 ");
		
		
	}
}
