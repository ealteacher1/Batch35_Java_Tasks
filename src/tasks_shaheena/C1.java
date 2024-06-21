package tasks_shaheena;




/*Create  4 Classes which are inheriting from Ancestors to Descendants (c4 is the parent of C3, C3 is the parent of C2,
 * C2 is the Parent of C1)
 * a.Create 3 Objects by doing Down Casting and Convert the Object to another Class. And run and Check if Java Allows it or not.
 * b.Create 2 object by top Casting and Convert the Objects(Run and check if Java Allows it or not)*/

//c1 child class  extends to C2 parent class 
public class C1 extends  C2{
	
	
	public void m1() {
		
		System.out.println(" Class C1 - method m1");
	}
	
	public void m2() {
		System.out.println("Class C1 - method m2");
	}

}
