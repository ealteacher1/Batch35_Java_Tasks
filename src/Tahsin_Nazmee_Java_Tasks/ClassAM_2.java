package Tahsin_Nazmee_Java_Tasks;

import Tahsin_Class_34and35_Tasks5to7.ClassAM_1;

public class ClassAM_2 {

	public static void main(String[] args) {
		// Calling Non-Static Method
		ClassAM_2 CallingFromAM_2 = new ClassAM_2();
		CallingFromAM_2.PublicNonstatic();
		CallingFromAM_2.PrivateNonstatic();
		CallingFromAM_2.ProtectedNonstatic();
		CallingFromAM_2.DefaultNonstatic();
		
		// Calling Static Method from different package
		ClassAM_1.PublicStatic();
	}
	
	// Access Modifier
	// Public 
	public void PublicNonstatic() {
		String first = "Public ";
		String last = "Non-Static"; 
		String firstlast = first + last;
		System.out.println(firstlast);
	}
	
	// Private
	private void PrivateNonstatic() {
		String first = "Private ";
		String last = "Non-Static"; 
		String firstlast = first + last;
		System.out.println(firstlast);
	}
	
	// Protected
	protected void ProtectedNonstatic() {
		String first = "Protected ";
		String last = "Non-Static"; 
		String firstlast = first + last;
		System.out.println(firstlast);
	}
	
	// Default
	void DefaultNonstatic() {
		String first = "Default ";
		String last = "Non-Static"; 
		String firstlast = first + last;
		System.out.println(firstlast);
	}
	
	/* End */
}
