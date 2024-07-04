package tasks_shaheena;

public class ExceptionHandling_Task {
	
	
	//1.Handle Below exceptions with Try Catch and Finally Block.
	//a. Thread.sleep.
	//b. int result=10/0;
	//c.Int[]x=newint[2];
	// System.out.println(x[5]);
	//–It should give arrayoutofboundexception.Handlethat


	public static void main(String[] args) {
		
	    // this line will be printed first
		System.out.println("Start counting the time ");
		
		//error part will be handled here,Thread.sleep should be executed, after the first line program will wait for 5 seconds
		try {
			
		Thread.sleep(5000);	
			
		}catch(InterruptedException e) {
			
			e.printStackTrace();
			
			System.out.println("This is a Thread");
			
		}
		
		//Then the value of c will be printed 
		String a ="Shaheena";
		String b= "Rahman";
		String c = a+b;
		System.out.println(c);

		
		try {
			
		int result=10/0;
		// Exception is a classw, handles evry exception
		
		}catch(Exception e ) {
			
		System.out.println("zero is not allowed to divide");
		
		
		
		
		try {
			
		//Handled array out of bound exception 
		int x []= new int[2];
		
		System.out.println(x[5]);
			
		}catch(Exception ex ) {
			
		System.out.println("Arrayoutofbound exception");
		}
			
		}
		
	    }
	    
        }
	
	
	
	

	 

