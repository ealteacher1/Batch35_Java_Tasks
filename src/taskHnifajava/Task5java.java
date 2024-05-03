package taskHnifajava;

public class Task5java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 //Question 1; Create array with 10 index and put any value on index 1 and 5 and 8;
	
	Object wor []= {'k',100,2,"lina",50,40,'t',"flora",300,9};  
	for (Object t:wor) {
		System.out.println(t);
		
		
		wor[0]='k';
		wor[4]="lina";
		wor[7]='t';
	
	  }
	//Question 3: find out the length of the array and print all the value from 1st index to last index with foor loop;
	  for (int u=0; u<wor.length; u++) {
		  System.out.println(wor[u]);
	  }
	  {
	   //Question 4 ;print the value of index number 2 and 3 individually 
	 
	   wor[1]=100;
	   wor[2]=2;
	   System.out.println(wor[1]);
	   System.out.println(wor[2]);
	  }
	   {
	  //Question 5 :Print all the value from last index to first index (reverse order ):
	  for(int b=wor.length-1; b>=0; b--) {
		  System.out.println(wor[b]);
	  }
	  {
	  //Question 6 : print all the value 5th index to 8th index 
	  for (int h=4; h<=7;h++){
		  System.out.println(wor[h]);
	  }
	  //Question 7: print all the value from 8th index to  4th index:
	  for (int i=7; i>=3; i--) {
		  System.out.println(wor[i]);
		  
		  
	  }
	  
	}
	}}}

	


