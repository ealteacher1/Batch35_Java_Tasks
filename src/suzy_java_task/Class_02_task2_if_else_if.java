package suzy_java_task;

public class Class_02_task2_if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	class02_task02_if_else_if	
		int computer = 90;
        int science1 = 60;
        int math1    = 50;

        int s= computer + science1 + math1;
        float v = s/4f;

        if (v >= 90 && v<= 100) {
            System.out.println("hello");

        }
        else if (v>= 80 && v <90) {
            System.out.println("hi there ");
        }
        else if (v>= 70 && v < 80) {
            System.out.println("no way ");
        }
        else if (v >= 60 && v <70) {
            System.out.println("yes");

        }
        else {
            System.out.println("sky ");
        }
	}
}