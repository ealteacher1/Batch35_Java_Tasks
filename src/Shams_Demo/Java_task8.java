package Shams_Demo;

public class Java_task8 {

	public static void main(String[] args) {
		Object[][] multiDimArray=new Object[3][2];
		multiDimArray[1][0]="10";
		multiDimArray[2][1]="20";
		for (int row =0;row<multiDimArray.length;row++) {
			for (int col =0;col<multiDimArray[row].length;col++) {
				System.out.println("value at row"+row+",column"+col+":"+multiDimArray[row][col]);
			}
	}
		Object value = multiDimArray[1][0];
		System.out.println("value in the 1st row, 2nd column:"+value);
		int rows= multiDimArray.length;
		int cols=multiDimArray[0].length;
		for (int row=0;row<rows;row++) {
			for(int col=0;col<cols;cols++) {
				System.out.println("value at row"+row+",column"+col+":"+multiDimArray[row][col]);		
			}
		}
	}



	}

}
