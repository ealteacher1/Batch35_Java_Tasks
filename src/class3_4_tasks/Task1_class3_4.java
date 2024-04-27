package class3_4_tasks;

public class Task1_class3_4 {

	public static void main(String[] args) {
		 //  Print 2 to -10 :
		//  While :
			int a=2;
			while(a>=-10) {
			System.out.println("the value of a= "+a);
			a--;
			}
			// Do While :
			do {
		    System.out.println("the value of a="+a);
			a--;
			}
			while(a>=-10);
			// for loop :
			for(int a1=2; a1>=-10; a1--) {
			System.out.println("a1= "+a1);	
			}
			
		// Print 3 to 20 :
		// while :
			int b=3;
			while(b<=20) {
			System.out.println("the value of b= "+b);
			b++;
			}
			// Do While :
			do {
		    System.out.println("the value of b="+b);
			b++;
			}
			while(b<=20);
			// for loop :
			for(int b1=3; b1<=20; b1++) {
			System.out.println("b1= "+b1);	
			}
			
		// Print -355 to -255 :
			int c=-355;
			while(c<=-255) {
			System.out.println("the value of c= "+c);
			c++;
			}
			// Do While :
			do {
		    System.out.println("the value of c="+c);
			c++;
			}
			while(c<=-255);
			// for loop :
			for(int c1=-355; c1>=-255; c1++) {
			System.out.println("c1= "+c1);	
			}
			
			// Print -956 to -960 :
			int d=-956;
			while(d>=-960) {
			System.out.println("the value of d= "+d);
			d--;
			}
			// Do While :
			do {
			System.out.println("the value of d="+d);
			d--;
			}
			while(d>=-960);
			// for loop :
			for(int d1=-956; d1>=-960; d1--) {
		    System.out.println("d1= "+d1);	
			}
			
			// Print -10 to 10 :
			int e=-10;
			while(e<=10) {
			System.out.println("the value of e= "+e);
			e++;
			}
			// Do While :
			do {
			System.out.println("the value of e="+e);
			e++;
			}
			while(e<=10);
			// for loop :
			for(int e1=-10; e1<=-10; e1++) {
			System.out.println("e1= "+e1);	
			} 
			// Print -5 to 5 and break if the value is 3 :
			int f=-5;
			while(f<=5) {
		    if(f==3) {
		    break;	
		    }
		    System.out.println("f= "+f);
		    f++;
			}
			// Print -500 to -200 and break if the value is -278 ;
			for(int g=-500; g<=-200; g++) {
			if(g==-278) {
			break;
			}
			System.out.println("g= "+g);
			g++;
			}		 

	}

}
