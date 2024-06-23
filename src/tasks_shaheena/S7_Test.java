package tasks_shaheena;




 public class S7_Test {

	
	//Create 5 Interface and 3 Classes. Create a “S7_Test” 
	//a.Create those 5 types Interface type Global Variable and 3 Class Type Global Variable
	//b.Create 3 non Static methods in the same Test Class 
	//c.Put value for all Global Variables in All Methods.
	
	
	
	
	
	
	int IRA;
	int PersonalLoan;
	int OverDraft;
	
	S7_Test test; //class type Global variable 
	
	
	//interface type Global variable 
	CANADA_Bank    Driver1;
	Asian_Bank     Driver2;
	US_Bank        Driver3;
	UK_Bank        Driver4;
	Amsterdam_Bank Driver5;
	
	
	
	//class type Global variable 
	 Child_1_of_interface GV1;
	 Child_2_of_interface GV2; 
	 Child_3_of_interface GV3;
	

	
	 
	 public static void main(String[] args) {
		
		S7_Test test = new S7_Test();
		 
		test.IRA();
		test.OverDraft();
	    test.PersonalLoan();
	    
	    //Top casting 
	    CANADA_Bank cb= new Child_1_of_interface ();
	    cb.Voucher();
	    
	    Asian_Bank ab=  new Child_1_of_interface ();
	    ab.moneytransfer();
	    ab.Debit();
	    
	    US_Bank ub =  new Child_1_of_interface ();
	    ub.Certificate_of_Deposit();
	    
	    UK_Bank uk =  new Child_1_of_interface ();
	    uk.credit();
	    uk.debit();
	    
		Amsterdam_Bank am= new Child_1_of_interface ();
		am.FixedDeposit();
		
		
	    }
	
	
	 
	 public void values() {
	
      
		
	    Driver1 = new Child_1_of_interface ();
	    
	    Driver1.Voucher();                //Canada Bank
	    Driver2.Debit();                  //Asian Bank
	    Driver3.Certificate_of_Deposit();  //US Bank
	    Driver4.credit();                  //UK Bank
	    Driver5.FixedDeposit();            //Amsterdam Bank
	    test.PersonalLoan();
	    test.IRA();
	    test.OverDraft();
	    
	    
	    
	  
	    
	}
		
		public void IRA() {
			
		   
			IRA=7000;
		    
			
		System.out.println("IRA amount is " + IRA);
		
	}
		
		public void PersonalLoan(){
			
			
			PersonalLoan=10000;
			
			
		System.out.println("Personal Loan amount is " +PersonalLoan);
		
			
		}
	
        public void OverDraft() {
        	
        	
        	OverDraft=5000;
        	
        	
        	System.out.println("overdraft amount is " + OverDraft);
        }
	}


