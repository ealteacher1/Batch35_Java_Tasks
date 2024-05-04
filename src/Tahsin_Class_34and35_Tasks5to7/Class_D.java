package Tahsin_Class_34and35_Tasks5to7;

public class Class_D {

	public static void main(String[] args) {
		// Calling Non-Static Method
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
	
	public Class_D(String Ex3) {
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
	
	// Access Modifier
	public void methodD1() {
		String method = "method";
		String D1 = "D1";
		String methodD1 = method + D1;
		System.out.println(methodD1);
	}
	
	public void methodD2(int Ex2) {
		int minus1 = 49;
		int minus2 = 36;
		int subtraction = minus1 -minus2;
		System.out.println(subtraction);
	}
	
	public void methodD3(String Ex3) {
		int num = 30;
		do {
			System.out.println("The value is " + num);
			num--;
		} while (num>=25);
	}
	
	public void methodD4(int ex4, int Ex4) {
		int age1 = 25;
		int age2 = 17;
		if (age1 < age2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	public void methodD5(Object ex5, Object Ex5) {
		String colors[] = {"brown", "white", "yellow"};
		for (String colorsArray:colors) {
			System.out.println(colorsArray);
		}
	}
	
	/* End */
}
