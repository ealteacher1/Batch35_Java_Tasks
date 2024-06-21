package tasks_shaheena;

public class Test_Type_Down_Casting {

	
	 //a.Create 3 Objects by doing Down Casting and Convert the Object to another Class. And run and Check if Java Allows it or not.
	 
	
	
	public static void main(String[] args) {
		
	//Using reference of Child class , calling constructor of parent class, convert parent class object to child class 
	//I need to make JVM understand that methods coming from child class.
	
	 C1 ob = (C1) new C2();  
	 ob.m1();
	 ob.m2();
	

	
	 C2 ob1 = (C2) new C3();
	 ob1.m1();
	 ob1.m4();
	

	
	 C3 ob2 = (C3) new C4();
	 ob2.m4();
	 ob2.m1();
	
	// java. exception .lang.ClassCastException , Type casting is not possible in java

	}

}
