package tasks_shaheena;

public class Test_Person {

	public static void main(String[] args) {
	Person1 person = new Teacher1();
	person.teach();

	}
}
	class Person1{        
		public void teach(){       
			System.out.println("Person can teach");    
		} 
	} 
	class Teacher1 extends Person1 {  
		@Override
		public void teach() {       
			System.out.println("Teacher can teach in a school");    
		} 
	} 
	     
			
	

