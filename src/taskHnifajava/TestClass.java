package taskHnifajava;

public class TestClass {

	public static void main(String[] args) {
       Amazon ob = new Amazon();
		
		ob.login(); 
		ob.AddtomyPrime(); //Amazon  -child class 
	    ob.logout();     
		
        Walmart ob1=new  Walmart();
		
		ob1.selectdress();     // Walmart - child class 
		ob1.selectcolor(); 
		ob1.selectsize();
		
		Shane ob2= new Shane();
		
		ob2.selectjewlery();    // Shane  - child class 
		ob2.addjewelery();
		ob2.payment();
		
		
		  
		PCRichard ob3= new PCRichard();
		ob3.selectTVbysize();     // PC richard -child class 
		ob3.deliveryoption();
		ob3.payment();
		
	    
		
		Ebay ob4= new Ebay();
		ob4.searchBooks();       //Ebay  - child class 
		ob4.selectBooks();
		ob4.buybooks();
		
	
		ob4.Buy();   // these 2 methods inheriting from parent class Shopping 
		ob4.Add_to_Cart();
	    
	
}
}