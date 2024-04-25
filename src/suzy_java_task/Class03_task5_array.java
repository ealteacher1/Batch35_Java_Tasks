package suzy_java_task;

public class Class03_task5_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 5 --
		
		//Task-5-Object_Array--
		
        Object life[]= new Object[10];
         life[0]="Israt";
         life[4]=15;
         life[7]=15.90;
         System.out.println("Length of Array: "+life.length);
         for(int i=0;i<life.length;i++) {
         System.out.println("Each Index value: "+life[i]);
         }
//Print the value from 1st to last index---
          for (int i=0;i<=life.length-1;i++) {
          System.out.println("The value of array from 1st to last index :" +life[i]);
         }
//Print the value of 2nd and 3rd index individually --
          System.out.println("The value of 2nd index: "+life[1]);
          System.out.println("The value of 3rd index: "+life[2]); 
//Print the value from last index to 1st index with "For Loop"--
          for (int i=life.length-1;i >=0;i--) {
          System.out.println("The value of array from last to 1st index :" +life[i]);
          
    }
// Print all the value from 5th to 8th index--
          for (int i=4;i<=7;i++) {
          System.out.println("The value of Index: "+ life[i]);
          
        }
// Print all the value from 8th to 4th index--
          
          for (int i=7;i>=3;i--) {
          System.out.println("The value of Index: "+ life[i]);

	}


}
}