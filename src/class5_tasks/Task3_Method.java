package class5_tasks;

public class Task3_Method {

	public static void main(String[] args) {
		int sum=addition();	
	    System.out.println(sum);
	    
	    String condition=checkNumber();
	    System.out.println(condition);
	    
	    int sub=subtractNumbers();
	    System.out.println(sub);
	    
	    String check=subtractAndCheck();
	    System.out.println(check);
	    
	    String equalOrNot=checkTheDifferenceIfEqual();
	    System.out.println(equalOrNot);
	    
	    Object[] personArray= oneDimArray();
	    for(Object personArray1:personArray) {
	    	System.out.println(personArray1);
	    }
	    
	    int[] differentnumbers=integerArray();
	    for(int diffnumbers:differentnumbers) {
	    	System.out.println(diffnumbers);
	    	}
	    
	    String[][] Multinames=stringArray();
	    for(String[] Multinames1:Multinames) {
	    	for(String Multiname:Multinames1) {
	    		System.out.println(Multiname);
	    	}
	    	
	    Object[][] NamesAndAge=TwoDimObArray();
	    for(Object[] NamesAndAge1:NamesAndAge) {
	    	for(Object NamesAndAge2:NamesAndAge1) {
	    		System.out.println(NamesAndAge2);
	    	}
	    }
	    }
		}

	//1-  Create 5 Method Without Arguments -Return Type :	
		
	//  1st method:
		public static int addition() {
	    int D=200;
	    int F=400;
	    int H=570;
	    int sum=D+F+H;
	    return sum;
		}

	//  2nd method:
		public static String checkNumber() {
		 int number=10;
		
		if (number>0) {
			return "positive";
		} 
		else if (number<0) {
			return "negative";
			}
		else {
			return "zero";
		}
		}
		
	//  3rd method:
		public static int subtractNumbers() {
		int a=10;
		int b=5;
		int sub=a-b;
		return sub;
		}
		
	//  4th method:
		public static String subtractAndCheck() {
			int a=10;
			int b=5;
			int result=a-b;
			
			if(result>0) {
				return "result is positive ";}
			
			else if (result<0) {
				return "result is negative";}
			
			else {return "result is zero ";
			}
			
		}
		
	//  5th method:
		public static String checkTheDifferenceIfEqual() {
			int G=30;
			int T=20;
			int Target=10;
			int difference=G-T;
			
			if (difference>Target) {
				return "false";
			}
			else if (difference<Target) {
				return "false";
			}
			else {
				return "true";
			}
		}
		
		
	//2-  Create 4 return type methods:
		
	//  1st method 1 Dim Object Array :
		public static Object[] oneDimArray() {
			Object persons[]= {"Adam",10,"Lyes",1,'l'};
			return persons;
	}

		
		
	//  2nd method 1 dim int Array :
		public static int[] integerArray() {
		int numbers[]= {10,20,30,40};
		return numbers;
		}
		
	//  3rd method 2 dim String Array :
		public static String [][] stringArray() {
			String Names[][]= {{"Adam","Tina"},{"John","Lyes"},{"Asma","Lina"}};
			return Names;
		}
		
	//  4th method 2 dim Object Array :
		public static Object [][] TwoDimObArray(){
		Object NamesAges[][]= {{"Adam",3},{"Lyes",55},{"Tina",45}};
		return NamesAges;
		}
		
		
		
		
		
		
		
		
	}
