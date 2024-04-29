package class3_4_tasks;

public class Array_task6 {

	public static void main(String[] args) {
	
		 
		   Object data[]= {"lyes", 100, "Adam", 'c', 400 };
		   
		 // Question 1:
		   for(Object DA:data) {
		   System.out.println(DA);
		   }
		   
		 // Question 2: 
		   System.out.println(data.length);
		   for(int y=0; y<=data.length-1; y++) {
			System.out.println(data[y]);   
		   }
		   
		// Question 3:
		   for(int y=data.length-1; y>=0; y--) {
			System.out.println(data[y]);  
		   }
		   
		// Question 4:
		   System.out.println(data[2]);
		   System.out.println(data[3]);

		// Question 5:
		   for(int y=4; y>=2; y--) {
		   System.out.println(data[y]);	   
		   }	

	}

}
