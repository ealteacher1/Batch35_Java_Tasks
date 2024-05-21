package reyazul_Task2;

public class Class_AM1 {

	public static void main(String[] args) {
		
		        Class_AM1 ob = new Class_AM1();
		        
		        ob.publicNonStaticMethod1();
		      ob.publicNonStaticMethod2();
		        ob.privateNonStaticMethod();
		        
		        System.out.println(ob.protectedNonStaticMethod(10, 20));
		        ob.protectedNonStaticMethod2();
		        
		        System.out.println(ob.protectedStaticMethod(50, 2));
		        ob.defaultNonStaticMethod1();
		        
		        System.out.println(ob.defaultNonStaticMethod2());

		        // CALLING STATIC METHODS
		        add();
		        privateStaticMethod();
		        defaultStaticMethod();
		    }

		    // PUBLIC NON-STATIC METHODS
		    public void publicNonStaticMethod1() {
		        String part1 = "public ";
		        String part2 = "non-static method";
		        String result = part1 + part2;
		        System.out.println(result);
		    }

		    public void publicNonStaticMethod2() {
		        int num1 = 10;
		        int num2 = 20;
		        int sum = num1 + num2;
		        System.out.println("The sum is: " + sum);
		    }

		    // PUBLIC STATIC METHOD
		    public static void add() {
		        int num1 = 10;
		        int num2 = 20;
		        System.out.println("The total of addition: " + (num1 + num2));
		    }

		    // PRIVATE NON-STATIC METHOD
		    private void privateNonStaticMethod() {
		        String part1 = "private ";
		        String part2 = "non-static method";
		        String result = part1 + part2;
		        System.out.println(result);
		    }

		    // PRIVATE STATIC METHOD
		    private static void privateStaticMethod() {
		        int amount1 = 50;
		        int amount2 = 100;
		        int total = amount1 + amount2;
		        System.out.println("The total amount is: " + total);
		    }

		    // PROTECTED NON-STATIC METHODS
		    protected int protectedNonStaticMethod(int a, int b) {
		        return a * b;
		    }

		    public void protectedNonStaticMethod2() {
		        Object[][] array = {{10, "Solar"}, {20, "Eclipse"}};
		        for (Object[] outerArray : array) {
		            for (Object element : outerArray) {
		                System.out.println("Element: " + element);
		            }
		        }
		    }

		    // PROTECTED STATIC METHOD
		    public static int protectedStaticMethod(int a, int b) {
		        return a / b;
		    }

		    // DEFAULT NON-STATIC METHODS
		    void defaultNonStaticMethod1() {
		        String[] words = {"Love", "your", "self", "is the best"};
		        for (String word : words) {
		            System.out.println("quote: " + word);
		        }
		    }

		    int defaultNonStaticMethod2() {
		        int math = 40;
		        int science = 90;
		        int english = 90;
		        int average = (math + science + english) / 3;
		        return average;
		    }

		    // DEFAULT STATIC METHOD
		    static void defaultStaticMethod() {
		        String part1 = "default ";
		        String part2 = "static";
		        String result = part1 + part2;
		        System.out.println("Result: " + result);
		    }
		}
