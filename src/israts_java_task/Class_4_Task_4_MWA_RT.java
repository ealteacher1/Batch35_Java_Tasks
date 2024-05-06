package israts_java_task;

public class Class_4_Task_4_MWA_RT {

	public static void main(String[] args) {
		int income = i(30, 60);
		System.out.println("The total amount of income : " + income);
		float attractive = fun(3.9f, 1.2f);
		System.out.println("The value of float attractive : " + attractive);
		double lepidopteran = butterfly(20.5, 15.5);
		System.out.println("The value of lepidopteran : " + lepidopteran);
		int holographic = polychromatic(25, 10);
		System.out.println("The value of holographic : " + holographic);
		boolean story1 = story(29, 20);
		System.out.println(story1);
		Object[] laugh = Smile(10);
		laugh[0] = 5;
		laugh[1] = 6;
		laugh[2] = 7;
		for (Object j : laugh) {

			System.out.println(j);

			int[] scratch = cat(5);
			scratch[0] = 11;
			scratch[1] = 12;
			scratch[2] = 13;
			scratch[3] = 14;
			for (Object d : scratch) {
				System.out.println(d);
			}

			String[][] happy = Celebration("Love", "Life");
			happy[0][0] = "Live your life";
			happy[0][1] = "to the fullest";

			for (String joy[] : happy) {
				for (String chuckle : joy) {
					System.out.println(chuckle);
				}
			}
		}

		Object snigger[][] = giggle("Laugh like ", "crazy");
		snigger[0][0] = "Funny";
		snigger[1][1] = "crazy";
		snigger[2][1] = "and ";
		snigger[2][2] = "not so fun ";
		for (Object guffaw[] : snigger) {
			for (Object titter : guffaw) {
				System.out.println(titter);
			}
		}
	}

//Task_1_Method_with_Arguments_ (Return_Type)
//With int - addition
	public static int i(int a, int b) {
		int income = a + b;
		return income;
	}

//With Float subtraction
	public static float fun(float pretty, float pleasing) {
		float attractive = pretty - pleasing;
		return attractive;
	}

//With Double multiplication-
	public static double butterfly(double catterpiller, double monarch) {
		double lepidopteran = catterpiller * monarch;
		return lepidopteran;
	}

//with int  with remainder-
	public static int polychromatic(int prismatic, int multicolored) {
		int spectrum = prismatic % multicolored;
		return spectrum;
	}

//With float if_else 
	public static boolean story(int a, int b) {
		boolean ismax = false;

		if (a >= b) {

			ismax = true;

			System.out.println("Print out :" + true);
		} else {

			System.out.println("Print out : " + false);
		}

		return ismax;
	}

//Task-2 different data type with dimension-
//1 dim object array -
	public static Object[] Smile(Object j) {
		Object laugh[] = new Object[3];

		return laugh;

	}

	// 1 dim int array -
	public static int[] cat(int c) {
		int scratch[] = new int[4];
		return scratch;

	}

	// 2 dim string array-
	public static String[][] Celebration(String e, String d) {
		String happy[][] = new String[2][2];
		return happy;

	}

	// 2 dim object array -
	public static Object[][] giggle(Object s, Object i) {
		Object snigger[][] = new Object[3][3];
		return snigger;
	}
}
