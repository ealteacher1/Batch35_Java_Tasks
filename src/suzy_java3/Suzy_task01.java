package suzy_java3;

public class Suzy_task01 {

	public static void main(String[] args) {
		
		Suzy_task01 ob =new Suzy_task01();      
		ob.family(ob);  //calling by variable 
	    ob.family(new Suzy_task01());    //calling by value 
	    
	    
	    Suzy_task01 ob1 = new Suzy_task01 ();
	    ob1.home (ob1);   //calling by variable 
	    ob.home(new Suzy_task01());   //calling by value 
	    
	    
	     Suzy_task01 ob2 = new Suzy_task01 ();
	     ob2.kids(ob2);   //calling by variable 
	     ob2.kids(new Suzy_task01()) ;   //calling by value
	     
	     
	     Suzy_task01 ob3 = new  Suzy_task01 ();
	     ob3.boy (ob3);   //calling by variable 
	     ob3 .boy ( new Suzy_task01 ());   //calling by value
	     
	     
	     Suzy_task01 ob4 = new Suzy_task01 ();
	     ob4.girl(ob4);   //calling by variable 
	     ob4.girl(new Suzy_task01());   //calling by value
	     
	
	
  
//	create 5 examples by of calling by object reference /class variable --
		
	}
	public void family ( Suzy_task01 one) {
		System.out.println(one);
	}
	public void home (Suzy_task01 two) {
		System.out.println(two);
	}
		
	public void kids (Suzy_task01 three) {
		System.out.println(three);
		
	}
		public void boy (Suzy_task01 four ) {
			System.out.println(four);
		}
		
		public void girl (Suzy_task01 five) {
			System.out.println(five);
		}
	}
