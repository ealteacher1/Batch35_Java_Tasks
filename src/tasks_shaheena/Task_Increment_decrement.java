package tasks_shaheena;

public class Task_Increment_decrement {

	public static void main(String[] args) {
		
			/*A box is created in JVM memory for 'NY'  variable , value is 6
			 * JVM will  spot for  attached variable NY which is 6 here, 
			 * Then increase the value by 1 for attached variable NY . so NY value will be 6+1=7 now.
			 * For NJ JVM already placed the value 6. 
			 */
			 
			//Post-Increment 
		
			int NY = 6;
			int NJ = NY++;
			
			System.out.println(" the value of NY is = " + NY);
			System.out.println(" the value of NJ is = " + NJ);
		     }} 
			

             //Post-increment 
			/* giving 2 commands to JVM 
			 * 1) Assign the value of 'a1' to 'b1'  (int b1=a1)
			 * 2) Increase Value of Attached Variable by 1
			 * So, a1++ means 5+1=6 value of a1 is 6
			 * For b1 JVM already assigned the value 5,
			 *  because JVM has a nature if it gets a value inside a variable,
			 *  it stops reading other operators.
			 * So, b1 value is 5
			 */
			
		/*	int a1 = 5;
			int b1 = a1 ++;
			
			System.out.println("The value of variable a1 is = " + a1);
			System.out.println("The value of variable b1 is = " + b1);
	         }}  */
			
			
		
		    //Pre-increment
			
			/* Here JVM spots at first operator ++ ,
			 * gives 2 command as well'
			 * 1) int  b2= ++ ,  JVM   spots increment operator first,increasing value of attached variable a1,
			 *  but not assigned the value of a1 yet, because JVM did not find the variable a1 yet .
			 *  
			 * 2)  int b2 = ++ a1
			 * So JVM is getting attached variable a1 and  increasing  the value  by 1. so, value of a1 will be 5+1 =6 here 
			 * And b2 is getting the new value of a1   in b1 which is 6 .
			 */
			
		/*    int a2 = 5;
			int b2 = ++a2;
			System.out.println("The value of  variable a2 is = "+ a2);
			System.out.println("The value of  variable b2 is =" + b2);
			
	          }} */
			

            //Pre decrement
			/*the value of a3 is decremented by 1, and then the result is assigned to b3.
			 * so a3 value is 5 and then the result is assigned  assigned to b3.
			 * so, b3 value will 5 as well.
			 */ 


			
		 /*	int a3 = 6;
			int b3 = --a3; 
			
			System.out.println("The value of variable a3:" + a3 + ", b3: " + b3);
	          }}  */
			
		
		
		    //post decrement 
			
			/*the value of a4 is used in the expression first, 
			 * and then it is decremented by 1.
			 * so, b4 value will be 7 
			 * a4 value will be 7 decreased by  1 = 6
			 */


			
		/*	int a4 = 7;
			int b4 = a4--;
			System.out.println("the value of variable a4 =" + a4 +",  b4 =" + b4 );
		
		    }}  */
	

	


	


