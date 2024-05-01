package Tahsin_Class_34and35_Tasks5to7;

public class Class_E {

	public static void main(String[] args) {
		// Non-Static Method
		Class_D CallingFromD = new Class_D();
		Class_D CallingFromD2 = new Class_D(2);
		Class_D CallingFromD3 = new Class_D("Example 3");
		Class_D CallingFromD4 = new Class_D("Example", "4");
		Class_D CallingFromD5 = new Class_D("Example", 5);
		
		Class_E CallingFromE = new Class_E();
	}
	
	// Constructor
	public Class_E() {
		String CallingFrom = "Calling From ";
		String ClassName = "Class_E";
		System.out.println(CallingFrom + ClassName);
	}
	
	/* End */
}
