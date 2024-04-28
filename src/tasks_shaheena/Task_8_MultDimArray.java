package tasks_shaheena;

public class Task_8_MultDimArray {

	public static void main(String[] args) {
		
		
		/*Create a multi dim String array with 3 rows and 2columns and 
		 * Put 2 int Value in any of the cells of the  table.
		 * Print all the value with for loop.*/
		
		
		
		
        Object StringArray[][] = { {"History", 90 },{ "Science", 85 },{"Physics", 95}};
		

		
        for (int  row =0; row<3; row++) {
		
		for (int column =0;column<2;column++) {
		
		System.out.print(" :"+StringArray[row][column]);	
	
		}
		System.out.println();

		}
	      System.out.println("Length of  the  Row  : " + StringArray.length);  
		   System.out.println("Length of the Column : " + StringArray[0].length);
			 
       
			}}
			
	
		
		
		
       // for each loop 
	/*	Object StringArray[][] = { {"Literature", 90 }, { "Science" , 85 }, {"Physics",  95}};
		
		
		for(Object[]  arr : StringArray) {
			for( Object x  : arr ) {
				
				System.out.println(x);
			}
			System.out.println();
		}
		
		System.out.println("Length of  the  Row  : " + StringArray.length);  
		System.out.println("Length of the Column : " + StringArray[0].length);
		
	}}*/
		 
		
		 
		//  Find out the value which is in 1rst row, 2nd Column.
		 
		/*  Object StringArray[][] = { {"Literature", 90 }, { "Science" , 85 }, {"Physics",  95}};
		
		
		 System.out.println(StringArray[0][1]);   // Prints 1st row 2nd column :  90
		 
		 
		 }}   */
		 
		 
		 
		 
		 
		 
		 // Find out the length of the rows and columns for this array and Print all the value of this array with ForLoop.
		 
		 
		   /*   Object StringArray[][] = {{"abc@yahoo.com",1234 }, { "tnt@aol.com",5678 }, {"Jmart@gmail.com",7658}};
		
		       for (int  row =0; row<3; row++) {
				
				for (int column =0;column<2;column++) {
				
				System.out.print(" :"+StringArray[row][column]);	
			
				}
				System.out.println();

				}
			    System.out.println("Length of  the  Row  : " + StringArray.length);  
				System.out.println("Length of the Column : " + StringArray[0].length);
					 
		

	             }} */



	


