package reyazul_Task2;

public class Class_3_Array8 {

	public static void main(String[] args) {
		
		String Riyu [][]= new String [3][2];
	
            Riyu [0][0]="what's up!";
            Riyu [1][1]="Guy's";

//Print the length of rows
            System.out.println(Riyu.length );

//print the length of column--
            System.out.println(Riyu[0].length);

//Print out the value of 1st row and 2nd column --
            System.out.println(Riyu[0][1]);

//Print all the value with For loop--
           for (int r=0;r < Riyu.length; r++) {
               for(int t=0;t < Riyu[0].length;t++) {
                   System.out.println(Riyu[r][t]);

	}

}
	}
}
