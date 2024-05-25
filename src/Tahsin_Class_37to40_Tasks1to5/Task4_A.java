package Tahsin_Class_37to40_Tasks1to5;

public class Task4_A {
	// Global Variables
	String fullname = "Tahsin";
	int age = 25;
	double height = 5.7;
	char middle = 'N';
	boolean fact = false;
	int year;
	String season;
	
	// Main
	public static void main(String[] args) {
		Task4_A obj = new Task4_A();
		obj.info();
	}
	
	public void info() {
		fullname = "Tahsin Nazmee";
		age = 26;
		height = 5.8;
		middle = 'M';
		fact = true;
		
		System.out.println(fullname);
		System.out.println(age);
		System.out.println(height);
		System.out.println(middle);
		System.out.println(fact);
		
		int year = 1998;
		String season = "Winter";
		this.year = 2024;
		this.season = "Summer";
		
		System.out.println(this.year);
		System.out.println(this.season);
	}

}
