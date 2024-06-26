package Tahsin_Class_41to45_Tasks1to7;

public abstract class Task6_B {

	public static void main(String[] args) {
		Task6_Test ob = new Task6_Test();
		ob.A1();
		ob.A2();
		ob.A3();
		ob.B1();
		ob.B2();
		ob.B3();
	}
	
	abstract void B1();
	abstract void B2();
	
	void B3() {
		System.out.println("B3 default method from B");
	}

}
