package israts_java_task;

import Israts_Java_2.Class_AM1;

public class Class_AM2 {

	public static void main(String[] args) {
	// Calling Non-Static Method
					Class_AM2 CallingFrom_AM_2 = new Class_AM2();
					CallingFrom_AM_2.PublicNonstatic();
					CallingFrom_AM_2.PrivateNonstatic();
					CallingFrom_AM_2.ProtectedNonstatic();
					CallingFrom_AM_2.DefaultNonstatic();
					
			// Calling Static Method from different package
					Class_AM1.addition() ;	

	}
	
		

// PUBLIC ACCESS MODIFIER 
		public void PublicNonstatic() {
			int f = 10;
			int o= 15; 
			int fifo = f + o;
			System.out.println("The value of first and last value :" +fifo);
		}
		
//  PRIVATE ACCESS MODIFIER 
		private void PrivateNonstatic() {
			String first = "private ";
			String last = "nonstatic"; 
			String firstlast = first + last;
			System.out.println("The name of the modifier : "+ firstlast);
		}
		
//  PROTECTED ACCESS MODIFIER 
		protected void ProtectedNonstatic() {
			String first = "protected ";
			String last = "nonstatic"; 
			String firstlast = first + last;
			System.out.println("The name of the modifier : "+firstlast);
		}
		
	// DEFAULT ACCESS MODIFIER 
		void DefaultNonstatic() {
			String first = "default ";
			String last = "nonstatic"; 
			String firstlast = first + last;
			System.out.println("The name of the modifier : "+firstlast);
		}
}
