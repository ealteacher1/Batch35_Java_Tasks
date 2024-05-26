package Israts_Java_3;

public class Class_s10t2 {

	public static void main(String[] args) {
		 
		
		//CALLING 'MRTHOD' OVERLOADIGN.....
				Task02 method1= new Task02 ();
				method1.israt();
				method1.israt(10);
				method1.israt(10,10);
				method1.israt(10,10,10);
				method1.israt("Fifth overloading ");
				method1.israt("Sixth "," Overloading ");
				method1.israt("Seventh ","method" ," Overloading ");
				method1.israt(8," Overloading ");
				method1.israt(" Ningth Overloading " , 9);
				method1.israt(" Tenth Overloading " , 9 ," Succesfully ");

		   //CALLING 'CONSTRUCTOR' OVERLOADING.....
				Task02 constructor1 = new Task02 ();
				Task02 constructor2 = new Task02 (10);
				Task02 constructor3 = new Task02 (10,20);
				Task02 constructor4 = new Task02 (10,20,10);
				Task02 constructor5 = new Task02 ("5th constructor ");
				Task02 constructor6 = new Task02 ("6th ", "Constructor ");
				Task02 constructor7 = new Task02 ("7th "," constructor ", "");
				Task02 constructor8 = new Task02 (8 ," constructor ");
				Task02 constructor9 = new Task02 ("9th constructor ",0);
				Task02 constructor10 = new Task02 (10," constructor ","");

	}

}
