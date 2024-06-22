package tasks_shaheena;

public class Test_Devices {
	
	
	
	  /* 3.Create another Test class with main method and Test Dynamic Polymorphism with child class and Parent interfaces.
	       Try dynamic Polymorphism with all interfaces you've created*/

	

	public static void main(String[] args) {
		
		 //calling  overridden methods from child class
	
		// Dynamic polymorphism/ Top casting
		Smart_Device   smdevice = new  Smart_Home_Assistant();
		smdevice.connecttoNetwork();
		smdevice.performSystemCheck();
		
		
		// Dynamic polymorphism / Top casting
		Smart_TV smtv= new  Smart_Home_Assistant();
		smtv.playgames();
		smtv.watchvideo();
		
		
		// Dynamic polymorphism / Top casting
		Smart_Phone smphone= new Smart_Home_Assistant();
		smphone.BrowsingWebsites();
		smphone.MakingphoneCalls();
		
		
		// Dynamic polymorphism/ Top casting
		Smart_Speakers smspeakers= new  Smart_Home_Assistant();
		smspeakers.controls_light();
		smspeakers.playMusic();
		
		
		// Dynamic polymorphism / Top casting
		Smart_Thermostat smthermostat = new  Smart_Home_Assistant();
		smthermostat.savesenergy();
		smthermostat.maintainstemperature();
		
		
		//methods from  Smart_Home_Assistant own class 
		   
	      Smart_Home_Assistant sha = new  Smart_Home_Assistant();
		  sha.setsAlarms();
		  sha.controlshomedevices();
	}

}
