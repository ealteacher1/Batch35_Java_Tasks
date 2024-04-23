package israts_java_task;

public class Class_3_task_6_Object_Array {

	public static void main(String[] args) {
		
// Task-6-Object_Array_2
		 Object sky[]= new Object[5];
		     sky[0]= 50;
		     sky[1]=60;
		     sky[2]=70;
		     sky[3]=80;
		     sky[4]=90;
// Print the length of Array--
			System.out.println("Length of Array: "+sky.length);
//			    		     
//Print the vlaue's of all Array--
		   for(int i=0;i<sky.length-1;i++) {
			System.out.println("Each Index value: "+sky[i]);  
		     }
//Print the value from last index to 1st index with "For Loop"--
		 	for (int i=sky.length-1;i >=0;i--) {
		 	System.out.println("The value of array from last to 1st index :" +sky[i]);
		 	}
//Print the value of index 2nd and 3rd --
		 	System.out.println("The value of 2nd index: "+sky[1]);
		     System.out.println("The value of 3rd index: "+sky[2]);
//Print the value of 5th index to 2nd index--
		    for (int i=4;i>=1;i--) {
		     System.out.println("The value of Index:" + sky[i]) ;
		    }
// Create 10 boxes of Array --
		  int ros[]=new int [10];
//input 3 box variable--
		  ros[0]=10;
		  ros[4]=15;
		  ros[8]=20;
//Print the value of index 5
	   System.out.println("The value of index 5: "+ros[4]);
//Print the length of array--
	   System.out.println("The length of array: "+ ros.length );
//Print all boxes of value with "For loop"--
	   for(int i=0;i<=ros.length-1;i++) {
			 System.out.println("Each Index value: "+ros[i]);
	}
//Create 3 boxed array--
	  int lily []=new int [3];
	    lily[0]=3;
	    lily[2]=6;
	System.out.println("The length of array: "+lily.length);
//Print all boxes of value with "For loop"--
	   for(int i=0;i<=lily.length-1;i++) {
			 System.out.println("Each Index value: "+lily[i]);	
	   }
//Create 7 box of array with long name --
	   int crystal []= new int [7];
	       crystal[3]=4;
	       crystal[5]=8;
	       crystal[6]=10;
	 System.out.println("The length of array: "+crystal.length);
//Print all boxes of value with "For loop"--
	     	   for(int i=0;i<=crystal.length-1;i++) {
	     			 System.out.println("Each Index value: "+crystal[i]);       
	}
}
}