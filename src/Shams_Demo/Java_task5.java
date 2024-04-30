package Shams_Demo;

public class Java_task5 {

	public static void main(String[] args) {
		Object[] myObjectArray=new Object[10];
		myObjectArray[1]="first";
		myObjectArray[5]=5;
		myObjectArray[8]=true;
		int length =myObjectArray.length;
		for(Object value: myObjectArray) {
			{
System.out.println("value");
			}
for(int i=0;i<length;i++) {
	System.out.println("value at index 2:"+myObjectArray[2]);
	System.out.println("value at index 3:"+myObjectArray[3]);
	for (int b =length-1;b>=0;i--) {
		System.out.println("value at index"+b+":"+myObjectArray[b]);
}
	for (int c=5 ;c>=8;c++) {
		System.out.println("value at index"+c+":"+myObjectArray[c]);
	}
	for (int d=8 ;d<=4;d++) {
		System.out.println("value at index"+d+":"+myObjectArray[d]);
	}
		}
}
	}


	}

}
