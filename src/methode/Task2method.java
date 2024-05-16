package methode;

public class Task2method {

	public static void main(String[] args) {
		  //TODO auto-generated method stub
	
   //Method with arguments
		
		Monthlyprofit(2000 , 1500 , "may");
		
		
		
		Myaccount( 100, 200,300,4000);
		Mydrinks( "coffee", "Milkchake", "soda", "tea");
		Myorder('B');
		Mypasscode(30.40d , 23.70d);
		atrue(4 ,6);
		
	}
		
		public static void Monthlyprofit( int income ,int expense , String nameofmonth) {
			int Monthlyprofit= income-expense ;
			System.out.println("Profitofperson : " +nameofmonth+ "=" +Monthlyprofit);
			
		}
		//integer
			public static void Myaccount(int a,int b ,int c, int d) {
				int Myaccount = a+b+c+d ;
				System.out.println("Accountbalance :" +Myaccount);
			}
				
		//String
			public static void Mydrinks (String cf , String mk , String sd , String t) {
				String Mydrinks = cf+mk+sd+t;
				System.out.println("Drinksconsumed :" +Mydrinks );
			}
		//char
			public static void Myorder (char x) {
				char myorder =x ;
				System.out.println("command :"  +myorder);
			}
			//double
			public static void Mypasscode (double g,double h) {
				double Mypasscode = g+h ;
				System.out.println("password :" + Mypasscode);
			
			}
			
			//if else 
			public static void atrue(int a, int b) {
				if (a==b) {
					System.out.println("statement is true" );
					
				}else {
					System.out.println("statement is false ");
					
				}
				
				
			}
				
		
		
		

	

}