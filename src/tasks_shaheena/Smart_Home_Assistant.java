package tasks_shaheena;



/* 1.Create 5 interfaces and every interface will have it's own different abstract method.
 * 2.Create a normal java class without main method and make it child of all 5 interfaces directly with implements keyword.
 * 3.Create another Test class with main method and Test Dynamic Polymorphism with child class and Parent interfaces.
 * Try dynamic Polymorphism with all interfaces you've created*/


    public class Smart_Home_Assistant implements Smart_Phone,Smart_TV,Smart_Speakers,Smart_Thermostat,Smart_Device {

	@Override
	public void connecttoNetwork() {
	System.out.println("connecttoNetwork-abstract method from Smart_Device ");
		
	}

	@Override
	public void performSystemCheck() {
	
		System.out.println("performSystemCheck-abstract method from Smart_Device ");
	}

	@Override
	public void maintainstemperature() {
	
		System.out.println("maintainstemperature-abstract method from Smart_Thermostat"); 
	}

	@Override
	public void savesenergy() {
	
		System.out.println("savesenergy-abstract method from Smart Thermostat");
	}

	@Override
	public void playMusic() {
	System.out.println("playMusic-abstract method from smart_Speaker ");
		
	}

	@Override
	public void controls_light() {
	System.out.println("controls_light-abstract method from Smart_Speaker ");
		
	}

	@Override
	public void watchvideo() {
		System.out.println("watchvideo-abstract method from Smar_Tv");
		
	}

	@Override
	public void playgames() {
	System.out.println("playgames-abstract method from Smart_Tv");
	}

	@Override
	public void MakingphoneCalls() {
	System.out.println("MakingphoneCalls-abstract method from Smart_Phone");
		
		
	}

	@Override
	public void BrowsingWebsites() {
	System.out.println("BrowsingWebsites-abstract method from Smart_Phone");
		
	}
	
	
	//Own methods of Smart_Home_Assistant
	
	public void setsAlarms() {
	System.out.println("setsAlarms-method from  Smart_Home_Assistant");	
		
	}
	
    public void controlshomedevices() {
    System.out.println("controlshomedevices-method from Smart_Home_Assistant");
    	
    	
    }
}
  