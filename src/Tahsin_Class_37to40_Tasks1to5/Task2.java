package Tahsin_Class_37to40_Tasks1to5;

public class Task2 {

	public static void main(String[] args) {
		// Calling Method Overload
		Task2 ob = new Task2();
		ob.Tahsin(1);
		ob.Tahsin(2, 2);
		ob.Tahsin(3, 3, 3);
		ob.Tahsin("Four");
		ob.Tahsin("Tahsin ", "Nazmee");
		ob.Tahsin("Tahsin ", "is ", "athletic");
		ob.Tahsin(2, " cats");
		ob.Tahsin("Summer ", 2024);
		ob.Tahsin(9.5);
		ob.Tahsin(10.5, 10.5);
		
		// Calling Constructor Overload
		Task2 ob2 = new Task2(2);
		Task2 ob3 = new Task2(3, 3);
		Task2 ob4 = new Task2(4, 4, 4);
		Task2 ob5 = new Task2('t');
		Task2 ob6 = new Task2("sixth");
		Task2 ob7 = new Task2("seventh", "constructor");
		Task2 ob8 = new Task2(8, "eighth");
		Task2 ob9 = new Task2(9.1);
		Task2 ob10 = new Task2(10.1, 10.2);
	}
	
	// Method Overload
	public void Tahsin(int a) {
		System.out.println("Value of first method: " + a);
	}
	
	public void Tahsin(int a, int b) {
		int c = a + b;
		System.out.println("Value of second method: " + c);
	}
	
	public void Tahsin(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Value of third method: " + d);
	}
	
	public void Tahsin(String a) {
		System.out.println("Value of fourth method: " + a);
	}
	
	public void Tahsin(String a, String b) {
		String c = a + b;
		System.out.println("Value of fifth method: " + c);
	}
	
	public void Tahsin(String a, String b, String c) {
		String d = a + b + c;
		System.out.println("Value of sixth method: " + d);
	}
	
	public void Tahsin(int a, String b) {
		Object c = a + b;
		System.out.println("Value of seventh method: " + c);
	}
	
	public void Tahsin(String a, int b) {
		Object c = a + b;
		System.out.println("Value of eighth method: " + c);
	}
	
	public void Tahsin(double a) {
		System.out.println("Value of ninth method: " + a);
	}
	
	public void Tahsin(double a, double b) {
		double c = a * b;
		System.out.println("Value of tenth method: " + c);
	}
	
	// Constructor Overload
	public Task2() {
		System.out.println("First Constructor");
	}
	
	public Task2(int a) {
		System.out.println("Second Constructor");
	}
	
	public Task2(int a, int b) {
		System.out.println("Third Constructor");
	}
	
	public Task2(int a, int b, int c) {
		System.out.println("Fourth Constructor");
	}
	
	public Task2(char a) {
		System.out.println("Fifth Constructor");
	}
	
	public Task2(String a) {
		System.out.println("Sixth Constructor");
	}
	
	public Task2(String a, String b) {
		System.out.println("Seventh Constructor");
	}
	
	public Task2(int a, String b) {
		System.out.println("Eighth Constructor");
	}
	
	public Task2(double a) {
		System.out.println("Ninth Constructor");
	}
	
	public Task2(double a, double b) {
		System.out.println("Tenth Constructor");
	}
	
}
