package METHODE;

public class Class_D {

	 public static void main(String[] args) {
	        // Call all constructors from the same class
	        new Class_D();
	        new Class_D(5);
	        new Class_D("love");
	        new Class_D(20, "daughter");
	        new Class_D("mum", 1);
	    }
	 
	    // Constructor 1
	    public Class_D() {
	        System.out.println("Constructor 1 called.");
	    }
	    
	    // Constructor 2
	    public Class_D(int a) {
	        System.out.println("Constructor 2 called with argument: " + a);
	    }
	    
	    // Constructor 3
	    public Class_D(String str) {
	        System.out.println("Constructor 3 called with argument: " + str);
	    }
	    
	    // Constructor 4
	    public Class_D(int a, String str) {
	        System.out.println("Constructor 4 called with arguments: " + a + " and " + str);
	    }
	    
	    // Constructor 5
	    public Class_D(String str, int a) {
	        System.out.println("Constructor 5 called with arguments: " + str + " and " + a);
	    }
	    
	   
	}

