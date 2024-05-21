package Tahsin_Class_37to40_Tasks1to5;

public class Class_s10t2 { 

	public static void main(String[] args) {
		// Task 2
		// Calling Method Overload From Class Task2
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
		
		// Calling Constructor Overload From Class Task2
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

}
