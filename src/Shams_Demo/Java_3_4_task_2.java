package Shams_Demo;

public class Java_3_4_task_2 {

	public static void main(String[] args) {
		int[]myArray =new int [10];
		myArray[0]=10;
		myArray[7]=20;
		myArray[9]=30;
		for(int value:myArray) {
			System.out.println(value);
		}
		for (int i=0;i<myArray.length;i++) {
			System.out.println("value at index"+i+":" + myArray[i]);
		}
		System.out.println("value at index 5:"+myArray[5]);
		System.out.println("value at index 7:"+myArray[7]);
		for(int i=myArray.length-1;i>=0;i--){
			System.out.println("value at index"+i+":"+myArray[i]);
			for(int b =5;i<=8;i++) {
				System.out.println("value at index"+b+":"+myArray[b]);
			}
			for(int c=8;c>=4;c--) {
				System.out.println("value at index"+c+":"+myArray[c]);
			}
			}
		}
		
		
		

	}

}
