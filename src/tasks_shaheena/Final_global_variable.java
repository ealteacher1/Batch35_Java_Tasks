package tasks_shaheena;



          public class Final_global_variable {
	
	      //Global variables with final keyword 
	
	      final int x = 10;

	      final int  CheckingAcctDeposit = 500;
	
	      final int speed= 100;
	
	      final String s = "Hello";
	
	      final double grade = 90.50;
	  
	
	
	
	

	      public static void main(String[] args) {
	
	      Final_global_variable   obj = new Final_global_variable();
		
		  // obj.x= 25;                   // shows an error: "The final field Final_global_variable.x cannot be assigned"
		                                  //global variable with final keyword  can not be changed .
		                                  // will generate an error: cannot assign a value to a final variable
	      
	      
	      System.out.println(obj.x);
		
		
		  Final_global_variable obj1 = new Final_global_variable();
		  
		
	      //obj1.CheckingAcctDeposit=600;  //Error message shown in console : The final field Final_global_variable.CheckingAcctDeposit cannot be assigned
		 
		  System.out.println(obj1.CheckingAcctDeposit);
		
	
		  Final_global_variable obj2 = new Final_global_variable();
		  
		
		   //obj2.speed=120;
		
		  System.out.println(obj2.speed);
		

		  Final_global_variable obj3 = new Final_global_variable();
		
		  // obj3.s="Hi";                    //Shows an error message:The final field Final_global_variable.s cannot be assigned
		  
		  //Shows an error The final field Final_global_variable.s cannot be assigned
		  System.out.println(obj.s);
		
		
		  Final_global_variable obj4 = new Final_global_variable();
		
		  //obj4.grade=99.50;              //Shows an error message : The final field Final_global_variable.grade cannot be assigned. 
		
		  System.out.println(obj4.grade);
				
	}

}
