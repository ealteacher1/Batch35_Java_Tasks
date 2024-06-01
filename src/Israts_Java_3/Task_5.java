package Israts_Java_3;

public class Task_5 {
	
	
   //PRIVATE GLOBAL VARIALE 
	
	private int age; 
	private int salary ;

	// SETTER AND GETTER METHOD 

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main (String []args) {
		
		Task_5 ob =new Task_5 ();
		ob.setAge(25);// SETTER
		ob.setSalary(10000); 
		
		int global= ob.getAge(); // GETTER
		System.out.println(global);
		
		int global2= ob.getSalary(); // GETTER
		System.out.println(global2);  

	}
	

}
