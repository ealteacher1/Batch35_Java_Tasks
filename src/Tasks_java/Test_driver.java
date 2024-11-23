package Tasks_java;

public class Test_driver {

	public static void main(String[] args) {
		Gecko_driver driver= new Safari_driver();
	     driver.get_url("https://www.amazon.com");
	     driver.close();
	     driver.quit();
	     
	}

}
