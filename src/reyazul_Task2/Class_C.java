package reyazul_Task2;

public class Class_C {

	public static void main(String[] args) {
		
		
		Class_C obj = new Class_C();
		
	obj.CallingFromC();
	System.out.println(obj.CallingFromC());
	
	
	Class_A_Task5 fromA=new Class_A_Task5 ();
    fromA.pub();
    fromA.protect();
    fromA.defaultns();
    
    int r13 []=fromA.RTS();
    for (int T3:r13) {
        System.out.println("The retuning value of method RTS from class_A : "+ T3);
    }
    Object [][] T4 =fromA.Riyu();
    for (Object T5[]:T4) {
         for (Object T2:T4) {
             System.out.println("The retuning value of method hello from class_A : "+ T2);
	

	}
         }
  }
	
	public String CallingFromC () {
		
	String a1 = "give $500 to Riyu";
	return a1;
	}

}
