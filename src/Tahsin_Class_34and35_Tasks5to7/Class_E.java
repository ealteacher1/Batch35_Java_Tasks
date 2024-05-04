package Tahsin_Class_34and35_Tasks5to7;

public class Class_E {

	public static void main(String[] args) {
		// Non-Static Method
		Class_D CallingFromD1 = new Class_D();
		CallingFromD1.methodD1();
		Class_D CallingFromD2 = new Class_D(2);
		CallingFromD2.methodD2(2);
		Class_D CallingFromD3 = new Class_D("Example 3");
		CallingFromD3.methodD3("Example 3");
		Class_D CallingFromD4 = new Class_D("Example", "4");
		CallingFromD4.methodD4(4, 4);
		Class_D CallingFromD5 = new Class_D("Example", 5);
		CallingFromD5.methodD5("Exmaple", 5);
		
		Class_E CallingFromE = new Class_E();
		CallingFromE.methodE();
	}
	
	// Constructor
	public Class_E() {
		String CallingFrom = "Calling From ";
		String ClassName = "Class_E";
		System.out.println(CallingFrom + ClassName);
	}
	
	// Access Modifier
	public void methodE() {
		String method = "This method is ";
		String nonstatic= "Nonstatic";
		String nsmethod = method + nonstatic;
		System.out.println(nsmethod);
	}
	
	/* End */
}
