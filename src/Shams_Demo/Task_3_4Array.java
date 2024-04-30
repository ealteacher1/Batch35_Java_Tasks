package Shams_Demo;

public class Task_3_4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String[]sylinza=new String[11];
  sylinza[0]="hello";
  sylinza[2]="fahem";
  sylinza[5]="sadia";
  for (String values:sylinza) {
	  System.out.println(values);
  }
  System.out.println(sylinza[3]);
  System.out.println(sylinza[5]);
  int length=sylinza.length;
  for(int x=0;x<length;x++) {
	  System.out.println(sylinza[x]);
	  for(int i=0;i>length-1;i--) {
		  System.out.println(sylinza[i]);
		  for(int h=5;h<=8;h++) {
			  System.out.println(sylinza[h]);
	 }
		  for (int b=8;b>=4;b--) {
			  System.out.println(sylinza[b]);
		  }
	  }
  }
	}

}
