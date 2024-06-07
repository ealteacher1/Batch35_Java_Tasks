package Israts_Java_4;

public class Task_3_Test_DP {

	public static void main(String[] args) {
		Task_3_DynamicPolymorphism dp1 = new Task_3_DynamicPolymorphism ();
		dp1.A();
		dp1.B();
		dp1.C(20);
		System.out.println("Calling from Dp1");
		
		
		
		// DYNAMIC POLYMORPHISM..
		
		Task_3_DP_2 dp2= new Task_3_DP_2 ();
		dp2.A();    // from Task_3_DynamicPolymorphism
		dp2.A1();   // fromTask_3_DP_2
		dp2.B();    // from Task_3_DynamicPolymorphism
		dp2.B1();   // fromTask_3_DP_2
		dp2.C(10);  // from Task_3_DP_2
		dp2.D();    // from Task_3_DP_2
		dp2.E();    // from Task_3_DP_2
		dp2.F();    // fromTask_3_DP_2
		System.out.println("Printing out Dynamic Polymorphism");
		
		
		
		 // TOP CASTING..
      
		Task_3_DynamicPolymorphism abc= new Task_3_DP_2 (); 
	
		abc.A(); // from Task_3_DynamicPolymorphism
		abc.A1();  //from Task_3_DynamicPolymorphism
		abc.B();  //from Task_3_DynamicPolymorphism
		abc.B1();  //from Task_3_DynamicPolymorphism
		abc.C(10);  //from Task_3_DynamicPolymorphism
		abc.C1();  //from Task_3_DynamicPolymorphism
		
		
	}

}
