package Shams_Demo;

public class Samira02 {

	public static void main(String[] args) {
		// Class_28_Task 01_Concatenate and print
		
		int a=2;
		int b=3;
		int c=4;
		float f=1.2f;
		double l=1.3d;
		String g="hello world";
		
		System.out.println(a+b+c);
		System.out.println(a+g+b);
		System.out.println(f+l+a);
		System.out.println(g+f+a);
		System.out.println(f+a+g);
		System.out.println("f"+a+f+l);
		System.out.println(g+a+l+g);
		System.out.println(g+a+g+l);
		System.out.println(a+b+g+(a+b+c));
         
		    //Class 29_30_Task_02_Calculate Average
		int math=60;
		int science=66;
		int physiscs=48;
		int biology= 74;
		int total=math+science+physiscs+biology;
		float average=total/4f;
		System.out.println(average);
		if (average>=90 && average<=100) {
		System.out.println("grade of student=A");
		}else if(average>=80 && average<=89) {
			System.out.println("grade of student=B");
		}else if (average>=70 && average<=79) {
			System.out.println("grade of student= C");
		}else if (average>=40 && average<=69) {
			System.out.println("grade of student=D");
		}else {
			System.out.println("program is successful");
		}
		
		
		   // Class 31&32_Task_01_Loops
		
		int k=2;
		while(k>-10) {
			System.out.println("k="+k);
			k--;
		}
		
		
		
		int q=3;
		while (q>=-10) {
			System.out.println("q="+q);
			q--;
		}
		
		int w=3;
		while(w<20) {
			System.out.println("w="+w);
			w++;
		}
		int e=-355;
		while(e<-255) {
			System.out.println("e="+e);
			e++;
		}
		int r=-956;
		while(r>-960) {
			System.out.println("r="+r);
			r--;
		}
		
		int t=-10;
		while(t<10) {
			System.out.println("t="+t);
			t++;
		}
		                   //Do loop
		
	      int y=2;
	      do {
	    	  System.out.println("y="+y);
	    	  y++;
	      }
	      while(y<-10);
		
		
	      int u=3;
	      do {
	    	  System.out.println("u="+u);
	    	  u++;
	      }
	      while(u<20);
	      
	                     // For loop
	      for(int i=2; i>-10; i--) {
	      System.out.println("i"+i);
	      }
	      for(int p=3; p<20; p++) {
	    	  System.out.println("p="+p);
	      }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
