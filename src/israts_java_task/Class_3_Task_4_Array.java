package israts_java_task;

public class Class_3_Task_4_Array {

	public static void main(String[] args) {
// Task-4--
    int Sun[]= new int [5];
        Sun[0]=5;
        Sun[1]=10;
        Sun[2]=15;
        Sun[3]=20;
        Sun[4]=25;
//Print all the value with "For Loop"--
        for (int i=0; i <=Sun.length-1; i++) {
        	System.out.println(" The value of all array : "+ Sun[i]);
        }
//Print the length of all value--
        System.out.println("Length of Array : "+Sun.length );
//Print the value from 1st to last index---
        for (int i=0;i<=Sun.length-1;i++) {
    		System.out.println("The value of array from 1st to last index :" +Sun[i]);    
        }
//Print the value from last index to 1st index with "For Loop"--
	for (int i= Sun.length-1;i >=0;i--) {
		System.out.println("The value of array from last to 1st index :" +Sun[i]);
	}
}
}