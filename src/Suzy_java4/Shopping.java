package Suzy_java4;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping ob =new Shopping();
		ob.buy();
		
		Shopping ob1= new Shopping();
		ob1.add_to_cart();

	}
//create 2 ns methods --
	public void buy() {
		System.out.println("buy from my favorite stors");
	}
	
	
	public void add_to_cart() {
		System.out.println("add to cart ");
}
}