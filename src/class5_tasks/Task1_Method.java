package class5_tasks;

public class Task1_Method {

	public static void main(String[] args) {
		addition();	 
	    subtraction();
	    condition();
	    pizza();
	    CheckInTheCondition(); 
   }

//  Create 5 method without Arguments-no Return type :(No input ,No output)
	
// 1st method:
	public static void addition() {
	int a=1500;
	int b=2000;
	int sum=a+b;
	System.out.println(sum);
	}
	
//	2nd method:
	public static void subtraction() {
	int c=5000;
	int d=1350;
	int sub=c-d;
	System.out.println(sub);
}
	
//	3th method:
	public static void condition() {
	int abc=2000;
	if (abc>3567) {
	System.out.println("the condition is true");	
	} 
	else {
	System.out.println("the condition is false");	
	}
	}
	
// 4th method:
	public static void pizza() {
	String tomato="Red tomato ";
	String Flour="white flour ";
	String water="some water ";
	String yeast="some yeast ";
	String salt="a tiny bit of salt ";
	String pizza=tomato+Flour+water+yeast+salt ;
	System.out.println(pizza);
	}
	
//5th method: 
  public static void CheckInTheCondition() {
  int d=450;
  while(d<=500) {
  System.out.println("The value of d= "+d);
  d++;
  }
  }

}
