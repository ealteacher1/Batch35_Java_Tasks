package suzy_java2;

public class Class_A {

	public static void main(String[] args) {
	

		 Class_A girl = new Class_A ();
			girl.nspublic();
			Class_A boy = new Class_A ();
			boy.nsprivate();
			Class_A kids = new Class_A ();
			kids.nsprotected();
			 Class_A life = new Class_A ();
				life.nspublic();
				Class_A dance=new Class_A();
				dance.garden();
				Class_A flower =new Class_A ();
				flower.day();
				Class_A date=new Class_A ()  ;
				
			date.day();
			
			
//	calling class _A from c --	
			class_c saturday =new class_c ();
			saturday.CallinFromC ();
			System.out.println(saturday.CallinFromC ());
			
	}
//	create 3 non static method using public ,PROTECTED,private ,default --
			
		
//	WITH PUBLIC --
	public void nspublic() {
		String a =" nspublic" ;
		String b = "=non static ";
		String c = a+b ;
		System.out.println(c);
		
	}
	
//	  WITH PRIVATE --
	private void nsprivate () {
		String a= "nsprivate";
		String b="non static ";
		String c =a+b ;
	  System.out.println(c);
	}
//	  WITH PROTECTED --
	  protected void nsprotected () {
		  String a= "nsprotected ";
		  String b= "non static ";
		  String c=a+b ;
		  System.out.println(c);
	  }

//	  WITH DEFAULT --
	  void nsdefault () {
		  String a= "nsprotected ";
		  String b= "non static ";
		  String c=a+b ;
		  System.out.println(c);
		  
		  
	  }
// create one dimensional array --
	  public int[]garden  () {
	  int[]night = {10,20};
	  for (int a : night ) {
		  System.out.println(a);
	  }
	  return night;
	  }
	  
	  
//	  create 2 dimensional array --
	  public int [][]day (){
		  int[][]c= {{5,10},{12,14}};
		  for(int [] b:c) {
			  for(int d:b)
			  
			  
		System.out.println(d);
		  }
		  return c ;
	  }
	  
	  
//	  
	  
	  }
	  

	
	


