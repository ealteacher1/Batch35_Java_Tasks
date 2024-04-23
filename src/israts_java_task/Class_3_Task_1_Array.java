package israts_java_task;

public class Class_3_Task_1_Array {

	public static void main(String[] args) {
// Task-01
		int star []= new int [10];
			       
		 star[0]=5;
		 star[6]=15;
		 star[8]=22;
		      
		 System.out.println(star.length);
		 System.out.println(star.length);
		 for(int i=0;i<star.length;i++) {
		 System.out.println("array value: "+star[i]);

			}
// Print the value of 5 and 7 
		 System.out.println(star[4]);
		 System.out.println(star[6]);
// Print the length of array and print all the value  from last index to first index 
         System.out.println(star.length );
		      
		 for (int i =star.length-1;i>=0;i--) {
		 System.out.println("Index: "+i+" Array Value: "+star[i]);
		      
		      }
//print the value from 5th to 8th 
		  for (int i=4;i<=7;i++) {
		  System.out.println("Index: "+i+" Array Value: "+star[i]);
		      
		      }
		      
//print value from 8th to 4th 
		  for (int i=7;i>=3;i--) {
		  System.out.println("Index: "+i+" Array Value: "+star[i]);
		      }
	}

}
