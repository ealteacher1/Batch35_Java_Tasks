package Tahsin_Class_34and35_Tasks5to7;

public class Class_D {

	public static void main(String[] args) {
		// Non-Static Method
		Class_D CallingFromD1 = new Class_D();
		Class_D CallingFromD2 = new Class_D(2);
		Class_D CallingFromD3 = new Class_D("Example 3");
		Class_D CallingFromD4 = new Class_D("Example", "4");
		Class_D CallingFromD5 = new Class_D("Example", 5);
		
		Class_E CallingFromE = new Class_E();
	}
	
	// Constructor
	public Class_D() {
		String classnumber = "Class 34 & 35 ";
		String tasknumber = "Task 6";
		System.out.println(classnumber + tasknumber);
	}
	
	public Class_D(int Ex2) {
		int add1 = 36;
		int add2 = 49;
		int addition = add1 + add2;
		System.out.println(addition);
	}
	
	public Class_D(String ex3) {
		int num = 25;
		while(num<=30) {
			System.out.println("The value is " + num);
			num++;
		}
	}
	
	public Class_D(String ex4, String Ex4) {
		String firstname = "Tahsin";
		String lastname = "Nazmee";
		if (firstname != lastname) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	public Class_D(Object ex5, Object Ex5) {
		Object student[][] = {{12, "students"}, {5, "male"}, {7, "females"}, {false}};
		for (Object[] studentArray:student) {
			for (Object Array:studentArray) {
				System.out.println(Array);
			}
		}
	}
	
	/* End */
}
