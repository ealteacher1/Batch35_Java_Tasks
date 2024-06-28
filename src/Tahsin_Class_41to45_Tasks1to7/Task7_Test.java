package Tahsin_Class_41to45_Tasks1to7;

public class Task7_Test {

	public static void main(String[] args) {
		Task7_Child child = new Task7_Child();
		child.child();
		child.parentA();
		child.parentB();
		child.parentC();
		child.parentD();
		child.parentE();
		
		// Dynamic Polymorphism
		Task7_ParentA A = new Task7_Child();
		A.parentA();
		
		Task7_ParentB B = new Task7_Child();
		B.parentB();
		
		Task7_ParentC C = new Task7_Child();
		C.parentC();
		
		Task7_ParentD D = new Task7_Child();
		D.parentD();
		
		Task7_ParentE E = new Task7_Child();
		E.parentE();
	}

}
