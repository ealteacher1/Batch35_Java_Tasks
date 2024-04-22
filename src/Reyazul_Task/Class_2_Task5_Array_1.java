package Reyazul_Task;

public class Class_2_Task5_Array_1 {

	public static void main(String[] args) {
		// Array Task 1
		
int [] riyu = new int [10];
		
		riyu[0]=10;
		riyu[4]=15;
		riyu[6]=20;
		
		// finding the length and print all the value
		System.out.println(riyu.length);
			
			// find the length and print the value from 1st index
		
			for (int r = 0; r < riyu.length; r++) {
	            System.out.println(riyu[r]);
			}
			
			// Print the value of index number 5and index 7individually.(Be careful with the index
			System.out.println("printing the value for index 5: "+riyu[4]);
			System.out.println("printing the value for inxed 7: "+riyu[6]);
			
			// from reverse order printing last index to first 
			
		System.out.println("FROM LASST INDEX TO FIRST INDEX REVERSE= ");
		 	for (int r = riyu.length-1; r>=0;r--) {
		 		System.out.println(riyu[r]);
		 	}
		 	// from 5th index to 8th index 
		System.out.println("FROM 5TH INDEX TO 8TH INDEX=");	
			for (int r = 4; r <=7; r++){
				System.out.println(riyu[r]);
			}
			// from 8th index to 4th index
		System.out.println("FROM 8TH INDEX TO 4TH INDEX=");
			for (int r = 7; r>=3; r--) {
				System.out.println(riyu[r]);
		

	}

}
}
