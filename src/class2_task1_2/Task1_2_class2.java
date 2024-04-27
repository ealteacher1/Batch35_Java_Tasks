package class2_task1_2;

public class Task1_2_class2 {

	public static void main(String[] args) {
		
//		 1- Calculate Average :
			int math=60;
			int science=66;
			int physics=48;
			int biology=74;
//		 Get Sum :
			int sum=math+science+physics+biology;
			System.out.println("the sum is= "+sum);
//		 Get Average :
			System.out.println("Average is= "+sum/4);
			
//		 2- if and else-if statement to calculate the grade :
			int Computer=90;
			int Science=60;
			int Math=50;
//			get the total :
			int total=Computer+Science+Math;
			System.out.println("the total is= "+total);
//			Get the average :
			int average=total/3;
			System.out.println("average= "+total/3);
//			if and else-if statement : 
			
			if( average>=90 && average<=100) {
				System.out.println("student got grade A");
			}
			else if (average>=80 && average<=89) {
				System.out.println("student got grade B");
			}
			else if (average>=70 && average<=79) {
				System.out.println("student got grade c");
			}
			else if (average>=60 && average<=69) {
				System.out.println("student got grade d");
			}
			
		 

	}

}
