package Shams_Demo;

public class Object_ArrayTask7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object[][] multidim= new Object[2][2];
multidim[0][0]= 90;
multidim[0][1]= 16;
multidim[1][0]= 10;
multidim[1][1]= 50;
for (int row=0;row<multidim.length;row++) {
	for(int column=0;column<multidim[0].length;column++) {
		System.out.println(multidim[row][column]);
	}
	System.out.println(multidim[0][1]);
	System.out.println(multidim.length);
	System.out.println(multidim[0].length);
}
	}

}
