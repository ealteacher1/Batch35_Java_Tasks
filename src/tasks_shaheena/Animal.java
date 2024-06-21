package tasks_shaheena;

 abstract class Animal {
	 
	 
	 //constructor
	 Animal(){
		
		 System.out.println("Animal class constructor");
		 
	 }
	 
	 
	 //non return type abstract method 
	 public abstract void sleep();
	 
	 //return Type abstract method 
	 public abstract String  sound();
	  
	 // normal non return type method 
	 public void eat() {
	 System.out.println("eat method from Animal-parent class" );
	
	 }
	 
	 public void run() {
		 System.out.println(" Run method from Animal- parent class");
	 }

      }

