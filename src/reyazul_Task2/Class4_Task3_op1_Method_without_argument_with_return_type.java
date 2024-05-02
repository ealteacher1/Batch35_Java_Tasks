package reyazul_Task2;

public class Class4_Task3_op1_Method_without_argument_with_return_type {

	public static void main(String[] args) {
		
		// Method with out argument (with return type)
		
		System.out.println(sky());
		System.out.println(sky1());
		System.out.println();
		
		int riyu6 = sky3();
		
			System.out.println(riyu6);
			
			System.out.println("Object value: "+ sky4());
			sky5();
			
			
		

	}
	// String
	public static String sky () {
        String riyu1 = " sky is ";
        String riyu2 =" blue ";
        String riyu3= riyu1 + riyu2;
        return riyu3;


}
	// int 
	public static int sky1 () {
		int riyu4 = 45;
		int riyu5 = 55;
		int addition = riyu4 + riyu5;
		return addition;
	}
	
	// while loop
	
	public static int sky3() {
		int riyu6=45;
		
		while(riyu6<=100) {
			System.out.println(riyu6);
			riyu6++;
			
		}
			
		return riyu6;
	}
	
	// object 
	public static Object sky4 () {
		int riyu7 = 45;
		String riyu8 = "Islam";
		Object riyu9 = riyu7+riyu8;
		return riyu9;
	}
	
	// do while loop
	
	public static void sky5() {
		int riyu10 = 35;
		do {
			System.out.println(" value for riyu10: "+riyu10);
			riyu10--;
		} while (riyu10>=2);
			
		}
	
	
}
