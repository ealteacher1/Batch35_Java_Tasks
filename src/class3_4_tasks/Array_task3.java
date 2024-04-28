package class3_4_tasks;

public class Array_task3 {

	public static void main(String[] args) {
	
		String names[]={"Jones","Smith","Brown","Jake","Adam" };
		 
		// Question 1:
			for(String name:names) {
			System.out.println(name);
			}
			
		// Question 2:
		   System.out.println(names[2]);
		   System.out.println(names[3]);	
		   
		// Question 3:
		   for(int x=0; x<=names.length-1; x++) {
		   System.out.println(names[x]);
		   }
		   
		// Question 4:
		   for(int x=names.length-1; x>=0; x--) {
		   System.out.println(names[x]);	   
		   }
		   
		// Question 5:
		   for(int x=4; x>=2; x--) {
		   System.out.println(names[x]);	   
		   }	

	}

}
