package Israts_Java_3;

public class Task01 {

	public static void main(String[] args) {
		Task01 ob1= new Task01 ();
		ob1.exam1(new Task01 ());// Call by direct class value 
		ob1.exam1(ob1); // call by variable 

		Task01 ob2= new Task01 ();
		ob2.exam2(new Task01 ());
		ob2.exam2(ob2);
		
		Task01 ob3= new Task01 ();
		ob3.exam2(new Task01 ());
		ob3.exam2(ob3);
		
		Task01 ob4= new Task01 ();
		ob4.exam2(new Task01 ());
		ob4.exam2(ob4);
		
		Task01 ob5= new Task01 ();
		ob5.exam2(new Task01 ());
		ob5.exam2(ob5);
	}
	public void exam1 (Task01 first) {
		System.out.println(first);
	}
    public void exam2 (Task01 second ) {
    	System.out.println(second);
    }
    public void exam3 (Task01 third ) {
    	System.out.println(third);
}
    public void exam4 (Task01 forth ) {
    	System.out.println(forth);
    	
    }
    public void exam5 (Task01 fifth ) {
    	System.out.println(fifth);
    	
    }
    public void ex5() {
		System.out.println("Fifth Example");
}
}