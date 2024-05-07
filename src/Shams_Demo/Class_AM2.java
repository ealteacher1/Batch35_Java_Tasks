package Shams_Demo;

import METHODE.Access_modifier;

public class Class_AM2 {

	

	

	public class ClassAM_2 {
	    public static void main(String[] args) {
	        // Access only public members from Access_modifier
	    	Access_modifier.publicStaticMethod();
	        
	    	Access_modifier obj = new Access_modifier();
	        obj.publicNonStaticMethod();
	        
	        // Since ClassAM_2 is in a different package, it can only access public members of Access_modifier
	        // It cannot access private, protected, or default members
	    }
	}
	

}
