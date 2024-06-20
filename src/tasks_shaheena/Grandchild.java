package tasks_shaheena;

   

      public class Grandchild extends Son {
    
	   @Override
	   public void sing() {
	     System.out.println("Method-Grandchild" );
	   
       }
	   
	   public void dance() {
		 System.out.println("Method-Grandchild" );   
		   
	   }
	   
	   public void talk() {
		   
		 System.out.println("Method-Grandchild" );   
		   
	   }
    

        public Grandchild() {
	
	  System.out.println("Default Constructor -Grandchild");
	
      }
        public Grandchild(String name) {
        	System.out.println("parameterized constructor-Grandchild");
        	
        	
        	
        }
   }