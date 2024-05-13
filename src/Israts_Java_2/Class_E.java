package Israts_Java_2;

public class Class_E {

	public static void main(String[] args) {

// CALLING FORM cClass_D(
		Class_D FirstConstructor= new Class_D ();
		Class_D SecondContructor= new Class_D (10);
		Class_D ThirdConstructor=new Class_D("Calling by my name ");
		Class_D ForthConstructor=new Class_D (15,20);
		Class_D FifthConstructor=new Class_D ("The world revolb around money ",1000);
			
// Method calling from class E	
		Class_E CallE = new Class_E ();
		CallE.CallingFromE ();
		System.out.println(CallE.CallingFromE ());
		
		
//CALLING METHOD FROM CLASS_D
				Class_D Nsmethod = new Class_D ();
				Nsmethod.addition();
				Class_D Nsmethod1 = new Class_D ();
				Nsmethod1.objectarray (22,"Hello");
	} 

// Non_Static method 
	public String CallingFromE () {
		String E= "Call From E";
		return E;
	}
}
