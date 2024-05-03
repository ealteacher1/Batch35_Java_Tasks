package taskHnifajava;

public class Task6java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object tulip[]= {20,'l',true,"liza",2};
		  
	    //Question2 ; for each loop:
	
	   for (Object f:tulip) {
		   System.out.println(f);
	   }
	   //Question 3; find out the length of the and print all the value from 1st index to las index with for loop;
	   
	   for(int g=0; g<tulip.length; g++) {
		   System.out.println(tulip[g]);
	   }
     //Question 4 print all the value from last index (a.length-1)to first index
	   for (int c=tulip.length-1; c>=0;c--) {
		   System.out.println(tulip[c]);
	   }
	 // Question5 ;  Print the value of index #2 and index #3 individually:
	    System.out.println(tulip[1]);
	    System.out.println(tulip[2]);
	    { 
	 //Question6: print all the value 5th index to 2nd index :
	    	for (int h=4;h>=1;h--) {
	    		System.out.println(tulip[h]);
	    		
	    	}}}}
