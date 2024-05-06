package reyazul_Task2;

public class Class4_Task4_Method_with_arguments_with_return_type {

	public static void main(String[] args) {
		
		// method with argument and with return type
		
		System.out.println(R(45, 40)); // addition
		System.out.println(r(66,20)); // subtraction
		System.out.println(r2(43020.1f ,204.0f)); // division
		System.out.println(r3("Israt " , "Reyaz")); // String
		System.out.println(r4("Reyazul ", 'T', " Islam"));// Object
		
		
		//task 2
		
		
		
		
		
		Object[] ary1 = r5(1);
		ary1[0] = 45;
		ary1[1] = "city";
		ary1[2] = "nyc";
		ary1[3]=true;
		for (Object array1:ary1) {
			System.out.println(array1);
					
		}
		
		String [] ary2 = r6("");
		ary2 [0]="Riyu";
		ary2[1]="Islam";
		for (String array2:ary2) {
			System.out.println("This Is for String: " +array2);
			
		}
		
		float [] ary3 = r7 (2.4f);
		ary3 [0]= 55.7f;
		ary3[1]= 45.45f;
		for (float array3:ary3) {
			System.out.println("this is for float: "+array3);
		}
		
		int [] ary4 = r8(20,30);
		ary4[0]=10;
		ary4[1]=20;
		ary4[2]=30;
		ary4[3]=40;
		
		for (int array4 : ary4) {
			System.out.println("This is for Int: "+array4);
		}
		

	}
	
	// int 
	// addition
	public static int R (int x, int y) {
		int love = x+y;
		return love;
	}
	//subtraction 
	// double
	
	public static double r(double sub, double sub1) {
		double r = sub-sub1;
		return r;
	}

	
	// float 
	// divison
	
	public static float r2 (float float1 , float fl2) {
		float r2 = float1 / fl2;
		return r2;
	}
	
	//String 
	
	public static String r3 (String string1, String string2) {
		String r3 = string1+string2;
		return r3;
	}
	
	// Object 
	
	public static Object r4 (String first, char last , String middle) {
		Object r4= first +last+ middle;
		return r4;
	}
	
	//End
	
	
	
	//Task 2
	
	
	public static Object [] r5( Object a1) {
		Object r5 [] = new Object[4];
		return r5;
	}
	
	public static String [] r6(String a2){
		String r6 [] = new String[2];
		return r6;
		
	}
	
	public static float [] r7 (float a3) {
		float r7 [] = new float [2];
		return r7;
	}
	
	public static int [] r8 (int a4,int a5) {
		int r8[] = new int[4];
		return r8;
	}
}


