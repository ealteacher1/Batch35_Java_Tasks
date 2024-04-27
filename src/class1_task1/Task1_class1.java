package class1_task1;

public class Task1_class1 {

	public static void main(String[] args) {
		
//		print and concatenate (int+int+int) :
			int a=10;
			int b=30;
			int c=50;
			System.out.println(a+b+c);
			
	//  print and concatenate (int+string+int) :
			String s1="hello world";
			System.out.println(a+s1+b);
			
//		print and concatenate (float+double+int) :
			float f=5.5f;
			double d=55.55;
			System.out.println(f+d+a);
			
//		print and concatenate (string+float+int) :
			System.out.println(s1+f+a);
			
//		print and concatenate (float+int+string) :
			System.out.println(f+b+s1);
			
//		print and concatenate (print float+int+float+double) :
			float f1=7.5f;
			System.out.println(f+c+f1+d);
			
//		print and concatenate (string+int+double+string) :
			String s2="Hi guys";
			System.out.println(s1+b+d+s2);
			
//		print and concatenate (sting+int+string+double) :
			System.out.println(s1+a+s2+d);
			
//		print and concatenate (int+int+string+(int+int+int)) :
			int a1=30;
			int b1=60;
			System.out.println(a+b+s1+(c+a1+b1));
			
		 

	}

}
