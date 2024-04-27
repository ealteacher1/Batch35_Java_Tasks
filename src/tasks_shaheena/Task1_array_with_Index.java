package tasks_shaheena;

public class Task1_array_with_Index {

	public static void main(String[] args) {
		
		//	1. create integer array with 10 index,   Put value in  index 1. index, 7, index 9 
		   
		   
		 
		/*int  number[]= new int[10];
			
			number[0]=10;
			number[6]=20;
			number[8]=15;
		//for each loop 	
			for(int d: number) {
			System.out.println(d);	
			}
			

		
		System.out.println(number.length);//prints length of array 
		}

	}	
	     */
	      
	       // Find out the length of the array.
	        // and Print all the value from 1st index to last index with For loop.
			
		/*	int arrayNum[]= new int[10];
			
			arrayNum[0]=5;
			arrayNum[1]=4;
			arrayNum[2]=2;
			arrayNum[3]=3;
			arrayNum[4]=6;
			arrayNum[5]=8;
			arrayNum[6]=7;
			arrayNum[7]=9;
			arrayNum[8]=3;
			arrayNum[9]=1;

			   
			  // prints all values with for loop
			
			for (int x=0; x<arrayNum.length; x++) {
				System.out.println("the value is = "+ arrayNum[x]);
			}
			
		}

	} */

			
			//  *Print the value of index number 5 and index7 individually.
			//    (Be careful with the index name. Index Name and Index number are not same.)



			/* 
			 * 
			 *     * Find out the length of the array and Print all the value 5th index to 8thindex.
			 * 
			 * int number[]= new int[10];
			
			
			number[5]=20;
	        number[7]=25;
	        
	        System.out.println("print the value of index 5= "+ number[4]);
	        System.out.println("print the value of index 8= " + number[7]);
	        
	        
	       
		}}*/
			
			/*   * Find out the length of the array and Print all the value from last Index(a.length-1) to first Index
		           (Printing should be in reverse order)*/
			 
			 
			   
			  int number[]=new int[10];
			 
		       int len = number.length;  //length of array
		       System.out.println(len);
		       
		     
			  
			 for (int x=number.length-1;  x>=0; x--) {
				 
				 System.out.println("print the reverse value  " + (x) );
			 }
				 
			 }
		


	}


