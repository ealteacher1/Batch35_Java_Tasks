package Israts_Java_3;

public class Class_B {

	public static void main(String[] args) {
   
		
		
	//CALLING ALL PRIVATE METHOD FROM ANOTHER CLASS (Class_A)..
		
		Class_A c=new Class_A ();
		c.net_profit();
		Class_A d = new Class_A ();
		d.profit1();
		Class_A e = new Class_A ();
		e.z1();
		Class_A e1 = new Class_A ();
		e1.a2();
		Class_A e3 = new Class_A ();
		e3.s2();
		System.out.println("print ");
		
		
	//CALLING PRIVATE METHOD WITH RETURN TYPE FROM Class_A..
		//Class_A e4 = new Class_A () ;
		e3.si();
	}

}
