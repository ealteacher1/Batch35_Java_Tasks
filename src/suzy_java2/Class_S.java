package suzy_java2;

public class Class_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Class_S.method();
		 Class_S.protected1 ();
		 Class_S.private1();
		 Class_S.default1();
		 Class_S sun = new Class_S();
		 sun.method1();
		 Class_S pets =new Class_S();
		 pets.nsprotected ();
		 Class_S fun =new Class_S();
		 fun.nsprivate ();
		 Class_S job = new Class_S();
		 job.nsdefault ();
		 Class_S music =new Class_S();
		 music.car();
		 Class_S four = new Class_S();
		 four.big ();
		 Class_S rain =new Class_S();
		 rain.today ();
		 Class_S son = new Class_S();
		 son.far();
		 
	}
// TASK 7 --
//	CREATE ONE STATIC AND 2 NON STATIC METHODS OF EACH TYPE ACCESS MODIFIER --
	
//	CREATE STATIC METHOD --
	
//	with public --
	public static void method () {
		int a=10 ;
		int b=20;
		int c=10+20;
		System.out.println(c);
	}
		
// with protected --
		protected static void protected1 () {
		String a ="Remy ";	
		String b ="Emily";
		String c = "Remy+Emily";
		System.out.println(c);
		}
		
// with private --
		private static void private1 () {
		float a =1.3f;
		float b= 1.2f;
		float c =1.3f;
		System.out.println(c);
		}
		
// with default --
		 static void default1 () {
		double a = 1.5 ;
		double b= 2.5 ;
		double c = a+b;
		System.out.println(c);
			
		}
		 
// create non static method --
		 
//  with public --
public void method1 (){	
	int a =2;
	int b= 4 ;
	int c = a+b ;
	System.out.println(c);
}
	
	//	With protected --
	protected void nsprotected () {
		String a ="puppy ";
		String b ="dog";
		String c ="puppy+dog ";
		System.out.println(c);
	}
		
//	with private --
  private void nsprivate() {
  float a= 1.5f;
  float b= 1.6f;
  float c = a+b;
  System.out.println(c);
  }
  
//with default --
  void nsdefault () {
  double a = 3.5 ;
  double b = 4.5 ;
  double c = a+b ;
  System.out.println(c);
  }
  
//  create non static method --
//  with public --
  public void car   () {
int a = 20 ;
int b = 10 ;
int c = 30 ;
System.out.println(c);
  }

//with protected --
protected void big () {
	String a= "one ";
	String b ="two ";
	String c = a+b;
	System.out.println(c);
	
}
//with private --
 private void today() {
	float a= 1.2f ;
	float b =1.3f;
	float c =a+b;
	System.out.println(c);
}

// with default --
    void far() {
	double a = 3.5 ;
	double b= 4.5;
	double c= 3.5+4.5 ;
	System.out.println(c);
	
	
	
	
	
	
	
	

	
 

	
	
	
	  
  }
		  
	
	
}
		
		
		
		
		
			
			
		
			
		
	
	


