package Tahsin_Class_41to45_Tasks1to7;

public class Task7_Child implements Task7_ParentA, Task7_ParentB, Task7_ParentC, Task7_ParentD, Task7_ParentE {

	public void child() {
		System.out.println("Child of A, B, C, D, E");
	}

	@Override
	public void parentA() {
		System.out.println("Parent A");
	}

	@Override
	public void parentB() {
		System.out.println("Parent B");
	}

	@Override
	public void parentC() {
		System.out.println("Parent C");
	}

	@Override
	public void parentD() {
		System.out.println("Parent D");
	}

	@Override
	public void parentE() {
		System.out.println("Parent E");
	}
	
}
