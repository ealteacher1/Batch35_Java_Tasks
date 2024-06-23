package tasks_shaheena;

public class GeckoDriver implements WebDriver1{
	
	
	
	
	public GeckoDriver() {
		
		System.out.println("If this constructor is called, open  Gecko Browser directly");
		
	}

	@Override
	public void get_url(String Url) {
	System.out.println("if this method is called, provided url (as input parameter)  will be open in Gecko Browser");
		
			
		
	}

	@Override
	public void close() {
	System.out.println("if this method is called, Gecko Browser current window will be closed");	
		
	}

	@Override
	public void quit() {
	System.out.println("If this method is called, all Gecko Browser 's open windows will be closed ");	
		
	}

}
