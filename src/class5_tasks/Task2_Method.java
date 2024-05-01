package class5_tasks;

public class Task2_Method {

	public static void main(String[] args) {
		performOperation (300, 467, 567);
		CalculateRectangleArea(5.0,3.0);
		PreparationOfPizza("Red tomato ", "Some flour ", "Some water ", "a tiny bit of yeast ", "a tiny bit of salt " );
		HouseExpensesForOneMonth(250, 200, 150, 300, "March");
		TemperatureConverter(98.5);	 
     }
//  Create 5 Method With Arguments -Non Return Type :
	
//  1st Method:
	public static void performOperation(int num1, int num2, int num3) {
	int sum=num1+num2+num3;
	System.out.println(sum);
	}

//  2nd Method:
	public static void CalculateRectangleArea(double length, double width) {
	double CalculateArea=length*width;
	System.out.println("Area of the Rectangle= "+CalculateArea);
	}
	
//  3rd Method:
	public static void PreparationOfPizza(String tomato, String flour, String water, String yeast, String salt) {
    String pizza=tomato+flour+water+yeast+salt;	
    System.out.println(pizza);
	}
	
//  4th Method:
	public static void HouseExpensesForOneMonth(int week1, int week2, int week3, int week4, String nameofmonth) {
	int Expenses=week1+week2+week3+week4;
	System.out.println("House Expenses For one Month "+ nameofmonth +"= "+Expenses);
		
	}
	
// 5th Method:
   public static void TemperatureConverter(double fahrenheit) {
   double celsius=(fahrenheit-32)*5/9;
   System.out.println(fahrenheit+" degrees fahrenheit is equal to "+celsius+" degrees celsius");
   if(celsius>29) {
   System.out.println("it's too hot");
   }
   else {
   System.out.println("it's too cold"); 	   
   }
   }
}
