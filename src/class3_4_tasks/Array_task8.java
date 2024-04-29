package class3_4_tasks;

public class Array_task8 {

	public static void main(String[] args) {
		 
		String names[][]=new String [3][2];
	    names[0][1]="Adam";
	    names[2][1]="john";
	    
	// Question 1:
	    for(int x=0; x<names.length; x++) {
	     for(int y=0; y<names[0].length; y++) {
	    	 System.out.println(names[x][y]);
	     }
	    }	
	    
	 // Question 2:
	   System.out.println(names[0][1]); 	
	   
	 // Question3:
	   System.out.println(names.length);
	   System.out.println(names[0].length);
	   for(int x=0; x<names.length; x++) {
		     for(int y=0; y<names[0].length; y++) {
		    	 System.out.println(names[x][y]);
		     }
		    }	

	}

}
