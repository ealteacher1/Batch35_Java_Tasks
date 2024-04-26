package tasks_shaheena;

public class Calculate_average {

	public static void main(String[] args) {
	
		
		/*Get the Grade Of students..
		 * 
		 *Students got Marks in:
		 * Computer = 90 
		 * Science  = 60
		 * Math     = 50
		 * Find the Average , then need to do Grading 
		 */
		
		 /* If Average is 90 - 100 ) Print: Student Got Grade- A
		  * If Average is 80 -  89 )  Print: Student Got Grade-B
		  * If Average is 70 -  79 ) Print: Student Got Grade- C 
	      * If Average is 60 -  69 ) Print: Student Got Grade- D */
		
		
		 int Computer  =  90;
		 int Science1  =  90;
		 int Math1     =  90;
		  
		 
		 int Total = Computer+ Science1+ Math1;
		
		 float Average = Total/3f;
		 System.out.println(Average);
		 
		  if (Average>=90 ||  Average <= 100) {
			 
		  System.out.println("Grade Of Student =A"); 
			 
		  }else if(Average>=80 &&  Average >=90){
		 
		  System.out.println("Grade of Student = B");
				 
		  }else if( Average >=70 && Average <=79){
			
		  System.out.println("Grade of Student = C");	
			
			
	      }else {
				
		  System.out.println("Program is successful");
			
	      }
		
		
		
		
		
		}

	


	}


