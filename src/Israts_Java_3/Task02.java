package Israts_Java_3;

public class Task02 {

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
		// TODO Auto-generated method stub
		
	
// "METHOD OVERLOADING"- 10 TIMES.....
	public void israt () {
		System.out.println("Calling 1st method ");
	}
	public void israt (int a) {
        System.out.println("Calling 2nd method : "+ a);
	}
	public void israt (int a,int b) {
		int c=a+b;
        System.out.println("Calling 3rd method : "+ c);
	}
	public void israt (int a,int b,int c) {
		int c1=a+b+c;
        System.out.println("Calling 4rth method : "+ c1);
    }
	public void israt (String s) {
        System.out.println("Calling 5th method: "+s);
    }
	public void israt (String s,String s1) {
		String s2=s+s1;
        System.out.println("Calling 6th method : " + s2);
	}
	public void israt (String s,String s1,String s2) {
		String s3=s+s1+ s2;
        System.out.println("Calling 7th method : " + s3); 
    }
	public void israt (int a,String s) {
		Object o=a+s;
        System.out.println("Calling 8th method : " + o); 
    }
	public void israt (String s,int a) {
		Object b=s+a;
        System.out.println("Calling 9th method :" + b);
	}
	public void israt (String s,int a,String s2) {
		Object c=s+a+s2;
        System.out.println("Calling 10th method :"+ c);
    }
	
	// "CONSTRUCTOR OVERLOADING"- 10 TIMES......
	
	public Task02 () {
		System.out.println("Printing out 1st constructor");
	}
	public Task02 (int a) {
		System.out.println("Printing out 2nd constructor : " + a);
	}
	public Task02 (int a,int b) {
		int c=a+b;
		System.out.println("Printing out 3rd constructor : " + c);
	}
	public Task02  (int a,int b,int c) {
		int c1=a+b+c;
        System.out.println("Printing out 4rth constructor : "+ c1);
	}
	public Task02  (String d) {
        System.out.println("Printing out 5th constructor : "+ d);
	}
	public Task02  (String d,String e){
		String f=d+e;
        System.out.println("Printing out 6th constructor : "+ f);
	}
	public Task02  (String d,String e,String f){
		String g=d+e+f;
        System.out.println("Printing out 7th constructor : "+ g);
	}
	public Task02  (int h,String e){
		Object J=h+e;
        System.out.println("Printing out 8th constructor : "+ J);
	}
	public Task02  (String e,int k){
		Object J1=e+k;
        System.out.println("Printing out 9th constructor : "+ J1);
	}
	public Task02  (int h,String e,String f){
		Object J2=h+e+f;
        System.out.println("Printing out 10th constructor : " + J2);
	}
	
}