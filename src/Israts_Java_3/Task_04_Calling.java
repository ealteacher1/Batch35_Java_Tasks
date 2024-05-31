package Israts_Java_3;

public class Task_04_Calling {

	public static void main(String[] args) {

		
	    // CHANGING GLOBAL VARIABLE VALUE FROM CLASS (TASK_4)
		
		Task_4 callingfrom =new  Task_4 ();
		callingfrom.a=20;
		callingfrom.b="Best Response";
		callingfrom.c=13.50f;
		callingfrom.d="Best";
		callingfrom.e=false;
		callingfrom.f=new Task_4 ();
		callingfrom.g=new Task_4 ();
		
		
		
		System.out.println(callingfrom.a);
		System.out.println(callingfrom.b);
		System.out.println(callingfrom.c);
		System.out.println(callingfrom.d);
		System.out.println(callingfrom.e);
		System.out.println(callingfrom.f);
		System.out.println(callingfrom.g);

	}

}
