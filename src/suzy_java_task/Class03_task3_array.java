package suzy_java_task;

public class Class03_task3_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		task 3 --
//		create string array and put 5 string  value --
String happy[]=new String [5];
happy  [0]= "emily" ;
happy[1]="remy";
happy[2]="sky";
happy[3]="sun";
happy[4]="moon";

//print all the value with each for loop --
for(int b=0;b<=happy.length-1;b++) {
	System.out.println("the value of string: "+happy[b]);
	
}
	
	
//	print the value of number 2 and index 3   individually --
	System.out.println("the value of index "+happy[1]);
	System.out.println("the value of index "+happy[2]);
	
	
//	print all the value from first index to last index using for loop --
	for (int j=0;j<=happy.length-1;j++) {
		System.out.println("the value of string  "+happy[j]);
		
	}
		
//print the value from last index to first index in reverse order --
		for(int j=4;j>=0;j--) {
			System.out.println("the value of string " +happy[j]);
		}
			
//print all the value 5th index to 2nd index --
			for(int j=4;j>=1;j--) {
				System.out.println("the value of string " +happy[j]);
			
			}
		
		
		
		
		
		
		
	}


}

	


