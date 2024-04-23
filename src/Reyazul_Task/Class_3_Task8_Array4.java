package Reyazul_Task;

public class Class_3_Task8_Array4 {

	public static void main(String[] args) {
		
		int [] taha = new int [5];
		taha[0]= 5;
		taha [1]= 10;
		taha [2]= 20;
		taha [3]= 50;
		taha [4]= 100;
		
		// print all the values with for each loop 
		
           System.out.println(taha.length);
		
		for (int t = 0; t < taha.length; t++) {
            System.out.println(" She have those bill note  $" +taha[t]);
            }
		
		// from the first index to last index 
		
		System.out.println(" from the first index to last ");
		
		for (int t=0; t< taha.length; t++) {
			System.out.println(" So cute you have those money $"+taha[t]);
			
		}
		
		// last to first index number 
		
		System.out.println(" from last index to frist index ");
		for (int t = taha.length-1; t>=0; t--) {
			System.out.println(" give me those $"+taha[t]);
		}
		
		// from 5th index to 2nd index 
		System.out.println("from 5th to 2nd index: ");
		for (int t = 4; t>=1; t--) {
			System.out.println(" aww how sweet you are $"+taha[t]);
		}

	}

}
