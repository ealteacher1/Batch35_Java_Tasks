package reyazul_Task2;

public class Class_A_Task5 {

	public static void main(String[] args) {
		
		Class_C obj = new Class_C();
		obj.CallingFromC();
		System.out.println(obj.CallingFromC());
		

	}
	
	// PUBLIC METHOD
	
	    public void pub () {
	        String r1="non static public ";
	        String r2="method " ;
	        String r3=r1+r2;
	        System.out.println(r3);
	    }
	 // PRIVATE METHOD
	    private void priv () {
	        String r4="non static private ";
	        String r5="method " ;
	        String r6=r4+r5;
	        System.out.println(r6);

	    }
	 // PROTECTED METHOD
	    protected void protect () {
	        String r7="non static protected ";
	        String r8="method " ;
	        String r9=r7+r8;
	        System.out.println(r9);

	}
	    // DEFAULT METHOD 
	    void defaultns () {
	        String r10="non static default ";
	        String r11="method " ;
	        String r12=r10+r11;
	        System.out.println(r12);

	}
	 //1 DIMEnIONAL ARRAY 
	 public int[] RTS () {
	        int r13 []= {22,45};
	        for (int r14 :r13) {
	            System.out.println("printing in method value of r13 : "+ r14);
	        }

	        return r13;
	    }
	//2 DIMENTIONAL ARRAY 
	    public Object [][] Riyu () {
	        Object [][] Rey = {{4,5,6},{7,8," what's UP!! "}};
	        return Rey;

}
}
