package Shams_Demo;

public class Class_A {

	public static void main(String[] args) {
		Class_A obj1=new Class_A();
		obj1.newmethod();
		obj1.newclass();
		obj1.constractorformethod();
		
		 Lasttask obj2=new Lasttask();
		 obj2.method1();
		 obj2.method2();
		 obj2.method3();
	}
	                                       //Task_05
	
	public void newmethod() {
		System.out.println("constractor is called");
	}
    public void newclass() {
    	System.out.println("constractor 2");
    }
    public void constractorformethod() {
    	System.out.println("constractor3");
    }
                                            //Task_06
    
}
