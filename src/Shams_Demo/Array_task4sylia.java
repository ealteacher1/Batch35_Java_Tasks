package Shams_Demo;

public class Array_task4sylia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int sylia[]=new int [5];
  sylia[0]=10;
  sylia[1]=20;
  sylia[2]=30;
  sylia[3]=40;
  sylia[4]=50;
  for(int value:sylia) {
	  System.out.println(value);
  }
  System.out.println (sylia.length);
  for(int a=0; a<sylia.length;a++) {
	  System.out.println("a is " +sylia[a]);
	  
	  }
  for (int n=sylia.length-1;n>=0;n--){
	  System.out.println("n is " +sylia[n]);
  }
  for(int i=4; i>=1;i--) {
	  System.out.println("the value of i is " +sylia[i]);
  }
	}

}
