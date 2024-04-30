package reyazul_Task2;

public class Class4_Task1_Method_without_arguments_non_return_type {

	public static void main(String[] args) {
		

		
		addition ();
		subtraction ();
		multiplication ();
		lowerthan();
		whileloop ();
		
	}
	// task 1 method without argument - non return type;
	
	public static void addition () {
		int riyu = 45;
		int reyaz = 50;
		System.out.println(riyu+reyaz);
		
	}
	
	public static void subtraction () {
		int riyu = 20;
		int reyaz = 45;
		
		System.out.println(riyu - reyaz);
	}
	
	
	
	public static void multiplication () {
		
		float riyu = 55.3f;
		double reyaz = 5.9;
		System.out.println(riyu*reyaz);
	
	}
	
	public static void lowerthan() {
		boolean riyu = true;
		boolean reyaz = false;
		
		if (riyu != reyaz) { // we can use any logical code;
			
			System.out.println("result: "+true);
		}
		
		else {
			System.out.println("result: "+false);	
			}	
		
		}
	
	// While Loop
		public static void whileloop () {
			int riyu4 = 25;
			String reyaz = "Age = ";
			
			while (riyu4 <=30) {
				System.out.println(riyu4+reyaz);
				riyu4++;
			}
			
		}
		
		//Done*!!! 
}
