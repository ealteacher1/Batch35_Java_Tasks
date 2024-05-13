package suzy_java3;

public class Suzy_task1 {

	public static void main(String[] args) {
		
		Suzy_task1 ob =new Suzy_task1();      
		ob.family(ob);  //calling by variable 
	    ob.family(new Suzy_task1());    //calling by value 
	    
	    Suzy_task1 ob1 = new Suzy_task1 ();
	    ob1.home (ob1);   //calling by variable 
	    ob.home(new Suzy_task1());   //calling by value 
	    
	     Suzy_task1 ob2 = new Suzy_task1 ();
	     ob2.kids(ob2);
	     ob2.kids(new Suzy_task1()) ;
	     
	     Suzy_task1 ob3 = new  Suzy_task1 ();
	     ob3.boy (ob3);
	     ob3 .boy ( new Suzy_task1 ());
	     
	     Suzy_task1 ob4 = new Suzy_task1 ();
	     ob4.girl(ob4);
	     ob4.girl(new Suzy_task1());
	     
	     
	     
	     
	     
	     
	
	
    
		
//		create 5 examples by of calling by object reference /class variable --
		
	}
	public void family ( Suzy_task1 one) {
		System.out.println(one);
	}
	public void home (Suzy_task1 two) {
		System.out.println(two);
	}
		
	public void kids (Suzy_task1 three) {
		System.out.println(three);
		
	}
		public void boy (Suzy_task1 four ) {
			System.out.println(four);
		}
		
		public void girl (Suzy_task1 five) {
			System.out.println(five);
		}
	}
