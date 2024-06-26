package Tahsin_Class_41to45_Tasks1to7;

public class Task6_Test extends Task6_A{

	public static void main(String[] args) {
		Task6_Test ob = new Task6_Test();
		ob.A1();
		ob.A2();
		ob.A3();
		ob.B1();
		ob.B2();
		ob.B3();
	}

	@Override
	void A1() {		
		System.out.println("A1 default method from Test");
	}

	@Override
	void A2() {		
		System.out.println("A2 default method from Test");
	}

	@Override
	void B1() {
		System.out.println("B1 default method from Test");
	}

	@Override
	void B2() {	
		System.out.println("B2 default method from Test");
	}

}
