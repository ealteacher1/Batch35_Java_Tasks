package Samira_package;

public class Global_localV {
                   //Task04
	int q=10;
	String w="samira";
	boolean e=true;
	float t=10.2f;
	double y=123.12d;
	//Part02
	int school;
	int salary;
	
	
	public static void main(String[] args) {
		Global_localV ob= new Global_localV();
		
		ob.q=20;
		System.out.println("its ob object"+ob.q);
		
		
		
        ob.w="sorya";
        System.out.println( ob.w);
        
        ob.e=false;
        System.out.println(ob.e);
        
        ob.t=12.4f;
        System.out.println(ob.t);
        
        ob.y=222.222d;
        System.out.println(ob.y);
          //calling the NS variable inside static method for Part02
        Global_localV ob1= new Global_localV();
        ob1.school=1999;
        System.out.println(ob1.school);
        ob1.salary=4799;
        System.out.println(ob1.salary);
	}
	

}
