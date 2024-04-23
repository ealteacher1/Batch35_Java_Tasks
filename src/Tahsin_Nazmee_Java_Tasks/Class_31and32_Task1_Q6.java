package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Task1_Q6 {

	public static void main(String[] args) {
		// Print -5 to 5 and break if the value is 3
		// Using While loop
		int a = -5; 
		while (a<=5) {
			if (a==3) {
				System.out.println("Break");
				break;
			}
			System.out.println("a="+a);
			a++;
		}
		
		// Print -5 to 5 and break if the value is 3
		// Using Do-While loop
		int b = -5;
		do {
			if (b==3) {
				System.out.println("Break");
				break;
			}
			System.out.println("b="+b);
			b++;
		} while (b<=5);
		
		// Print -5 to 5 and break if the value is 3
		// Using For loop
		for (int c=-5; c<=5; c++) {
			if (c==3) {
				System.out.println("Break");
				break;
			} 
			System.out.println("c="+c);
		}
		
		/* End */		
	}
}
