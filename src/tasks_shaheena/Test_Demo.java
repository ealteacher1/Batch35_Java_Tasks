     package tasks_shaheena;


      //Java_6_Task_3. Dynamic Polymorphism.(Compiler will say, methodis coming from one Class, But in real it will come from another Class

       public class Test_Demo {

	   public static void main(String[] args) {
	
	 
		 
		//assigning a child class object to parent class reference  
		Sample obj = new Demo();  
		//invoking display() method  
		obj.display();  
	    }
	
        }
     
        //parent class  
	    class Sample{  
	 
	   //method of the parent class  
	    public void display() { 
	  
	    System.out.println("Overridden Method");
	    
	    }  
	    
	    } 
	    
	    //derived or child class  
	    class Demo extends Sample{  
	  
	    //method of child class 
	    	
	    public void display(){  
	  
	    System.out.println("Child class -Overriding Method"); 
	    
	    }  

	    } 
	 
