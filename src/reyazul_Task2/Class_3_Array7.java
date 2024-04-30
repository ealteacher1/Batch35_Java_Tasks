package reyazul_Task2;

public class Class_3_Array7 {

	public static void main(String[] args) {
		
		Object happy [][]= new Object [5][6];
        happy [0][0]=20;
        happy [2][2]=30;
        
        
//Print all the value with "For loop"--
        for (int r=0;r<=happy.length-1;r++) {

            for (int t=0;t<= happy[0].length-1;t++) { 
                System.out.println("The value of all Index : "+happy[r][t]);
            }
//Print the value of 1st row and 2nd column--
            System.out.println("The value of 1st row  and 2nd column: "+happy[0][1]);
//Print the length of row and column --
            System.out.println("The length of Row : " +happy.length );
            System.out.println("The length of column : " +happy[0].length );

	}

}
}
