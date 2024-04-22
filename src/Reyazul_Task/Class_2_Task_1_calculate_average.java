package Reyazul_Task;

public class Class_2_Task_1_calculate_average {

	public static void main(String[] args) {
		// there is given marks
        int math = 60;
        int science = 66;
        int physics = 48;
        int biology = 74;

        // now i'm re Calculate or adding the sum of all marks
        
        int sum = math + science + physics + biology;

        // now i'm going to 
        double average = sum / 4;

        // Print the average
        System.out.println("Average marks for this student is : " + average );
        System.out.println(" That's means This student is pass!! ");

	}

}
