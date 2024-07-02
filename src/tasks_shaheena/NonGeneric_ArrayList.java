package tasks_shaheena;

import java.util.ArrayList;



public class NonGeneric_ArrayList {
	
	
	//Create 3 NonGeneric Array list and Arraylist Name will be “Employees”, “Teachers”, “Students”.
	//a.Put mixed 5 Primitive Data Type values Inside each Arraylists. 
	//b.Print the length of the Employees,  Teachers, Students Arraylist.
	//c.Print the Values of Each arraylist with For Loop and For Each Loop.
	//The Consol should be easily Understandable. Use Separations (example: Syso(********StudentsallvaluebySimpleForLoop****)


	public static void main(String[] args) {
		
    //Employees 
	ArrayList employees  = new ArrayList();
	
	employees.add("Hasan");
	employees.add(5.5);
	employees.add(35);
	employees.add('M');
	employees.add(true);  
    
    System.out.println("Length of employees: " +employees.size());
    for (Object x : employees) {
    System.out.println(x);
    }
    System.out.println("*****employees Values by for each loop *********");
    
    for (int i =0; i<employees.size(); i++) {
    System.out.println(employees.get(i));	
    	
    }
    System.out.println("********employees values by for loop************");
    
    
    
    //Teachers 
    ArrayList teachers = new ArrayList();
    
    teachers.add("Shams");
    teachers.add(5.8);
    teachers.add(30);
    teachers.add('M');
    teachers.add(true);
    
    System.out.println("Length of teachers is:"  +teachers.size());
    
    
    for (Object  z :  teachers) {
    System.out.println(z);	
    	
    }
    System.out.println("**********teachers values by for each loop*****************");
     
    
    
    for (int a= 0; a<teachers.size(); a ++) {
    System.out.println(teachers.get(a));	
    	
    }
    
    System.out.println("*********teachers values by for loop  ");
    
    
    
    // Students 
    ArrayList students  = new ArrayList();
    students.add("Rony");
    students.add(5.7);
    students.add(40);
    students.add('M');
    students.add(true);  
    
    System.out.println("Length of students :"  +students.size());
    
    
    for (Object y : students ) {
    System.out.println(y);
    }
    System.out.println("*********students values by for each loop************");
    
	for (int j = 0; j<students.size(); j ++) {
	System.out.println(students.get(j));	
		
	} 
	System.out.println("********students Values  by for loop*******************");	
	
    }
   
    
	
	}


