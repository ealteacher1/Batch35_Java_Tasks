package Shams_Demo;

public class Class_D {

	public static void main(String[] args) {
		
		Class_D obj5 =new Class_D();
		obj5.mainclass();
		obj5.mainclass1();
		obj5.mainclass2();
        obj5.mainclass3();
        obj5.mainclass4();
        
        Class_c obj6=new Class_c();
        obj6.callingfromC();
        
        Class_A obj7=new Class_A();
        obj7.constractorformethod();
        obj7.newclass();
        obj7.newmethod();
        obj7.main(args);
	}
	      //Task_06  create class_D and create 5 constractors
	public void mainclass1() {
		System.out.println("class1");
	}
    public void mainclass2() {
    	System.out.println("class2");
    }
    public void mainclass3() {
    	System.out.println("class3");
    }
    public void mainclass4() {
    	System.out.println("class4");
    }
    public void mainclass() {
    System.out.println("class5");
}
} 

    
