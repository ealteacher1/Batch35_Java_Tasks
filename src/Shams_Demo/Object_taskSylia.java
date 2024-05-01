package Shams_Demo;

public class Object_taskSylia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object[]  ObjectArray=new Object[10];
ObjectArray[0]=20;
ObjectArray[4]=true;
ObjectArray[7]="hello";
for(Object value:ObjectArray) {
	System.out.println(value);
}
for(int x=0; x<ObjectArray.length;x++) {
	System.out.println("the value of x is " +ObjectArray[x]);
}
	System.out.println(ObjectArray[2]);
	System.out.println(ObjectArray[3]);
	for(int m=ObjectArray.length-1;m>=0;m--) {
		System.out.println("m is " +ObjectArray[m]);
			}
	for(int b=5 ;b>=8;b++) {
		System.out.println(ObjectArray[b]);
		
	}
	for (int p=8; p<=4 ;p++) {
		System.out.println(ObjectArray[p]);
	}
}
	

}
