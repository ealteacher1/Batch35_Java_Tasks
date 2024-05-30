package suzy_java3;

public class Suzy_task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		calling method overloading --
	Suzy_task2 ob = new Suzy_task2 ();
	ob.suzy();
	ob .suzy(1);
	ob.suzy("fun");
	ob.suzy(2);
	ob.suzy("love");
	ob.suzy(4);
	ob.suzy("joy");
	ob.suzy(6);
	ob.suzy(8);
	ob.suzy("sun");
	
//	   calling constructor overloading --
	Suzy_task2 constructor1  = new Suzy_task2 ();
	Suzy_task2 constructor2 = new Suzy_task2 (10);
	Suzy_task2 constructor3 = new Suzy_task2 (13,14);
	Suzy_task2 constructor4 = new Suzy_task2 (12,12,12);
	Suzy_task2 constructor5 = new Suzy_task2 ("fun");
	Suzy_task2 constructor6 = new Suzy_task2 (10,20,"boy");
	Suzy_task2 constructor7 = new Suzy_task2 ("girl");
	Suzy_task2 constructor8 = new Suzy_task2 (12,"girl");
	Suzy_task2 constructor9 = new Suzy_task2 (12,12,"man",12);
	Suzy_task2 constructor10 = new Suzy_task2 ("life","day");

	}
	
	
//  create a method and overload it 10 times --
	public void suzy () {
		System.out.println("calling method 1 ");
	}
	
	public void suzy (int s ) {
		System.out.println("calling method 2  ");
		
	}
	public void suzy (int a,int b) {
		System.out.println("calling method 3");
		
	}
	public void suzy (int a,int b ,int c) {
		System.out.println("calling method 4");
	}
	public void suzy (String a) {
		System.out.println("calling method 5");
	
	}
	public void suzy(String b,int x) {
		System.out.println("calling method 6");
	}
	public void suzy (int x,String t) {
		System.out.println("calling method 7");
	
	}
	public void suzy(int f,int w,int z,int g) {
		System.out.println("calling method 8");
	}
	public void suzy(String h,int f,String p) {
		System.out.println("calling method 9");
		
	}
	public void suzy(int q,int e,String t,String j) {
		System.out.println("calling method 10 ");
	}
	
	
//	overload a class  constructor 10 times --
	
	public Suzy_task2 () {
		System.out.println("calling constructor 1");
	}
	
	public Suzy_task2 (int x) {
		System.out.println("calling constructor 2");
	}
	public Suzy_task2 (int x,int y) { 
		System.out.println("calling constructor 3");
	}
	public Suzy_task2 (int x,int y,int v) { 
		System.out.println("calling constructor 4");
		
	}
	public Suzy_task2 (int x,int y,int v,int e) { 
		System.out.println("calling constructor 5");
	}
	
	public Suzy_task2 (int x,int y,String b) { 
		System.out.println("calling constructor 6");
		
	}
	public Suzy_task2 (String y) { 
		System.out.println("calling constructor 7");
		
	}
	public Suzy_task2 (int x,String w) { 
		System.out.println("calling constructor 8");
	}
	
	public Suzy_task2 (int x,int y,String p,int f) { 
		System.out.println("calling constructor 9");
	}
	public Suzy_task2 (String p,String b) { 
		System.out.println("calling constructor 10");
		
		
		
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

