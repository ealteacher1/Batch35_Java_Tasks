package Shams_Demo;

public class Java_class_34_35_task1 {

	public static void main(String[] args) {
		public static int add(int a, int b) {
			return a+b;
		}
		public static double subtact(double a, double b) {
			return a-b;
		}
		public static float multiply(float a,float  b) {
			return a*b;
		}
		public static double divide(int a,int b) {
			if (b!=0){
				return(double) a/b;
			}else {
				System.out.println("error:division by zero");
				return Double.NaN;//not a number
			}
		}
		public static void checkNumber(int num) 
		{
		if (num>0) {
			System.out.println("the number is positve");
		}else {
			System.out.println("the number is zero");
			
		}
		}
		public static void main (String[]args){
		
			System.out.println("Addition result:"+add(5,3));
			System.out.println("Substraction result:"+ subtact(10.5,3.2));
			System.out.println("multiplication result:"+ multiply (4.5f,2.3f));
			System.out.println("division result:"+ divide(8,2));
			checkNumber(-7);
			
		}
				
			}
	




	}

}
