package tasks_shaheena;



          //Java_7_task_12 Create a Garbage Collector example with Finalize Method and Show how Garbage Collector is working.

          public class Finalize_method_GC {
	

	

	        public static void main(String[] args) {
		
		
	
		  
			Finalize_method_GC obj = new Finalize_method_GC();
			
			// The hashCode() method is used to generate the hash values of objects
			
	        System.out.println(obj.hashCode()); 
	        
	        obj = null;   
	        
	        // calling garbage collector 
	        
	         System.gc(); 
	        
	        System.out.println("End of garbage collection");   
	  
	         } 
	
	         
	         /*Finalize() is the method of Object class.
	          *This  method  which is called to delete objects,it's job is to collect  objects, which does not have any reference variable . 
              * and delete them.*/
	
	          public void finalize() {
	 		
			  System.out.println("This is Garbage Collector Method");
			 
	         }   
	 
             }
	
	
	
	
	
	
	


