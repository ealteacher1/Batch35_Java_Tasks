package Israts_Java_4;

public class Task_5_Downcasting {

	public static void main(String[] args) {
		
		// DOWN CASTING AND CONVERTING THE OBJECT
		
		Task_5_C3 downcasting =(Task_5_C3)new Task_5_C4 ();
		downcasting.CC();
		downcasting.G();
		downcasting.H();
		downcasting.I();    // JAVA DIDN'T ALLOWED DOWNCASTING OBJECT CONVERTION 
		downcasting.J();
		downcasting.K();
		downcasting.L();
		
		
		Task_5_C1 downcasting1 = (Task_5_C1) new Task_5_C2 () ;
		downcasting1.A();
		downcasting1.B();
		downcasting1.C();
		downcasting1.CC();
		downcasting1.D();
		downcasting1.E();
		downcasting1.F();   //  JAVA DIDN'T ALLOWED DOWNCASTING OBJECT CONVERTION
		downcasting1.G();
		downcasting1.H();
		downcasting1.H();
		downcasting1.I();
		downcasting1.J();
		downcasting1.K();
		downcasting1.L();
		
		Task_5_C2 downcasting2 = (Task_5_C2)new Task_5_C3 () ;
		downcasting2.CC();
		downcasting2.D();
		downcasting2.E();
		downcasting2.F();    // JAVA DIDN'T ALLOWED DOWNCASTING OBJECT CONVERTION 
		downcasting2.H();
		downcasting2.I();
		downcasting2.J();
		downcasting2.K();
		downcasting2.L();
		
		
		// TOPCASTING AND CONVERTING THE OBJECT
		
		// 1ST WAY
		System.out.println("Printing top casting in 1st way (object conversion)");

		Task_5_C4 topcasting1 = (Task_5_C4) new Task_5_C3 ();
		topcasting1.CC();
		topcasting1.J();
		topcasting1.K();    // JAVA ALLOWED TOPCASTING OBJECT CONVERTION 
		topcasting1.L();
		

		
		// 2ND WAY
		System.out.println("Printing top casting in 2nd way (usual way ) ");

		Task_5_C4 topcasting2 =  new Task_5_C3 ();
		topcasting1.CC();
		topcasting1.J();
		topcasting1.K();    // JAVA ALLOWED TOPCASTING OBJECT CONVERTION 
		topcasting1.L();
		
		System.out.println("Printing top casting object conversion ");

		Task_5_C3 topcasting3 = (Task_5_C3) new Task_5_C1 () ;
		topcasting3.CC();
		topcasting3.G();
		topcasting3.H();       // JAVA ALLOWED TOPCASTING OBJECT CONVERTION 
		topcasting3.I();
		topcasting3.J();
		topcasting3.K();
		topcasting3.L();
		
		

	}

}
