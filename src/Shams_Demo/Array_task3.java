package Shams_Demo;

public class Array_task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sylia[]= new String [5];
sylia[0]="bleu";
sylia[1]="red";
sylia[2]="green";
sylia[3]="orange";
sylia[4]="yellow";
for(String value:sylia) {
	System.out.println(value);
	
}
System.out.println("value of index 2 is " +sylia[2]);
System.out.println("value of index 3 is " +sylia[3]);
	
for (int i=0; i<sylia.length;i++) {
	System.out.println("the value of i is " +sylia[i]);
}
	for (int a=sylia.length-1;a>0;a--) {
		System.out.println("value of a is " +sylia[a]);
		
		}
	for (int b=4;b>=1;b--) {
		System.out.println("value of b is " +sylia[b]);
	}
	
}

} 
