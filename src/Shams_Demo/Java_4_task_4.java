package Shams_Demo;

public class Java_4_task_4 {

	public static void main(String[] args) {
		String[] myStringArray=new String[5];
		myStringArray[0]="FIRST";
		myStringArray[1]="SECOND";
		myStringArray[2]="THIRD";
		myStringArray[3]="FOURTH";
		myStringArray[4]="FIFTH";
		for(String value: myStringArray) {
			System.out.println(value);
		}
		System.out.println("value at index 2:"+ myStringArray[2]);
		System.out.println("value at index 3:"+ myStringArray[3]);
		for(int i=0;i<myStringArray.length;i++) {
			System.out.println("value at index"+i+":"+myStringArray[i]);
	}
		for(int i=myStringArray.length-1;i>=0;i--) {
			System.out.println("value at index"+i+":"+myStringArray[i]);
	}
		for(int i=4;i>=1;i--) {
			System.out.println("value at index"+i+":"+myStringArray[i]);	
	}
	}



	}

}
