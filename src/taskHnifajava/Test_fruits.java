package taskHnifajava;

public class Test_fruits {

	public static void main(String[] args) {
	

	
	///Java-6_Task_3. Dynamic Polymorphism.(Compiler will say, method is coming from one Class, But in real it will come from another Class

		    

		
				 
			 //assigning child class object to parent class reference
			  Fruits1 fruits =new Apple1();
			  
			 //invoking the method
			  fruits.color();
				

			    }
			 
		        }


			    class Fruits1 {

				
				public void color(){
					
				System.out.println("Parent class method");
					
					
		          }
				
			      }	
				 
			    class Apple1 extends Fruits1{
				//overrides the color method of parent class 
			    	
				@Override
				public void color() {
						
				System.out.println("child class method");
						
				  }
}
