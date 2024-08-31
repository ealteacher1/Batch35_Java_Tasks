package collectionaInJava;

public class Task_12 {

	public static void main(String[] args) {
		//Finalize method_Task_12
		 Task_12 ob=new  Task_12();
		 Task_12 ob1=new  Task_12();
		 ob=null;
		 ob1=null;
		 
       System.gc();
	}
public void finalize() {
	System.out.println("finalize method is called");
}
}
