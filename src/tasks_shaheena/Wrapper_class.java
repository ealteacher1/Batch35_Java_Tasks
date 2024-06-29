package tasks_shaheena;

public class Wrapper_class {
	
	
	//1.Convert "1050" from String to Integer.
	//2.Convert "false" From String to Boolean.
	//3.Convert "10.22" From String to Double


	public static void main(String[] args) {
		
		// String
		String x = "1050";
		System.out.println(x+50);  
		
		//converting into  integer
		int i = Integer.parseInt(x);
		System.out.println(i+20); 
		
		
		//String
		String y = "false";// String
		
		//Converting into boolean
		boolean b =Boolean.parseBoolean(y);
		System.out.println(b); //boolean value
		
		
		//String 
		String z = "10.22";
		
		System.out.println(z+20); //String
		
		//Converting into double
		double  d = Double.parseDouble(z);
		System.out.println(d+20.00);
		
		

	}

}
