package Shams_Demo;

public class Java_task6 {

	public static void main(String[] args) {
		Object[] myObjectArray=new Object[10];
		myObjectArray[0]=10;
		myObjectArray[1]=20;
		myObjectArray[2]=30;
		myObjectArray[3]=40;
		myObjectArray[4]=50;
		for(Object value: myObjectArray) {
			{
		int length =myObjectArray.length;
		for(int i=0;i<length;i++) {
			System.out.println("value at index"+i+":"+myObjectArray[i]);	
		}
		for (int b =length-1;b>=0;b--) {
			System.out.println("value at index"+b+":"+myObjectArray[b]);
			System.out.println("value at index 2:"+myObjectArray[2]);
			System.out.println("value at index 3:"+myObjectArray[3]);
			for(int i=5;i>=2;i--) {
				System.out.println("value at index"+i+":"+myObjectArray[i]);
			}
	}
		}
	}
}



	}

}
