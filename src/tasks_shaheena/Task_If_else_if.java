package tasks_shaheena;

public class Task_If_else_if {

	public static void main(String[] args) {
		
		
		int Computer=95;
		int Science =90;
		int Math =99;
		int Total = Computer+Science+ Math;
		
		float Average=Total/3f;
		
		System.out.println(Average);  //Prints average marks
		
		
	       if ( Average >=90 && Average  <=100) {
	    	System.out.println("Grade Of Student is = A");   
	       
	       } else if (Average >= 80 && Average <=89) {
	    	 System.out.println("Grade of Student is = B");  
	       
	       }else if (Average>=70 && Average <=79) {
	    	 System.out.println("Grade of Student is = C");  
	    	   
	       }else { 
	    	System.out.println("Students reTake the exam");
	       
	       }}}
	       

	

