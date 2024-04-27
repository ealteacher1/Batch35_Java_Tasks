package suzy_java_task;

public class Class03_task7_multidimentional_array {
	public static void main(String[] args) {
		
//create multiple dim  object array with 2 rows and 2 columns --
		Object joy [][]=new Object[2][2];
		
		
//		put 4 integer value in all cells of a table --
	joy [0][0]=10;
	joy [1][1]=20;
	
		
//print all the value with for loop --
	for(int a=0;a<=joy.length-1;a++) {
		for(int b=0;b<=joy[0].length-1;b++) {
			System.out.println( "the value of is :"+joy[a][b]);
			
	}

		
		
		
//		find out the value of 1st row and 2nd column --
		System.out.println("the value of 1st and second :"+joy[0][1]);
		
		
		
//		Find out the length of the rows and columns and print all the values with for loop --
		System.out.println("the length of rows "+ joy.length);	
		System.out.println("the length of columns "+joy[0].length );
	}

	}
	
}

		




