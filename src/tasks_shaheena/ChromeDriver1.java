package tasks_shaheena;

public class ChromeDriver1 implements WebDriver1 {
	
	// hover over ChromeDriver1, clicked , added all unimplemented methods 
	
	
    // made ChromeDriver1 Constructor 
	public ChromeDriver1(){
		
	System.out.println("If this constructor is called, open Google Chrome Browser directly");
		
	}
	

	@Override
	public void get_url(String Url) {
	System.out.println("if this method is called, provided url (as input parameter)  will be open in Chrome Browser");
		
		
	}

	@Override
	public void close() {
	System.out.println("if this method is called, Chrome  Browser current window will be closed");
		
		
	}

	@Override
	public void quit() {
		
	System.out.println("If this method is called, all Chrome Browser 's open windows will be closed ");
		
		
	}

}
