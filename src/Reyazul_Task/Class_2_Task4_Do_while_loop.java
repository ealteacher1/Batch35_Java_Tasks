package Reyazul_Task;

public class Class_2_Task4_Do_while_loop {

	public static void main(String[] args) {
		// print 2 to -10
		
	      int a = 2; // initialization
			
			do {
				System.out.println(" vale of a is ="+a);
				a--;
			}
				
			while (a>=-10); // condition
		

		
		
		// print 3 to 20;
		int b = 3;
		do {
			System.out.println("value of b is="+b);
			b++;
			}
		while(b<=20); 
			
		
		// print -355 to -255
		int c = -355;
			do {
				System.out.println("value of c is="+c);
				c++;
				}
			while(c<=-200);
			
			// print -5 to 5 and break if the value is 3 
			int d = -5;
			do {
				System.out.println("value of d is="+d);
				
			
			if (d==3) {
				System.out.println("found it");
				break;
			}
			d++; }
			
			while(d<=5);
			
			// print -500 to -200 and break if the alue of the variable is -278
			int e =-500;
			do {
				System.out.println("value of the number is"+e);
				if (e==-278) {
					System.out.println("it's okay");
					break;
				}
				e++; 
			 
			}
			while (e<=-200);
	}

}
