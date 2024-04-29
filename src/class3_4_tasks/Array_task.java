package class3_4_tasks;

public class Array_task {

	public static void main(String[] args) {
		 
//	     Task 1:
		int BBC[]=new int [10];
		BBC[5]=800;
		BBC[7]=30;
		BBC[9]=100;
		
	// Question 3:
		System.out.println(BBC[5]);
	// Question 2:
		System.out.println(BBC.length);
	// Question 3:
		for(int x=0; x<=BBC.length-1; x++) {
			System.out.println(BBC[x]);
		}
		
//	     Task 2:
		int AAC[]=new int [3];
		AAC[0]=200;
		AAC[2]=400;
		AAC[1]=54;
		// Question 3:
			System.out.println(AAC[2]);
		// Question 2:
			System.out.println(AAC.length);
		// Question 3:
			for(int x=0; x<=AAC.length-1; x++) {
				System.out.println(AAC[x]);
			}	
		
//	     Task 3:
		int summer[]=new int [7];
		summer[4]=56;
		summer[6]=30;
		summer[5]=54;
		// Question 3:
			System.out.println(summer[5]);
		// Question 2:
			System.out.println(summer.length);
		// Question 3:
			for(int x=0; x<=summer.length-1; x++) {
				System.out.println(summer[x]);
			}	


	}

}
