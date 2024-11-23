package Shams_Demo;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		                         //Task05.Array.
		
		Object array[]=new Object[10];
		array[0]=10;
		array[1]=1;
		array[2]=22;
		array[3]=11;
		array[4]=90;
		array[5]=22;
		array[6]=33;
		array[7]=15;
		array[8]=55;
		array[9]=24;
		
		//01.find the length of the array and print out the values using for each loop.
		System.out.println(array.length);
		for(Object score:array) {
			System.out.println(score);
		}
		//02.find the length of array and print out all the values from 1st index to the last index using for loop.
		for(int d=0;d<=array.length-1;d++) {
		System.out.println(array[d]);
		}
		//03.print the value of index 2 and 3 individually.
		System.out.println(array[1]);
		System.out.println(array[2]);
		//04.print the values from last index to the first index by reverse.
		for(int k=array.length-1;k>=0;k--) {
			System.out.println(array[k]);
		}
		//05.print all the values from 5th index to 8th index.
		for(int k=4;k<=7;k++) {
			System.out.println(array[k]);
		}
		
		//06.print all the values of 8th index to 4th index.
		for(int k=7;k>=3;k--) {
			System.out.println(array[k]);
		}
		                                  
		                              // Task 06_Array.
		
		
		Object number[]= {1,2,3,4,'h'};
		
		//01.print all the values with for each loop.
		for(Object luq:number) {
			System.out.println(luq);
		}
		//02.find out the length and print all the values from the first index to the last index usingfor loop.
		for(int l=0;l<=number.length-1;l++) {
			System.out.println(number[l]);
		}
		
		//03.print all the values from last index to the first index by reverse.
		for( int l=number.length-1;l>=0;l--) {
			System.out.println(number[l]);
		}
		//04.print the values of index 2 and 3 individually.
		System.out.println(number[1]);
		System.out.println(number[2]);
		//05.print all the values from 5th index to 2nd index.
		for(int l=4;l>=1;l--) {
			System.out.println(number[l]);
		}
		
		
		                          // Task07_Array.
		
		int grade[][]=new int[2][2];
		
	
	      grade [0][0]=5;
	      grade [0][1]=6;
	      grade [1][0]=7;
		  grade [1][1]=8;
		  
		//01.print all the values with for loop.
		  for(int row=0;row<grade.length-1;row++) {
			  for(int column=0;column<grade.length-1;column++) {
				  System.out.println(grade[row][column]);
				
			  }
			                        
		  }
				  
		//02.find out the value which is first row , and 2nd column.	
		  System.out.println(grade[0][0]);
		  System.out.println(grade[1][1]);
		
		//03.find out the length of row and columns.
		  System.out.println(grade.length);
		  System.out.println(grade[0].length);
		
		
		                                     //TASK08.
		  
		  String array2[][]=new String[3][2];
		  
		  array2 [0][1]="beautiful ";
		  array2[1][2]="life";
		  
		  //01.print all the values with for loop.
		  
		    for(Object[]a:array2) {
		    	for(Object value:a) {
		    		System.out.println(value);
		    }
		    	
		//02.find out the value which is 1st row and 2nd column.
		    	
			System.out.println(array2[0][0]);
		    System.out.println(array2[1][1]);
  
		  //03.find out the length of row and columns.
		    System.out.println(array2.length);
		    System.out.println(array2[0].length);
		  
		    }
		  
	}

}
