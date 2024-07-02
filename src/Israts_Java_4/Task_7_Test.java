package Israts_Java_4;

public class Task_7_Test {

	public static void main(String[] args) {
		
		Task_7_Child ch= new Task_7_Child();
		ch.interface1();
		ch.interface2();
		ch.interface3();
		ch.interface4();
		ch.interface5();
		
		
		System.out.println("***************");
		
		
		// DYNAMIC POLYMORPHISM 
		
		Task_7_Interface_01 iA = new Task_7_Child ();
		iA.interface1();
		
		Task_7_Interface_02 iB = new Task_7_Child ();
		iB.interface2();
		
		Task_7_Interface_03 iC = new Task_7_Child ();
		
		iC.interface3();
		
		Task_7_Interface_04 iD = new Task_7_Child ();
		iD.interface4();
		
		Task_7_Interface_05 iE = new Task_7_Child ();
		iE.interface5();
		

	}

}
