package reyazul_Task2;

public class Class_3_task10_Array6 {

	public static void main(String[] args) {
		
		Object shark[] = new Object [5];
		shark [0] = 45;
		shark[1] = 50;
		shark[2] = 55;
		shark[3] = 60;
		shark [4] = 65;
		
		
		System.out.println(shark.length);
		
		for (int s=0; s<shark.length; s++) {
			System.out.println(" $" +shark[s]);
		}
		
		// from last to first 
		
		System.out.println(" from last to first index");
		for (int s=shark.length-1; s>=0; s--) {
			System.out.println(" $"+shark[s]);
		}
		
		// index number 2 and index number 3 individually
		
		System.out.println(" index number 2: "+shark[1]);
		System.out.println(" index number 3: "+shark[2]);
		
		
		// from 5th to 2nd index 
		
		System.out.println(" from 5th  to 2nd index ");
		for (int s=4; s>=1; s--) {
			System.out.println(" $"+shark[s]);
		}

		// Array: make 10 boxed array; input 3 box variables,
		// Print the value of index 5;
		// print the length of the array
		// print all box's vales 
		// print all values of the array with for loop
		
		int rey []= new int[10];
		rey [0] = 20;
		rey[6]= 10;
		rey[3]=2;
		
		// print the value of index 5
		
		if (rey.length>5) {
			System.out.println(" it will show index value 5: "+rey[5]);
		}
		else {
				System.out.println(" not correct");
			}
		
		// for the length
		
		System.out.println("This is the length: "+rey.length);
		
		
		// print all values of the array with for loop
		
		for (int r = 0; r<rey.length; r++) {
			System.out.println(" useing for loop: "+rey[r]);
			
		}

		
		}
		
		
		
	}
