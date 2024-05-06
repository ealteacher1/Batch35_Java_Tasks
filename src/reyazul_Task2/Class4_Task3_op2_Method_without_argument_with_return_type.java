package reyazul_Task2;

public class Class4_Task3_op2_Method_without_argument_with_return_type {

	public static void main(String[] args) {
		// method int single dim array
		
		int [] riyu = riyu1();
		for (int riyu2:riyu) {
			System.out.println(riyu2);
		}
		// Object array single dim
		
		Object t []= riyu45();
		for (Object R:t) {
			System.out.println(R);
		}
		
		//two dim for Object 
		Object [][] a5 = tahu ();
		for (Object [] e1:a5) {
			for(Object d5:e1) {
				System.out.println(d5);
			}
		}
		//two dim for String
		
		String[][] a4=cat1();
		for(String[] d1: a4) {
			for(String s1:d1) {
				System.out.println( s1);
			}
			
			
		}
		
		}
		
		
		
		
		
		// int single dim array 
		
		public static int [] riyu1() {
			int riyu1[] = {4,6,8};
			return riyu1;
		}
		
		//Object array single dim
		
		public static Object [] riyu45 (){
			Object [] sky = {45,"blue","dark"};
			return sky;
		}
		// Object array for two dim 
		
		public static Object [][] tahu(){
			Object taha [][] = {{45,"valo"},{40,"aco"}};
			return taha;
		}

		
		// tow dim array for string
		
		public static String[][]cat1(){
			String dog [][]= {{"mini","mimi"},{"tom","tomy"}};
			return dog;
		}
	}	
	
