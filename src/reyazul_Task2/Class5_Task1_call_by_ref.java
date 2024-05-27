package reyazul_Task2;

public class Class5_Task1_call_by_ref {

	public static void main(String[] args) {
		
		Class5_Task1_call_by_ref obj = new Class5_Task1_call_by_ref();
		Class5_Task1_call_by_ref obj2 = new Class5_Task1_call_by_ref();
		Class5_Task1_call_by_ref obj3 = new Class5_Task1_call_by_ref();
		Class5_Task1_call_by_ref obj4 = new Class5_Task1_call_by_ref();
		Class5_Task1_call_by_ref obj5 = new Class5_Task1_call_by_ref();
		
		obj.task1(new Class5_Task1_call_by_ref ());
		obj.task1(obj);
		
		obj2.task2(new Class5_Task1_call_by_ref ());
		obj2.task2(obj2);
		
		obj3.task3(new Class5_Task1_call_by_ref ());
		obj3.task3(obj3);
		
		obj4.task4(new Class5_Task1_call_by_ref ());
		obj4.task4(obj4);
		
		obj5.task5 (new Class5_Task1_call_by_ref ());
		obj5.task5(obj5);
	}
		    
		    
	public void task1 (Class5_Task1_call_by_ref  frist) {
		System.out.println(frist);
		
	}
	public void task2 (Class5_Task1_call_by_ref  second) {
		System.out.println(second);
	}
	public void task3(Class5_Task1_call_by_ref  third) {
		System.out.println(third);
	}
	public void task4 (Class5_Task1_call_by_ref  forth) {
		System.out.println(forth);
	}
	public void task5(Class5_Task1_call_by_ref  fifth) {
		System.out.println(fifth);
	}
		    
		}