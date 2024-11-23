package Revision;

public class Task_09 {

	public static void main(String[] args) {
	
		//Exception handling with try&catch block
		
		int a=4;
		int b=6;
		System.out.println(a);
		
		
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			System.out.println("the code is wrong");
		}
		System.out.println(b);	
		
		
		                          // Part_02
	
		System.out.println(a);
		try {
			int result=10/0;
		
		}
         catch(Exception e) {
	System.out.println("the code is wrong");
         }
		System.out.println(b);
		
		
		                          //Part_03
		
		
		System.out.println(a);
		try {
			int[]x1=new int [5];
			System.out.println(x1[5]);
		}
		catch(Exception e) {
			System.out.println("array out of bound");
					
			
		}
		System.out.println(b);
		}
	}


