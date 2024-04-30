package Samia_Z;

public abstract class Task_5_Java5 {

		public String stringmethod1() {
			return "Hello from strinMethod1";
		}
		public String stringmethod2() {
			return "Hello from strinMethod2";
		}
		public String stringmethod3() {
			return "Hello from strinMethod3";
		}
		public char charMethod1() {
			return'A';
		}
		public char charMethod2() {
			return'B';
	}
		public char charMethod3() {
			return'C';
		}
		public double doubleMethod1() {
			return 10.5;
		}
		public double doubleMethod2() {
			return 20.5;	
		}
		public double doubleMethod3() {
			return 30.5;
		}
		public int[][] 
				twoDimentionalArrayMethod(){
			int[][]array= {{1,2},{3,4}};
				return array ;
		}
		public int[]
				oneDimentionalArrayMethod(){
			int[]array= {1,2,3,4,5};
				return array ;
		}
		public static void main (String [] args) {
			Class_A classA =new Class_A();
			System.out.PRINTLN(ClassA.StringMethod1());
			System.out.PRINTLN(ClassA.StringMethod2());
			System.out.PRINTLN(ClassA.StringMethod3());
		}
}




