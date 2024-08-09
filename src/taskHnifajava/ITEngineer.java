package taskHnifajava;
///java_6_4_part_1 : Create 2 Class and Prove Constructor is Called from Both Classes while TopCasting is Executed.
//child class extends to parent class 

public class ITEngineer extends Employee1{

	public static void main(String[] args) {





  


	 
	 //assigning a child class object to parent class reference, did top casting here
		Employee1 emp = new ITEngineer(); 
		emp.m1();
		emp.m2();

	}
	  
    //default constructor
	  public ITEngineer() {
	  
	  System.out.println("default constructor from child class-ItEngineer");
	  
    }
	// Parameterized Constructor-
   public ITEngineer(String name ) {
   	
   	System.out.println(" Parameterized Constructor-child class");
     }
}
