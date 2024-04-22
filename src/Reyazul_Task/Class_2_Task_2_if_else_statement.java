package Reyazul_Task;

public class Class_2_Task_2_if_else_statement {

	public static void main(String[] args) {
//Task use if-else-if statement to calculate grade.
		
		int computer = 90;
		int science1 = 60;
		int math1 = 50;
		
		int riyu = computer + science1 + math1;
		double reyaz = riyu/4;
		
		if (reyaz >= 90 && reyaz<= 100) {
			System.out.println("Student got grade A");
			
		}
		else if (reyaz>= 80 && reyaz <90) {
			System.out.println("Student got grade B");
		}
		else if (reyaz>= 70 && reyaz < 80) {
			System.out.println("Student got grade C");
		}
		else if (reyaz >= 60 && reyaz <70) {
			System.out.println("Student got grade D");
			
		}
		else {
			System.out.println("Student got Grade F");
		}

	}

}
