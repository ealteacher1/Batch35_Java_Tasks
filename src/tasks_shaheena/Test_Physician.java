    package tasks_shaheena;


    // Java_6_Task_3- Dynamic Polymorphism.(Compiler will say, methodis coming from one Class, But in real it will come from another Class


    public class Test_Physician {

	public static void main(String[] args) {
	//assigning a child class object to parent class reference 
		
	physian ob =new  Surgeon1();
	ob.treatpatient();
					
		
	// treatPatient method in child class Physician will be executed
	}
	
	}
    
    
	class Surgeon1 extends physian{
		
	@Override
	public void treatpatient() {
			
	System.out.println(" child class method");
	
	}
	
	}
	
	 class physian{
		 
	 public void treatpatient() {
			 
	 System.out.println("parent class method ");
	 
	 }
	 
	 }
	
	
	


 
	
		
		  
		


