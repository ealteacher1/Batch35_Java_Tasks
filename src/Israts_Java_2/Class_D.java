package Israts_Java_2;

public class Class_D {

	public static void main(String[] args) {
		//CALLING CONSTRUCTOR 
		Class_D FirstConstructor= new Class_D ();
		Class_D SecondContructor= new Class_D (10);
		Class_D ThirdConstructor=new Class_D("Calling by my name ");
		Class_D ForthConstructor=new Class_D (15,20);
		Class_D FifthConstructor=new Class_D ("The world revolb around money ",1000);
        //CALLING NON-STATIC METHOD 
		Class_D Nsaddition = new Class_D ();
		Nsaddition.addition();
		Class_D Nsobjectarray =new Class_D ();
		Nsobjectarray.objectarray(22,"Hello");  
	}
	

	
	
// 5 CONSTRUCTOR CREATED (
	
//1st Constructor 
	public Class_D () {
		
		System.out.println(" first Constructor " );
	}
// 2nd Constructor 	With Int
  public Class_D (int x) {
	  System.out.println("Second Constructor : "+ x);
  }
//3rd constructor with string 
  public Class_D (String y) {
	  System.out.println("Third Constructor : "+y);
  }
// 4rth constructor with int ,int 
  public Class_D (int a,int b) {
	  System.out.println("Forth constructor : "+a+b);
  }
//5th constructor with String ,int 
  public Class_D (String s,int i) {
	  System.out.println("Fifth Constructor : "+s+i);
  }

  
  // Access Modifier 
  public void addition () {
	  int add=50;
	  int db=90;
	  int addition =add+db;
	  System.out.println("Class_d addition method output :" +addition);
  }
  public void objectarray (int ob1,String ob2) {
	  Object ob3[]= {ob1,ob2};
	  for (Object ab4:ob3) {
		  System.out.println("The Printout value of object array : " +ab4);
	  }
	  
  }





	
}
	  


	

  

 


