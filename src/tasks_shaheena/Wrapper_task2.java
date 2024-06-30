package tasks_shaheena;

public class Wrapper_task2 {
	
	
	//1.Convert 100 from Integer to Sting
	//2.Convert true from boolean to String 
	//3.Convert '@' from character to String 
	//4.Convert 20.00 from double to String.


	public static void main(String[] args) {
		
		//integer  converted into String 

		int x =100;
		String s = String.valueOf(x);
		System.out.println(s+50); // output 10040 
		
		
		
		//boolean  converted into String 
		boolean y =true;
		String s1 = String.valueOf(y);
		System.out.println(s1+60);  //output true40
		
		
		//Character converted into String
		char c = '@';
		String s2 = String.valueOf(c);
		System.out.println(s2+200);  //output @200
		
		//double converted into String
		double d = 20.00;
		String s3= String.valueOf(d);
		System.out.println(s3+70); //output 20.070
		
		

	}

}
