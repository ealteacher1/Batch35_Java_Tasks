package Israts_Java_4;

public class Test_ABC {

	public static void main(String[] args) {
        
		Task_4_TC_C test= new Task_4_TC_C ();
		
		
		test.A();  // from Task_4_TC_C
		test.B();  // from Task_4_TC_A
		test.C();  // from Task_4_TC_A
		test.D();  // from Task_4_TC_B
		test.E();   // from Task_4_TC_B
		test.F();   // from Task_4_TC_B
		test.G();   // from Task_4_TC_C
		test.H();   // from Task_4_TC_C
		test.I();   // from Task_4_TC_C
		
		
		
		
		// TOP CASTING REFRERING GRANDPARENT CLASS 
		
		Task_4_TC_A proving = new Task_4_TC_C ();
		
		// DYNAMIC/RUNTIME POLYMORPHISM
		
		proving.A();
		proving.B();
		proving.C();
		proving.C1();  
		
		
		
		
		
	}

}
