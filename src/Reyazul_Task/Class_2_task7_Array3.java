package Reyazul_Task;

public class Class_2_task7_Array3 {

	public static void main(String[] args) {
		
		
		
String[] reyaz = new String [5];
		
		reyaz [0] = "Israt";
		reyaz [1] = "Suzy";
		reyaz [2] = "Taha";
		reyaz [3] = "Riyu";
		reyaz [4] = "Tasin";
		
		// print all the value with for each loop
		
		System.out.println(reyaz.length);
		
		for (int t = 0; t < reyaz.length; t++) {
            System.out.println("hey" +reyaz[t]);
            }
		
// value for index 2 and 3 individually		
		System.out.println("finding value of index number="+reyaz[1]);
		System.out.println("finding value of index number3="+reyaz[2]);

		// print all the value from 1st index to last index

		System.out.println("from 1st to last index=");
		for (int t = 0 ; t<reyaz.length; t++ ) {
			System.out.println(reyaz[t]);
		}
		
		//from last index to first index in reverse 
		System.out.println(" from last index to first index: ");
		for (int t =reyaz.length-1; t >=0; t--) {
			System.out.println(reyaz[t]);
			
		}
		// from the 5th index to the 2nd index
		
		for (int t =4; t>=1; t--) {
			System.out.println(reyaz[t]);
		}
	}

}
