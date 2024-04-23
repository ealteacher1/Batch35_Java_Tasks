package israts_java_task;

public class Class_3_Task_5_Object_Array {

	public static void main(String[] args) {
//Task-5-Object_Array--
		Object rain[]= new Object[10];
         rain[0]="Israt";
		 rain[4]=15;
		 rain[7]=15.90;    
		 System.out.println("Length of Array: "+rain.length);
		 for(int i=0;i<rain.length;i++) {
		 System.out.println("Each Index value: "+rain[i]);
		 }
//Print the value from 1st to last index---
	      for (int i=0;i<=rain.length-1;i++) {
	      System.out.println("The value of array from 1st to last index :" +rain[i]);  
		 }	
//Print the value of 2nd and 3rd index individually --
	      System.out.println("The value of 2nd index: "+rain[1]);
	      System.out.println("The value of 3rd index: "+rain[2]); 
//Print the value from last index to 1st index with "For Loop"--
	 	 for (int i=rain.length-1;i >=0;i--) {
	 	 System.out.println("The value of array from last to 1st index :" +rain[i]);
	}
// Print all the value from 5th to 8th index--
		  for (int i=4;i<=7;i++) {
		  System.out.println("The value of Index: "+ rain[i]);
		}
// Print all the value from 8th to 4th index--
		  for (int i=7;i>=3;i--) {
		  System.out.println("The value of Index: "+ rain[i]);		
	}
	}
}
