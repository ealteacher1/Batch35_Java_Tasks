package tasks_shaheena;

public class Nested_if {

	public static void main(String[] args) {
		/*Nested if statement represents if block within another if block'
		 * 
		 * Inner if Block condition executes only when the outer if block condition is True*/
		 /* Syntax: 
		  * if(Condition){
		  *	// Code to be executed
		  *	}if(condition){
		  * //code to be executed
		  * }*/
		  
		  int a =6;
		  int b =60;
		  int c= 6000;
		  
		  if(a<b){   // outer condition has to be true 
			  
		  if(a>c){  //this condition is false ,so it'll print , else 
			System.out.println("A is less");  
			  
		  }else {
			System.out.println("C is bigger");  
			  
		  } 
			  
		  }

	}

}
