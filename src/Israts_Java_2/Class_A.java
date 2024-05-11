package Israts_Java_2;

public class Class_A {

	public static void main(String[] args) {
		
	Class_A c1= new Class_A (); 
	c1.publicns();
	c1.abc();
	
	Class_A c2= new Class_A ();
	c2.privatens ();

	Class_A c3= new Class_A ();
	c2.protectedns ();
	
	Class_A c4= new Class_A ();
	c2.defaultns ();
	
	Class_A c5=new Class_A ();
	c5.abc();
	
	for (int k:c5.abc()) {
		System.out.println("The retuning value method name abc : "+ k);
		
	}
	
	 for (Object kk[]:c5.hello()) {
		 for (Object kkk:kk) {
			 System.out.println("The retuning value of kkk : "+ kkk);
		 }
	
//CALLING FROM CLASS C
	Class_C callingfromC=new Class_C ();
	callingfromC.CaliingfromC();
			
	 }

	}
	
	
// 3 NON-STATIC METHOD OF EACH TYPE 
// PUBLIC METHOD
	public void publicns () {
		String a="nspublic ";
		String b="method " ;
		String c=a+b;
		System.out.println(c);
	}
 // PRIVATE METHOD
	private void privatens () {
		String a="nsprivate ";
		String b="method " ;
		String c=a+b;
		System.out.println(c);
	
	}
 // PROTECTED METHOD
	protected void protectedns () {
		String a="nsprotected ";
		String b="method " ;
		String c=a+b;
		System.out.println(c);

}
	// DEFAULT METHOD 
	void defaultns () {
		String a="nsdefault ";
		String b="method " ;
		String c=a+b;
		System.out.println(c);
	
}
 //1 DIMEnIONAL ARRAY 
 public int[] abc() {
		int a []= {20,30};
		for (int k:a) {
			System.out.println("printing in method value of a : "+ k);
		}
		 
		return a;
	}
//2 DIMENTIONAL ARRAY 
	public Object [][] hello () {
		Object [][] world= {{1,2,3},{4,5,"hi"}};
		//for (Object []d:world) {
			//for (Object e:d) {
				//System.out.println("The returning value of e :"+e);
			//}
		//}
		return world;
	} 
	}
