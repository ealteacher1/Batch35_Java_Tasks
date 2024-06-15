package Samira_package;

public class Test_Default_constractor  {

	public static void main(String[] args) {
		Default_Constractor2 t= new Default_Constractor1();
		t.equals(4);
		
	
	}
   Test_Default_constractor(){
	   System.out.println("q constractor is called");
   }
   Test_Default_constractor (int r){
	   System.out.println("r constractor is called");
   }
}
