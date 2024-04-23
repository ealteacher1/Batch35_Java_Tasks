package israts_java_task;

public class Class_2_Task_2_If_else_if {

	public static void main(String[] args) {
		
//Task-2 If-Else-If-Else--
		    int computer = 90;
	        int science1 = 60;
	        int math1    = 50;

	        int s = computer + science1 + math1;
	        float d = s/4f;

	        if (d >= 90 && d<= 100) {
	            System.out.println("Student got grade A");

	        }
	        else if (d>= 80 && d <90) {
	            System.out.println("Student got grade B");
	        }
	        else if (d>= 70 && d < 80) {
	            System.out.println("Student got grade C");
	        }
	        else if (d >= 60 && d <70) {
	            System.out.println("Student got grade D");

	        }
	        else {
	            System.out.println("Student got Grade F");
		
	}
	}
}
