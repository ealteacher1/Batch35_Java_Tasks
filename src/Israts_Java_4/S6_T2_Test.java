package Israts_Java_4;

public class S6_T2_Test {

	public static void main(String[] args) {
		
		S6_T2_Q1_C3 calling = new S6_T2_Q1_C3 ();
		calling.A1();         // from c1
		calling.B1(0);       // from c3 - Overridden from parent 
		calling.C1(null);   // from c3  - Overridden  from parent
		calling.D2();      // from c2   - Non Overridden
		calling.E2(0);     // from c2   - Non Overridden
		calling.F2(null); // from c2    - Non Overridden
		calling.G1();    // from c3     - Overridden from child 
		calling.H1();   // from c3      - Overridden  from child 
		calling.I1();  // from c3        - Overridden  from child 
		

	}

}
