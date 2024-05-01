package Shams_Demo;

public class Array_task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Object sylia[]= new Object[5];
     sylia[0]=true;
     sylia[1]=50;
     sylia[2]= 'x';
     sylia[3]="octobre";
     sylia[4]=65;
     for(Object value:sylia) {
    	 System.out.println(value); 
     }
     for (int a=0; a<sylia.length;a++) {
    	 System.out.println("the value of a is " +sylia[a]);
     }
     for (int w=sylia.length-1;w>0;w--) {
    	 System.out.println("the value of w is " +sylia[w]);
     }
     {
     System.out.println(sylia [2]);
     System.out.println(sylia [3]);
	}
	for(int r=4;r>=1;r--) {
		System.out.println("value of r is " +sylia[r]);
	}
	}}

