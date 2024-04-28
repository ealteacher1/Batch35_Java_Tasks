package class3_4_tasks;

public class Array_task5 {

	public static void main(String[] args) {
		Object ac[]=new Object[11];
		ac[1]="Adam";
		ac[5]=500;
	    ac[8]='c';
	    
	// Question 1:
	   System.out.println(ac.length); 
	   for(Object ak:ac) {
		System.out.println(ak);   
	   }
	// Question 2:
	   System.out.println(ac.length); 
	   for (int y=0; y<=ac.length-1; y++) {
	   System.out.println(ac[y]);	   
	   }
	// Question 3:
	   System.out.println(ac[2]);
	   System.out.println(ac[3]);
	   
	// Question 4:
	   for(int y=ac.length-1; y>=0; y--) {
	   System.out.println(ac[y]);	   
	   }
	   
	// Question 5:
	   for(int y=5; y<=8; y++) {
	   System.out.println(ac[y]);	   
	   }
	   
	// Question 6:
	   for(int y=8; y<=4; y--) {
	   System.out.println(ac[y]);	   
	   }
	    

	}

}
