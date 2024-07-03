package tasks_shaheena;




  //create a class "S7_T8_1AllWebsites" without MainMethod.
  //a.Declare 2 Global Variables String WebsiteName and String WebsiteLink;
  //b.Create a Constructor for this class 
  //c.Pass the same Name of Global Variables as Local Variables (String WebsiteName, String WebsiteLink) and 
  //inside the Constructor, 
  //d.set the global Variable value as a Local Variable Value 
  //2.CreateanotherClass"S7_T8_2ArrayList_Object1"withMainmethod.a.CreateThreeobjectsof"S7_T8_1AllWebsites"Class.i.For1rstObject,PassWebsiteNameas“Amazon”andWebsiteLinkas“https://www.amazon.com”ii.For2ndObject,PassWebsiteNameas“Walmart”andWebsiteLinkas“https://www.walmart.com”iii.For2ndObject,PassWebsiteNameas“Daraz”andWebsiteLinkas“https://daraz.com/”b.createanArraylist"AllWebsiteNameAndLinks"c.StoreAllthecreatedObjectsInsidetheArrayList.d.PrintAllIndexValuewiththeHelpofIteratore.PrintallIndexValueswithoutIterator133


    public class S7_T8_1AllWebsites {
	
	     //Global variable
	
	      String WebsiteName;
	      
	      String WebsiteLink;
	
	
		 //created constructor, passing local variables with same name as Global variables
		  public  S7_T8_1AllWebsites(String WebsiteName, String WebsiteLink) {
			
			  
		//Setting the values of Global variables to LOCAL VARIABLES	  
		  this.WebsiteName=WebsiteName;
			
		  this.WebsiteLink=WebsiteLink;
			
		} 
		
	
	
	 
	     }


