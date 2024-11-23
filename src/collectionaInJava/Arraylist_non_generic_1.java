package collectionaInJava;

import java.util.ArrayList;

public class Arraylist_non_generic_1 {

	public static void main(String[] args) {
		
		//Task_06
		
		
		ArrayList employees=new ArrayList();
		employees.add(true);
		employees.add(10);
		employees.add('c');
		employees.add(20.22d);
		employees.add("sam");
		System.out.println(employees.size());
		
		for(int i=0;i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
				
		
		
		
		ArrayList teachers=new ArrayList();
		teachers.add(12);
		teachers.add('d');
		teachers.add("dslil");
		teachers.add(false);
		teachers.add(12.21d);
		System.out.println(teachers.size());
		
		for(int a=0;a<teachers.size();a++) {
			System.out.println(teachers.get(a));
		}
				
		
		
		
		ArrayList students=new ArrayList();
		students.add(13);
		students.add('e');
		students.add("fsti");
		students.add(222.222d);
		students.add(12);
		System.out.println(students.size());
		
		for(int b=0;b<students.size();b++) {
			System.out.println(students.get(b));
		}
		
		
	}

}
