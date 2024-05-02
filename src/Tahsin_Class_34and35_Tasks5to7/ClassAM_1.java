package Tahsin_Class_34and35_Tasks5to7;

import Tahsin_Nazmee_Java_Tasks.ClassAM_2;

public class ClassAM_1 {

	public static void main(String[] args) {
		// Calling Static Method
		PublicStatic();
		PrivateStatic();
		ProtectedStatic();
		DefaultStatic();
		
		// Calling Non-Static Method from different package
		ClassAM_2 CallingFromAM_2 = new ClassAM_2();
		CallingFromAM_2.PublicNonstatic();
	}
	
	// Access Modifier
	// Public
	public static void PublicStatic() {
		String first = "Public ";
		String last = "Static"; 
		String firstlast = first + last;
		System.out.println(firstlast);
	}
	
	// Private
	private static void PrivateStatic() {
		String first = "Private ";
		String last = "Static"; 
		String firstlast = first + last;
		System.out.println(firstlast);
	}
	
	// Protected
	protected static void ProtectedStatic() {
		String first = "Protected ";
		String last = "Static"; 
		String firstlast = first + last;
		System.out.println(firstlast);
	}
	
	// Default
	static void DefaultStatic() {
		String first = "Default ";
		String last = "Static"; 
		String firstlast = first + last;
		System.out.println(firstlast);
	}
	
	/* End */
}
