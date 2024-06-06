package Israts_Java_4;

public class S6_T2_Q1_C1 {
	
	//GLOBAL VARIABLE..
	
	int x=50;
	String y= "Dollars";
	

	public static void main(String[] args) {
		
		
		// GRAND PARENT...
		
		S6_T2_Q1_C1 C1= new S6_T2_Q1_C1 ();
		C1.A1();
		C1.B1(10);
		C1.C1("Hellllo");
		System.out.println(C1.x);  // CALLED GLOBAL VARIABLE 
		System.out.println(C1.y);   // CALLED GLOBAL VARIABLE 
		
		// CALLING OVERRIDEN METHOD FROM CHILD CLASS 
		C1.G1();
		C1.H1();
		C1.I1();

		
	
	}
	public void A1 () {
		System.out.println("A1 from C1");
	}
	
	public void B1 (int a) {
		System.out.println("B1 from C1");
	}
	
	public void C1 (String y) {
		System.out.println("C1 from C1 ");
	}
	 
		public void G1 () {
			System.out.println("G1 from C3");  // METHOD FROM GRANDCHILD CLASS 
		}
		
		public void H1 () {
			System.out.println("H1 from C3");  // METHOD FROM GRANDCHILD CLASS 
		}
		
		public void I1 () {
			System.out.println("I1 from C3 ");  // METHOD FROM GRANDCHILD CLASS 
		}
		

}
