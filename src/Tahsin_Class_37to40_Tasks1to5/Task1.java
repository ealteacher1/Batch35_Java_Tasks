package Tahsin_Class_37to40_Tasks1to5;

public class Task1 {

	public static void main(String[] args) {
		Task1 ob1 = new Task1();
		ob1.example1(new Task1());
		ob1.example1(ob1);
		
		Task1 ob2 = new Task1();
		ob2.example2(new Task1());
		ob2.example2(ob2);
		
		Task1 ob3 = new Task1();
		ob3.example3(new Task1());
		ob3.example3(ob3);
		
		Task1 ob4 = new Task1();
		ob4.example4(new Task1());
		ob4.example4(ob4);
		
		Task1 ob5 = new Task1();
		ob5.example5(new Task1());
		ob5.example5(ob5);
	}
	
	// Access Modifier
	public void example1(Task1 Example1) {
		System.out.println(Example1);
		Task1 ob1 = new Task1();
		ob1.ex1();
	}
	
	public void ex1() {
		System.out.println("First Example");
	}
	
	public void example2(Task1 Example2) {
		System.out.println(Example2);
		Task1 ob2 = new Task1();
		ob2.ex2();
	}
	
	public void ex2() {
		System.out.println("Second Example");
	}
	
	public void example3(Task1 Example3) {
		System.out.println(Example3);
		Task1 ob3 = new Task1();
		ob3.ex3();
	}
	
	public void ex3() {
		System.out.println("Third Example");
	}
	
	public void example4(Task1 Example4) {
		System.out.println(Example4);
		Task1 ob4 = new Task1();
		ob4.ex4();
	}
	
	public void ex4() {
		System.out.println("Fourth Example");
	}
	
	public void example5(Task1 Example5) {
		System.out.println(Example5);
		Task1 ob5 = new Task1();
		ob5.ex5();
	}
	
	public void ex5() {
		System.out.println("Fifth Example");
	}

}
