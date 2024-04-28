package tasks_shaheena;

public class Task_7_MultiDim_Array {

	public static void main(String[] args) {

		
		/* Create a multi_dim Object array with 2 rows and 2 columns and Put 4 int Value in all cells of the table.
		 *  Print all the value with for each loop.*/ 
		
		
		Object number [][]= {{50, 60}, {85, 90 }};  //2 dim array 
		 
		for (Object[] array: number) {              // 1 Dim array : extracted value from  2 Dim array 
			for (Object y :  array) {               // Single box array : extracted value from 1 Dim array 
			System.out.println (y);	                // prints the values  of all cells 
			
			}}}} 
			
		
		
		// or this one 
		
	    /*   Object login[][] = { {"testemail@gmail", 654321}, {"testemail@gmail", 989098} };  //2 Dim Array
		
		
		   //using for each loop    
		
		    for (Object[] arr2 : login) {     //  1 Dim Array: extracting value from 2 dim  array
			
			 for (Object x : arr2) {          // Single box array : extracting value from 1 Dim array  
		    	 
				 System.out.println(x);      // Prints values 
				
			 }}}}  */
		
		
          //Or this way.....
		
		
	    /*   int [][] TwoDimArray  = {{10,20}, {30, 40}}; 

		
		   for (int i =0; i<2; i++)         // using for loop for rows 
			      for (int j=0; j<2;  j++){     // using for loop for columns 
			
           
		  System.out.println("twodimarray [" + i + "][" + j + "] =" 	+ TwoDimArray[i][j]); 	//prints index number& values of array       
				
			
			
			}}}*/
		
	/*	int [][] multiDimArray ={{ 4 , 5}, {6 , 7 }};
		
		for (int i =0; i<2; i++) {
		for (int j=0; j<2; j++) {
		
				
        System.out.println(multiDimArray[i][j]  +" ");	
		
		}}}}*/
		
	
		// for each loop;
		
		
		/*int[][] mynum= {{1,2,3,4,},{ 5,6,7,8}};
		for (int [] row : mynum) {
			for (int i : row){
				
				System.out.println(i); */
			//}
			
			
		
			//}
		

		 // Find out the value which is in 1rst row, 2nd Column.
		   
		   
		 /*  Object arr[][] = {{ 60 , 7000 }, {205  , 950}};
		   
		  {
			System.out.println(arr[0][1]);   //Prints  1st row , 2nd column value 
			
		   }}}*/
		
		//Or This way 
		
		
	/*	int [][] intArray= new int [2][2];
		
		intArray[0][0]=120;
		intArray[0][1]=85;
		intArray[1][0]=90;  
		intArray[1][1]=300; 
		
		System.out.println(intArray[0][1]);   //prints  ist row , 2nd column 
		
	     }} */
		
		
		
		//using for loop 
		   
           
       /* int [][] intArray= new int [2][2];
		
		intArray[0][0]=95;
		intArray[0][1]=85;
		intArray[1][0]=90;  
		intArray[1][1]=30; 

		for (int  row =0; row<2; row++) {
			
			for (int column = 0; column<2; column++) {
			
			System.out.print("       " + intArray[row][column]);	
			
			}
			System.out.println();
	
			}}}  */
		
		
		
       /* Find out the length of the rows and columns for this array and Print all the value of this array with For  eachLoop.
           */

		   
		   
          /*  Object quarters [][]= {{45, 623, 90} ,{345, 190,40 }};  //2 dim array 

            for (Object[] Dimes: quarters) {       // 1 Dim array : extracted value from  2 Dim array 
	           for (Object Nickles:  Dimes) {     // Single box array : extracted value from 1 Dim array 
	            System.out.println(Nickles);     // prints the values  of all cells 
	           }
	        
            }
           
            System.out.println("Row length is: " +quarters.length); 
            
            System.out.println("Column length is: " +quarters[0].length);           
	           
	        }}*/

		
		
		/* Find out the length of the rows and columns for this array and Print all the value of this array with For Loop.
		 */
	 
			 
		
		/*   Object Array [][]= {{9, 3} ,{ 5, 6}};  //2 dim array 

			
            for (int  row =0; row<2; row++) {
			
			for (int column = 0; column<2; column++) {
			
			System.out.print("       " + Array[row][column]);	
			
			}
			System.out.println();
	
			}
          System.out.println("Row   length  is: "+ Array.length); 
          System.out.println("Column length is: "   + Array[0].length);
	
	       }}  */
		
		 
		  

	


