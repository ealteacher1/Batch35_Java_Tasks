package tasks_shaheena;

public class SafariDriver implements WebDriver1 {
	
	
	
	
	
	public   SafariDriver() {
		
	System.out.println("If this constructor is called, open Safari Browser directly");
		
		
	}

	@Override
	public void get_url(String Url) {
	System.out.println("if this method is called, provided url (as input parameter)  will be open in Safari Browser");
		
		
		
	}

	@Override
	public void close() {
	System.out.println("if this method is called, Safari Browser current window will be closed");	
		
	}

	@Override
	public void quit() {
	System.out.println("If this method is called, all Safari Browser 's open windows will be closed ");	
		
	}

}
