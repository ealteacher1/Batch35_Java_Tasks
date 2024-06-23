package taskHnifajava;



//Child of C2 and Grand child of C1


public class S6_T2_Q1_C3  extends  S6_T2_Q1_C2{
	
	// c.   3 Overridden methods From Child Class 
	  
	   
	   public void Resiliency() {
		
		System.out.println("Grandchild-C3");
	}
	   
	 public void Integrity() {
		 
		 System.out.println("Grand child-C3");
	 }  
	
	 // 3 overridden method  
     public void Honesty() {   
 	
 	System.out.println("C3-Grandchild inherits from Grand parent-C1");  
 	
 	
 }
     public void  patience() {    //
     	
     	System.out.println("C3-Grandchild inherits from Parent-C2");
     	
     }	
     public void intelligence() {
     	
     	System.out.println("C3-Grandchild inherits from Parent-C2");
     }
}