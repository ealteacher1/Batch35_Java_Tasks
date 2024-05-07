package METHODE;

public class ClassAM_1 {

	
	    public static void main(String[] args) {
	        // Access methods from the same package
	    	Access_modifier.publicStaticMethod();
	        
	        Access_modifier obj = new Access_modifier();
	        obj.publicNonStaticMethod();
	        
	        // Since ClassAM_1 is in the same package, it can access all members of Access_modifier
	        
	        
	        Access_modifier.protectedStaticMethod();
	       
	        
	        Access_modifier.defaultStaticMethod();
	       
	    }
	}

