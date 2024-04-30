package Shams_Demo;

public class Java_3_4_task_3 {

	public static void main(String[] args) {
		String[] myStringArray=new String[11];
		myStringArray[0]="FIRST";
		myStringArray[2]="SECOND";
		myStringArray[5]="THIRD";
		for(String value: myStringArray) {
			System.out.println(value);
		}
		System.out.println("value at index 3:"+ myStringArray[3]);
		System.out.println("value at index 5:"+ myStringArray[5]);
		int length=myStringArray.length;
		for(int i=0;i<length;i++) {
		System.out.println("value at index"+i+":"+myStringArray[i]);
		for (int b =length-1;b>=0;i--) {
			System.out.println("value at index"+b+":"+myStringArray[b]);
			for (int c =5;c<=8;c++) {
				System.out.println("value at index"+c+":"+myStringArray[c]);
			}
			for (int d =8;d>=4;d--) {
				System.out.println("value at index"+d+":"+myStringArray[d]);
				
		}
		}
	}
	
	}
	
		
	




	}

}
