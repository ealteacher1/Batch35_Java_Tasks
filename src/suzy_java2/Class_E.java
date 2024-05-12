package suzy_java2;

public class Class_E {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Class_D life = new Class_D ();
		 Class_D money= new Class_D (10);
		 Class_D night= new Class_D (" string b");
		 Class_D joy = new Class_D (20,30);
		 Class_D happy= new Class_D (20,30,40);
		 Class_D fun = new Class_D ();
		 fun.nsmethod();
		 
		
		 
//		 create object and calling CallingFromE method --
		 Class_E two = new Class_E () ;
	     two.CallingFromE();
	     System.out.println(two.CallingFromE());
	}

		
	
// create a method name called CallingFromE --
	public String  CallingFromE () {
		String one = "name ";
	return one ;

	
}
}