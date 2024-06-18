package tasks_shaheena;



public class Test_C6_T2 {

	
	public static void main(String[] args) {
		
	// a.override from Grandparent C1  to grand child C3	
		
		
		S6_T2_Q1_C3 ob = new S6_T2_Q1_C3();
		
		ob.Honesty();    // overridden method 
		ob.complexion();   // Grand  Parent
		ob.Height(); 
		ob.communication();
		ob.intelligence();
		ob.patience();
		ob.Resiliency();
		ob.Integrity();
	
	}

}


// d.Create another Class(S6_T2_Test) and Call child Class Object and Try to Call all the overridden methods 
//and Non Overridden Methods as 
// well. Check From where Overridden methods are getting Called.
