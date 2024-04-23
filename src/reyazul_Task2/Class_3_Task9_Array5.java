package reyazul_Task2;

public class Class_3_Task9_Array5 {

	public static void main(String[] args) {
		// find out the length of the array and print all the value with for loop
	Object red [] = new  Object[10];
		red[0]= "odd";
		red[4]= 600;
		red[7]='t'; // this is char
		
	 System.out.println(red.length);
	 
	 for (int r=0; r < red.length; r++) {
		 System.out.println("nice dress: "+red[r]);
	 }
	 
	 //  from 2nd index to 3rd index individually 
	 
	 System.out.println(" index number 2: "+red[1]);
	 System.out.println(" index 3 :"+red[2]);
	 
	 
	 // from last index to first index 
	 
	 System.out.println(" from last to first index: ");
	 for (int r =red.length-1; r>=0; r--) {
		 System.out.println("buy it: "+red[r]);
		 
	 }
	 
	 // from 5th index to 8th index
	 
	 System.out.println(" from 5th to 8th index:");
	 for (int r=4; r<=7;r++) {
		 System.out.println(" got it! "+red[r]);
	 }
	 // from 8th to 4th 
	 
	 System.out.println(" from 8th to 4th index ");
	 for (int r = 7; r>=3; r--) {
		 System.out.println("great job: "+red[r]);
	 }
	 

	}

}
