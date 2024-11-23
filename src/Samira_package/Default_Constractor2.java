package Samira_package;

public class  Default_Constractor2 extends Test_Default_constractor {

	public static void main(String[] args) {
		Test_Default_constractor g= new Default_Constractor2();
		g.equals(2);

	}
	Default_Constractor2 (){
		System.out.println(" default constractor 2 is called");
	}
	Default_Constractor2(int x){
		System.out.println("constractor is called");
	}
}
