package reyazul_Task2;

public class Class_D {

	public static void main(String[] args) {
		
		Class_D obj = new Class_D();
		Class_D obj1 = new Class_D( 45);
		Class_D boj2 = new Class_D(6," Riyu ");
		Class_D obj3 = new Class_D(27," Rey ", 45.66);
		
		

	}
	
	
	public Class_D () {
		System.out.println( "constructor with no argument: ");
		
	}
	
	public Class_D (int x) {
		System.out.println("Constructor with Int: " +x);
		
	}
	
	public Class_D ( int x, String name) {
		System.out.println("Constructor with int and String: "+ x + " String " + name);
	}
	
	public Class_D (int x , String name , double value) {
		System.out.println("constrocutor with int, String, double "+ x + name + value);
		
	}

}
