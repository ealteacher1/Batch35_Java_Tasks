package tasks_shaheena;

public class Test extends Animal {
	
	Test(){
		System.out.println("Test Class Constructor");
		
	}

	public static void main(String[] args) {
		
	
		//Top Casting, creating object using parent class reference  variable to call methods,variables from the class
	    // called the Constructor of Child Class,
		//doing top casting for Test object.

		Animal ob = new Test();
		ob.eat();
		ob.sound();
		ob.sleep();
		ob.run();
			
		}

	

	@Override //abstract method from Animal parent class
	public void sleep() {
	
		
	}

	@Override  //abstract method from Animal parent class
	public String sound() {
	
		return null;
	}

}
