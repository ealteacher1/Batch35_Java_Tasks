package Tahsin_Nazmee_Java_Tasks;

public class Class_31and32_Task1_Q7 {

	public static void main(String[] args) {
		// Print -500 to -200 and break if the value is -278
		// While loop
		int a = -500; 
		while (a<=-200) {
			if (a==-278) {
				System.out.println("Break");
				break;
			}
			System.out.println("a="+a);
			a++;
		}
		
		// Print -500 to -200 and break if the value is -278
		// Do-While loop
		int b = -500;
		do {
			if (b==-278) {
				System.out.println("Break");
				break;
			}
			System.out.println("b="+b);
			b++;
		} while (b<=-200);
		
		// Print -500 to -200 and break if the value is -278
		// For loop
		for (int c=-500; c<=-200; c++) {
			if (c==-278) {
				System.out.println("Break");
				break;
			}
			System.out.println("c="+c);
		}
	
		/* End */
	}
}
