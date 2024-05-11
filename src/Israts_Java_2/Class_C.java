package Israts_Java_2;

public class Class_C {

	public static void main(String[] args) {
		Class_C call = new Class_C ();
		call.CaliingfromC();
		System.out.println(call.CaliingfromC());
		
//	CALLING FROM CLASS A
		Class_A callingfromA=new Class_A ();
		callingfromA.publicns();
		callingfromA.protectedns();
		callingfromA.defaultns();
		int k []=callingfromA.abc();
		for (int k3:k) {
			System.out.println("The retuning value of method abc from class_A : "+ k3);
		}
		Object [][]kk =callingfromA.hello();
		for (Object k1[]:kk) {
			 for (Object k2:k1) {
				 System.out.println("The retuning value of method hello from class_A : "+ k2);
			 }
		
		}
	}
// METHOD NAME - CallingfromC
	public String CaliingfromC () {
		String c = "Call from C";
		return c;
	}
}
