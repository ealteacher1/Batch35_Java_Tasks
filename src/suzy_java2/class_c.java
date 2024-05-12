package suzy_java2;

public class class_c {
	
	
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
//		calling from class_ A --
		Class_A callingfromA = new  Class_A();
		callingfromA.nspublic();
		callingfromA.nsprotected ();
		callingfromA.nsdefault ();
		  int k []=callingfromA.garden();
	        for (int k3:k) {
	            System.out.println("The retuning value of method abc from class_A : "+ k3);
	        }
	        
	        int [][]kk =callingfromA.day();
	        for (int k1[]:kk) {
	             for (int k2:k1) {
	                 System.out.println("The retuning value of method hello from class_A : "+ k2);
		
		
	             }
	
	}
	}
//	create public non static method name "CallingFromC" inside a method --
	public String CallinFromC () {
		String a= "day";
		return a ;
	
		
	}

}