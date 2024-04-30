package Shams_Demo;

public class Task_calss3_4sylia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sylia[]= new int[10];
		sylia[0]=8;
		sylia[7]=30;
		sylia[9]=12;
		
		  System.out.println(sylia.length);
		  for (int x=0; x<sylia.length ; x++) {
		  System.out.println(sylia[x]); 
		  } 
		  for (int Rony:sylia) {
		  System.out.println(Rony); }
		 
		System.out.println(sylia[5]);
		System.out.println(sylia[7]);
		for(int x=0;x<sylia.length-1;x++) {
			System.out.println(sylia[x]);
		}
		
	}
  }