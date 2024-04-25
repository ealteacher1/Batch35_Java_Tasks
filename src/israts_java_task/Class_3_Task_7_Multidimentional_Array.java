package israts_java_task;

public class Class_3_Task_7_Multidimentional_Array {

	public static void main(String[] args) {
      Object smile [][]= new Object [5][6];
          smile[0][0]=20;
          smile[2][2]=30;
//Print all the value with "For loop"--
          for (int i=0;i<=smile.length-1;i++) {
        	  
        	  for (int y=0;y<= smile[0].length-1;y++) { 
        		  System.out.println("The value of all Index : "+smile[i][y]);
        	  }
//Print the value of 1st row and 2nd column--
        	  System.out.println("The value of 1st row  and 2nd column: "+smile[0][1]);
//Print the length of row and column --
        	  System.out.println("The length of Row : " +smile.length );
        	  System.out.println("The length of column : " +smile[0].length );

        	  
          }
	}

        	  
          
	}
