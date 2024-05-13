package Israts_Java_2;

public class Class_AM1 {

	public static void main(String[] args) {
		
  //CALLING NS-METHOD 		
		Class_AM1 PublicNSmethod = new Class_AM1 ();
		PublicNSmethod.publicns1();
		Class_AM1 publicNSmethod2 = new Class_AM1 ();
		publicNSmethod2.publicns2();
		Class_AM1 PrivateNsmethod1=new Class_AM1 ();
		PrivateNsmethod1.private1();
		Class_AM1 protectedNsmethod1 = new Class_AM1();
		System.out.println(protectedNsmethod1.protected1(10,20));
		Class_AM1 protectedNsmethod2 = new Class_AM1 ();
		protectedNsmethod2.protected2();
		Class_AM1 protectedSmethod = new Class_AM1 ();
		System.out.println(protectedSmethod.protected3( 50,2));
		Class_AM1 DefaultNsmethod1 = new Class_AM1 ();
		DefaultNsmethod1.default1();
		Class_AM1 DefaultNsmethod2 = new Class_AM1();
        System.out.println(DefaultNsmethod2.default2());
	
    //CALLING STATIC METHOD 
		addition() ;
		private2 ();
		default3();
	
		
		
	}
// PUBLIC NON-STATIC METHOD 
	public void publicns1 () {
		String a="nspublic ";
		String b="method " ;
		String c=a+b;
		System.out.println(c);
	}
	public void publicns2 () {
		int  a=10;
		int  b=20;
		int c=a+b;
		System.out.println("The Print out value of : "+c);
}

 // PUBLIC  STATIC METHOD  
	public static void addition() {
		int x=10;
		int y =20;
		System.out.println("The total of addition :" +x+y);
	}
 //PRIVATE NON-STATIC  METHOD 
	private void private1 () {
		String a="nsprivate ";
		String b="method1 " ;
		String c=a+b;
		System.out.println(c);	
	}
 
//PRIVATE STATIC METHOD 
	private static void private2 () {
		int easy = 50;
		int money=100;
		int make = easy+money ;
		System.out.println("Everyone would love to make easymoney lets start with : "+make);
	}

//PROTECTED NON-STATIC METHOD 
	protected  int protected1 (int multi, int plication) {
		int multiplication = multi*plication;
		return multiplication;
	}
	public void protected2() {
		Object pro[][] = {{10, "Solar"}, {20,"Eclips"}};
		for (Object pro1[] :pro) {
			for (Object tected:pro1) {
				System.out.println("The print out value of method protected :" +tected);
			}
	 }
 }
//PROTECTED STATIC METHOD 
		public static int protected3 (int split, int half) {
			int dividen = split / half;
			return dividen;
	}

//DEFAULT NON-STATIC METHOD 	
	  void default1() {
		String Laugh[] = {"Laugh","your","Heart","Out"};
		for (String Loudly:Laugh) {
			System.out.println("The print out statement of deault method : " +Loudly);
        }
	}
	   int  default2 () {
		   int math  =  50;
		   int science =60;
		   int english = 90;
		   int avg= math+science+english /3;
		   return avg;     
	   }
// DEFAULT STATIC METHOD 
	    static void default3() {
			String firstin= "default ";
			String lastout= "static"; 
			String FIFO = firstin + lastout ;
			System.out.println("The print out statement of: "+FIFO);
}
}