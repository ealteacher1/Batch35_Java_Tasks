package Reyazul_Task;

public class Class_2_Task_6_Array2 {

	public static void main(String[] args) {
		
int[] riyu = new int [11];
		
		riyu [0] = 45;
		riyu [2] = 35;
		riyu [5] = 55;
		
		
		// Find out the length and the array and print all the value from each loop
		System.out.println(riyu.length);
		
		for (int r = 0; r < riyu.length; r++) {
            System.out.println(riyu[r]);
            }
		// print the value of index number 3 and index 5 individually
		System.out.println("Print the value for index 3="+riyu[2]);
		System.out.println("Print the value for index 5="+riyu[4]);

		// find out the length of the array from 1st to last
		
		for (int r = 0; r <=10; r++){
			System.out.println(riyu[r]);
		}
		// print all the value from reverse 
		System.out.println(" from reverse ");
		for (int r=0; r>=riyu.length-1; r--) {
	 		System.out.println(riyu[r]);
		}
		//print from 5th index to 8th index
		System.out.println(" from 5th to 8th index");
		for (int r=4; r<=7; r++) {
			System.out.println(riyu[r]);
			
		}
		// print from 8th to 4th index 
		
		System.out.println("from 8th to 4th index");
		for (int r=7; r>=3;r--) {
			System.out.println(riyu[r]);
			
		}

	}

}
