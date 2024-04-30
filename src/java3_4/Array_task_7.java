package java3_4;

public class Array_task_7 {

	public static void main(String[] args) {
		Object rima [][]= new Object[2][2];
		rima[0][0]=1;
		rima[0][1]=2;
		rima[1][0]=3;
		rima[1][1]=4;
		for(int row=0;row<rima.length;row++) {
			for(int column=0;column<rima[0].length;column++) {
				System.out.println(rima[row][column]);
				
				
			}
			
		}
		Object value=rima[0][1];
		System.out.println("the value of the 1rst row, 2nd column="+value);
		System.out.println(rima.length);
		System.out.println(rima[0].length);
		int row=rima.length;
		for (int rows=0;rows<rima.length;rows++) {
			for(int column=0;column<rima[0].length;column++) {
				System.out.println("the value of row,column="+rima[row][column]);
			}
		}
		

	}

}
