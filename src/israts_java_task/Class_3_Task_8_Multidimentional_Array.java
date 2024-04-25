package israts_java_task;

public class Class_3_Task_8_Multidimentional_Array {

	public static void main(String[] args) {
        
//Task-8 - Multidimentional-Array-With "String"
		String Israt [][]= new String [3][2];
		    Israt [0][0]="Hello";
		    Israt [1][1]="Lady";
		    
//Print the length of rows
		    System.out.println(Israt.length );
	
//print the length of column--
		    System.out.println(Israt[0].length);
	        	  
//Print out the value of 1st row and 2nd column --
		    System.out.println(Israt[0][1]);
	
//Print all the value with For loop--
		   for (int a=0;a<Israt.length;a++) {
			   for(int b=0;b<Israt[0].length;b++) {
				   System.out.println(Israt[a][b]);
			   }

	}

	}
}
		
	


