package Shams_Demo;

public class rima_task_2 {

	public static void main(String[] args) {
		// Task2 calculate average.
		int Math=60;
		int Science=66;
		int Physics=48;
		int Biology=74;
		int Avg=(Math+Science+Physics+Biology)/4;
		System.out.println(Avg);
		
		// Task2 calculate grade.
		if (Avg>=90 && Avg<=100 ){
	System.out.println("grade=A");
		}else if (Avg>=80 && Avg<=89) {
			System.out.println("grade=B");
		}else if (Avg>=70 && Avg<=79){
			System.out.println("grade=C");
		}else if (Avg>=60 && Avg<=69) {
			System.out.println("grade=D");
		}else {
			System.out.println("programme is successfull");
		}

	}

}
