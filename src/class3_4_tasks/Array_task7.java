package class3_4_tasks;

public class Array_task7 {

	public static void main(String[] args) {
	  
		Object summer[][]=new Object[2][2];
		summer[0][0]="Adam";
		summer[1][0]=100;
		summer[0][1]='l';
		summer[1][1]=200;

	// Question 1:
		for(int x=0; x<summer.length; x++) {
		for(int y=0; y<summer[0].length; y++) {
		System.out.println(summer[x][y]);	
		}
		}
		
	// Question 2:
		System.out.println(summer[0][1]);
		
	// Question 3:
		System.out.println(summer.length);
		System.out.println(summer[0].length);
		for(int x=0; x<summer.length; x++) {
			for(int y=0; y<summer[0].length; y++) {
			System.out.println(summer[x][y]);	
			}
			}	

	}

}
