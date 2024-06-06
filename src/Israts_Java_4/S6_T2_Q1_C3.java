package Israts_Java_4;

public class S6_T2_Q1_C3 extends S6_T2_Q1_C2{
	
	  // GRAND CHILD...

	public static void main(String[] args) {
		S6_T2_Q1_C3 C1= new S6_T2_Q1_C3 ();
		C1.A1();
		C1.B1(14);
		C1.C1("Hello");
		C1.D2();
		C1.E2(20);
		C1.F2("World");
		C1.G1();
		C1.H1();
		C1.I1();
        System.out.println(C1.x);  // INHERITED GLOBAL VARIABLE 
        System.out.println(C1.y);  // INHERITED GLOBAL VARIABLE 
        C1.B1(50);
        C1.C1("Money");

        
	}
	 
	public void G1 () {
		System.out.println("G1 from C3");  // OVERRIDEN METHOD OF CHILD CLASS 
	}
	
	public void H1 () {
		System.out.println("H1 from C3");  // OVERRIDEN METHOD OF CHILD CLASS
	}
	
	public void I1 () {
		System.out.println("I1 from C3 ");  // OVERRIDEN METHOD OF CHILD CLASS
	}
	

	// OVERRIDDEN METHOD FROM GRAND PARENT..
	
	@Override         // LOCKED THE OVERRIDEN METHOD. 
	public void B1 (int a) {
		System.out.println("B1 from C1");
	}
	public void C1 (String y) {
		System.out.println("C1 from C1 ");
	}
}
