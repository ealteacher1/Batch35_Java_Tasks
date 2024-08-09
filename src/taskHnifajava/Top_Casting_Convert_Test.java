package taskHnifajava;

public class Top_Casting_Convert_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
			//b.Create 2 object by top Casting and Convert the Objects(Run and check if Java Allows it or not)
		   
			
			// C1 child class extends to C2 parent class 
			//Top casting, using parent class reference, call the constructor of child class  
			
			
			
			C2 ob= new C1(); //overridden method from child class 
			 ob.m1();
			
			
			// Shifting object  from  child class to parent class 
			
			 C2 ob1 = (C2) new C1();
			 ob1.m1();  //overridden method from child class
}}
