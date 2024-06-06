package suzy_java3;

public class Calling_task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
// changing global variable from (task4) --
		
		public static void changevalue () {
			Suzy_task4 changevalue =new Suzy_task4 (); 
			changevalue.age =22;
		System.out.println("change of age ");

		Suzy_task4 ob1 =new Suzy_task4 ();
	 		ob1.life ="unhappy man ";
	 		System.out.println("happy life");

	 		Suzy_task4 ob =new Suzy_task4 ();
	 		ob.x= false;
			System.out.println("false");
	 		
	 		Suzy_task4 ob2 =new Suzy_task4 ();
	 		ob2.a = 4.0;
	 		System.out.println("the value is ");
	 		
	 		Suzy_task4 ob3=new Suzy_task4 ();
	 		ob3.t=0.1f;
	 		System.out.println("the value is ");
		}
		}
		


/*		Questions --
1-where we create local variable ?
answer : we create local variable in main method  .

2-what is the difference between local ns variable and local ns variable ?
answer:the difference is ns local variable is create inside a method in stack memory  and global ns variable is created inside an object in heap memory  .

3-which variable copy will be given to an object ?
answer : non static variables .

4-can we create local variable as static ?
answer :No .we can not .*/


//  Questions --
//1-how to call ns variable in static method ?
// answer: by creating object 

//2-if you change the value of static variavle with object with object ,will the original static variable will be changed ?
//answer :yes .

