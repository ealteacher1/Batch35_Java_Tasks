package Shams_Demo;

public class java2 {

	public static void main(String[] args) {
		int math = 60;
		 int science = 66;
		 int physics = 74;
		 int biology = 48;
		 int sum = math + science+ physics+ biology;
		 int total_subjects = 4;
		int average = (sum/total_subjects);
		System.out.println(average);
		if( average >=90)
		 System.out.println( "grade=A");
		 else if (average>=70 & average <90) 
		 System.out.println("grade B");
		 
			
		 else if ( average>=40 & average <70) 
			 System.out.println("grade C");
		 
		 else if ( average>=20 & average<40) 
			 System.out.println("grade D");
		   
		 else if (average >=0 & average <20) 
			 System.out.println("grade F");
		 

			}    
		

	}

}
