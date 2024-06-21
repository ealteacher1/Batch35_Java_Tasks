   package tasks_shaheena;

    abstract  class Deer extends Animal{
	
	   
	    //non return type abstract method 
		public  abstract void sleep();
	  
	
		 //return Type abstract method 
		 public abstract  String  sound();
	

		
		
		 
		 
		
	      @Override
		  // normal non return type method 
	      public void  eat() {
		  System.out.println("eat method from Deer class");
	
	

            }
	      @Override
	      public void run() {
	    	System.out.println("Deer Runs very fast");  
	    	  
	      }
	  
	  }
  
   
  
   
