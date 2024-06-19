    package tasks_shaheena;

    //Java_6_Task_3- Dynamic Polymorphism.(Compiler will say, methodis coming from one Class, But in real it will come from another Class

    public class Test_Vehicle {

	public static void main(String[] args) {
		
	//assigning a child class object to parent class reference 
	 Vehicle obj= new Truck();
	 obj.Brake();
	 
	 
	  }
	
      }

     class Vehicle{
    	 
     public void Brake(){
    	 
     System.out.println("Parent class method-Brake"); 
    		 
     }
     
     }


     class  Truck  extends Vehicle{
    	 
     @Override
     public void Brake(){
    	 
     System.out.println("Child class method-Brake ");
     
     }
    	
      
     }
    	
    	
    	
    	
    
