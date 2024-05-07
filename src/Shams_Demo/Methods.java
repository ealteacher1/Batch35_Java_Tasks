package Shams_Demo;

public class Methods {

	public static void main(String[] args) {
		number1();
		months();
		benefit();
		grade();
		days();
		number1(5000,1000);
		months();
		benefit(4500,1300);
		grade(2,3,4);
		days(300,40);
		//person1
		String coffeeforperson1=machine("black coffee","two spoons","two creams");
		System.out.println(coffeeforperson1);
		//day1
		int day1=totaldays(365,300);
		System.out.println(day1);
		//grade1
		int grade1=totalgrade(80,60,50);
		System.out.println(grade1);
		//totalpaycheck1
		String totalpaycheck1=("3000-250");
		System.out.println(totalpaycheck1);
		//benefitt1
		int benefitt1=benefits(4000,1000);
		System.out.println(benefitt1);
		//This for object task03_part2
		Object[][]array2=abc();
				for(Object[]a:array2) {
		        for(Object value:a) {        
		System.out.println(value);
		        }
		  Object[][]array3=school();
		     for(Object[]b:array3) {
		    	 for(Object value:b) {
		    		 System.out.println(value);
		    	 }
		   Object[][]array4=house();
		   for(Object[]c:array4) {
			   for(Object value:c) {
				   System.out.println(value);
			   }
		   String[][]array5=city();
		   for(String[]d:array5) {
			   for(String value:d) {
				   System.out.println(value);
			   }
			 country();
			 
			  }
		   }
				   
		     }
		        
		        
		     } 
		     }

	//method without argument(non return type)
   public static void number1() {
	int income=3000;
	int tax=250;
	int paycheck=3000-250;
	System.out.println(paycheck);
		
	}
	public static void months() {
	  String month01="january";
	  String month02="february";
	  String exams="january+february";
	  	System.out.println(exams);
    }	
	public static void benefit() {
	  int total=20000;
	  int workers=10000;
	  int benefitt=20000-10000;
	  System.out.println(benefitt);
	}
	public static void grade() {
	int a=80;
	int b=60;
	int c=50;
	System.out.println(c);
	}
	public static void days() {
		int total=365;
		int work=300;
		int weekends= 365-300;
		System.out.println(weekends);
		
		                                             //Task_02
	}
	                       //method with argument(non return type)
	
	public static void number1(int income,int tax) {
		int paycheck=income-tax;
		System.out.println(paycheck);
	}
	public static void months(String month01) {
		String exams="january+february";
		System.out.println(exams);
	}
	public static void benefit(int total, int workers) {
		int benefitt=total-workers;
		System.out.println(benefitt);
				
	}
	public static void grade(int a,int b, int c) {	
		
	    System.out.println(b);
	
	}
	public static void days(int total, int work) {
	       int weekends=total-work;
		System.out.println(weekends);
	}
	
	                                 //Task03
	                       // method without argument(return type)
	
	public static String machine (String coffee,String sugar, String milk) {
		String maincoffee=coffee+sugar+milk;
		return maincoffee;
		
	}
	public static int totaldays(int total, int work) {
		int weekends=total-work;
		return weekends;
	}
	public static int totalgrade(int a, int b, int c) {
	    return c;
	}
	public static String moneytotal(String income, String tax) {
	 String paycheck="income-tax";
	 return paycheck;
	
	}
	public static int benefits(int income,int workers) {
	int benefitt=4000-1000;
	return benefitt;
	}
	                                       //part02-Return Object array
	public static Object[][]abc(){
	Object samira[][]= {{"shams",6.8,'c'},{2,"fal"}};
	return samira;
	}
	public static Object[][]school(){
		Object bus[][]= {{9,7,8},{"school1",'h',9}};
		return bus;
	}
	public static Object[][]house(){
		Object room[][]= {{"nice",3,'r'},{"beautiful",8},{"tv",9,'l'}};
		return room;
		
	}
	public static String [][]city(){
		String place[][]={{"columbus","usa"},{"canada","france"}};
		return place;
	}
	public static int []county(){
		int space[]= {100,9};
		return space;
	}
			
	
	
	
	
}
