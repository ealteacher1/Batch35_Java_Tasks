package Tahsin_Class_41to45_Tasks1to7;

public class Task5_C1 extends Task5_C2 {

	public static void main(String[] args) {
		// Top Casting 
		Task5_C2 tc1 = (Task5_C2) new Task5_C1();
		Task5_C3 tc2 = (Task5_C3) new Task5_C1();
		
		// Down Casting
		Task5_C1 dc1 = (Task5_C1) new Task5_C2();
		Task5_C1 dc2 = (Task5_C1) new Task5_C3();
		Task5_C1 dc3 = (Task5_C1) new Task5_C4();
	}
	
	Task5_C1(){
		System.out.println("C1 Class (child of C2)");
	}

}
