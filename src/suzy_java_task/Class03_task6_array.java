package suzy_java_task;

public class Class03_task6_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//	 Task-6-Object_Array_2
	Object ocean[]= new Object[5];
	ocean[0]= 50;
	ocean[1]=60;
	ocean[2]=70;
	ocean[3]=80;
	ocean[4]=90;
	// Print the length of Array--
	System.out.println("Length of Array: "+ocean.length);
	//
	//Print the vlaue's of all Array--
	for(int i=0;i<ocean.length-1;i++) {
	System.out.println("Each Index value: "+ocean[i]);
	}
	//Print the value from last index to 1st index with "For Loop"--
	for (int i=ocean.length-1;i >=0;i--) {
	System.out.println("The value of array from last to 1st index :" +ocean[i]);
	
	}
	//Print the value of index 2nd and 3rd --
	System.out.println("The value of 2nd index: "+ocean[1]);
	System.out.println("The value of 3rd index: "+ocean[2]);
	//Print the value of 5th index to 2nd index--
	for (int i=4;i>=1;i--) {
	System.out.println("The value of Index:" + ocean[i]) ;
	}
	// Create 10 boxes of Array --
	
	int life[]=new int [10];
	//input 3 box variable--
	life[0]=10;

}
}