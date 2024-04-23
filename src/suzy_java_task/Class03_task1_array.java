package suzy_java_task;

public class Class03_task1_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		array task 1 --
//		create int array with 10 index --
		
		int star []= new int [10];

		
//		put the value on index number 1,2 and 3 --
	        star[0]=5;
	        star[6]=15;
	        star[8]=22;
	        
//	        find out the length of array --
           System.out.println(star.length);
	        
	        
	        
//	        print all the value with for each loop -- 
	    
	        for(int i=0;i<star.length;i++) {
	        
 System.out.println("array value: "+star[i]);
 
			
		
        
//print the value of 5th and 7th individually -- 
	        System.out.println(star[4]);
	        System.out.println(star[6]);
	        
	        
//print the length of array and print the value from last index to first index --
	        System.out.println(star.length);
	        
	        
	        
//	        print the value from last index to first index --
	    
	     for (int f =star.length-1;f>=0;f--) {
	            System.out.println("the value is: "+star[f]);

	        }
	   //print the value from 5th to 8th 
	        for (int d=4;d<=7;d++) {
	        System.out.println("the value is : "+star[d]);

	        }
//	        print out the value from 8th to 4th --
	        for(int j=7;j>=3;j--) {
	        	System.out.println("the value of array "+star[j]);
	        }
	        
	}

}



	}


