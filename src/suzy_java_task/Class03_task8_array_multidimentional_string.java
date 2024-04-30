package suzy_java_task;

public class Class03_task8_array_multidimentional_string {
	//task 8 --
	
//	create string array with 3 rows and 2 columns and put 2 integer values in any cells of the table  --
	String moon [][]=new String [3][2];
	moon[0][0]="life";
	moon[1][1]="joy";
	


	
//find out the value of first row and second column --
	System.out.println("the value of the first row and second column is :"+moon[0][1]);	
	
	
//find out the length of the rows and columns  --
	
	 System.out.println(moon[0].length);
	 System.out.println(moon.length);

		
	
	 
//		print all the value with for loop --
		for(int a=0;a<moon.length;a++) {
			for(int b=0;b<moon[0].length;b++) {
		
			System.out.println("the value is :" +moon[a][b]);
			
	 
//	 print 
	}

}
}
}




}
