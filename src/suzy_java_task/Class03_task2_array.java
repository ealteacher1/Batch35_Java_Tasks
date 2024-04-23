package suzy_java_task;

public class Class03_task2_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array task 2--
		
		int blue[]=new int [11];
		 blue[0]=5;
		 blue[2]=6;
		 blue[5]=8;
		 
//		 find out the length of array  --
		 System.out.println(blue.length);
		 
		 
//		 print all the value with for each  loop --
		 for(int a=0;a<=blue.length-1;a++ ) {
			 System.out.println("array value "+blue[a] );
			 }
//			 print the value of index number 3 and index number 6 individually--
			 System.out.println(blue[2]);
			 System.out.println(blue[4]);
			 
//			 find out the length of array and print all the value from 1st index to last index with for loop --
			 for (int b=0;b<=blue.length-1;b++) {
				 System.out.println("the value "+blue[b]);
			 }		 
//			print out the value from last index to first index (printing should be in reverse order)--
			  for (int b=blue.length-1;b>=0;b--) {
				  System.out.println("the value of blue :"+blue[b]);
			  }		  
				  
//	print all the value of 5th index to 8th index --
				  
		for(int b =4;b<=7;b++) {
			System.out.println("the value of blue : "+blue[b]);
		}
		
//		find out the length of the array and print all the value from 8th index to 4th index --
		for(int b=7;b>=3;b--) {
			System.out.println("the value of blue" +blue[b]);
		}
			  }
			 }
			 
		 
	
	


