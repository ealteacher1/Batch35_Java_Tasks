package suzy_java2;

public class Class_D {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		 Class_D life = new Class_D ();
		 Class_D money= new Class_D (10);
		 Class_D night= new Class_D (" string b");
		 Class_D joy = new Class_D (20,30);
		 Class_D happy= new Class_D (20,30,40);
		 
//		 calling non static method --
		 Class_D late =new Class_D() ;
			late.nsmethod() ;
			System.out.println(	late.nsmethod());
			 
		 }

	 
//Task 6 --
	
	
//	Create 5 constructors --
	
//	create first constructor --
	
	public Class_D () {
		System.out.println("caling constructor1");
		
	}
//		create 2nd constructor --
		public Class_D (int a) {
		
			System.out.println("caling constructor2 "+a);	
		
		
		}
//		create 3rd constructor --
		public Class_D (String b) {
			System.out.println("caling constructor3 "+b);	
			
		}
		
//		create 4th constructor --
		public Class_D (int x,int y) {
		int c =x+ y;
			System.out.println("caling constructor4  "+c);
		}
		
//		create 5th constructor --
		public Class_D (int x,int y ,int t) {
			int z= x+y+t ;
			System.out.println("caling constructor5  "+z);
		}
		
//	CREATE A NON STATIC METHOD FROM CLASS_D --
		public String nsmethod  () {
			String three = "old ";
		return three;

		}
}
		
		
	
	
	


