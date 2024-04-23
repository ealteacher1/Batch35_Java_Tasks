package Tahsin_Nazmee_Java_Tasks;

public class Class_28_Task1_Concatenate {

	public static void main(String[] args) {
		int a = 10;
		double b = 4.6666;
		float c = 5.5f;
		String d = "Tahsin";
		
		// int + int + int
		System.out.println(a+a+a);
		
		// int + String + int
		System.out.println(a+d+a);
		
		// float + double + int
		System.out.println(c+b+a);
		
		// String + float + int
		System.out.println(d+c+a);
		
		// float + int + String
		System.out.println(c+a+d);
		
		// float + int + float + double
		System.out.println(c+a+c+b);
		
		// String + int + double + String
		System.out.println(d+a+b+d);
		
		// String + int + String + double
		System.out.println(d+a+d+b);
		
		// int + int + String + (int + int + int)
		System.out.println(a+a+d+(a+a+a));
		
		/* End */
	}
}
