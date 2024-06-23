package tasks_shaheena;

    public class TestBrowser {

	 public static void main(String[] args) {
		 
		 
		WebDriver1  driver = new ChromeDriver1();
		
		driver.get_url("https://www.Amazon.com");
		
		driver.close();
		
		driver.quit();
		
		System.out.println("*********************************");
		
		
		//Methods -Firefox-Gecko Driver
		GeckoBrowser();
		
		System.out.println("*********************************");
		
		
		//Methods Edge Driver
		EdgeBrowser();
		
		System.out.println("********************************");
		
		
		//Methods Safari Driver
		SafariBrowser();
		
		System.out.println("********************************");
		

	 }
	
	 public static void GeckoBrowser() {
		
		WebDriver1  driver = new GeckoDriver();
		driver.get_url("https://www.Amazon.com");
		driver.close();
		driver.quit();
		
	 }
	 
     public static void EdgeBrowser() {
		
		WebDriver1  driver = new EdgeDriver1();
		driver.get_url("https://www.Amazon.com");
		driver.close();
		driver.quit();

        }
     
     public static void SafariBrowser() {
 		
 		WebDriver1  driver = new SafariDriver();
 		driver.get_url("https://www.Amazon.com");
 		driver.close();
 		driver.quit();
    
    
    
    }}
