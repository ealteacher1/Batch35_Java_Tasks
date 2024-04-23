package Tahsin_Nazmee_Java_Tasks;

public class Class_29and30_Task3_CalculateGrade {

	public static void main(String[] args) {
		/* 
		Student got computer = 90, science = 60, and math = 50. 
		Do grading after finding the avg.
		According to avg we need to do grading.
		- if avg is (90-100), Print: Student got Grade A
		- if avg is (80-89), Print: Student got Grade B
		- if avg is (70-79), Print: Student got Grade C
		- if avg is (60-69), Print: Student got Grade D
		Task: Use if-else-if statement to calculate grade.
		*/
		int Computer = 90;
		int Science = 60;
		int Math = 50;
		int total = Computer + Science + Math;
		float avg = total / 3f;
		System.out.println("Total: " + total);
		System.out.println("Average: " + avg);
		
		if (avg>=90 && avg<=100) {
			System.out.println("Student got grade A");
		} else if (avg>=80 && avg<=89) {
			System.out.println("Student got grade B");
		} else if (avg>=70 && avg<=79) {
			System.out.println("Student got grade C");
		} else if (avg>=60 && avg<=69) {
			System.out.println("Student got grade D");
		} else {
			System.out.println("Student got grade E");
		}
		
		/* End */
	}
}
