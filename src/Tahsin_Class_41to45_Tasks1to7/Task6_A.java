package Tahsin_Class_41to45_Tasks1to7;

public abstract class Task6_A extends Task6_B {

	public static void main(String[] args) {
		Task6_Test ob = new Task6_Test();
		ob.A1();
		ob.A2();
		ob.A3();
		ob.B1();
		ob.B2();
		ob.B3();
	}
	
	abstract void A1();
	abstract void A2();
	
	void A3() {
		System.out.println("A3 default method from A");
	}

}
