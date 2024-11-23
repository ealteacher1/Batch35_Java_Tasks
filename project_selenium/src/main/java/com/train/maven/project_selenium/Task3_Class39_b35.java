package com.train.maven.project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_Class39_b35 {

	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\project_selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.navigate().back();
		driver.navigate().forward();
		

		//verify the current url 
		String expected_url=("https://www.ebay.com/");
		String current_url=driver.getCurrentUrl();
		if(expected_url.equals(current_url)) {
		System.out.println("correct url");
		}
	else {
		System.out.println("incorrect url");
	
	}
	
	//the current url
		String expected_urll=("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2Fmye%2Fmyebay%2Fsummary&sgfl=sm&smuid=3b0a30df9bf64c7290cf421654ae4909");
	String rl=	driver.getCurrentUrl();
		if(expected_urll.equals(current_url)) {
			System.out.println("correct url");
		}
		else {
			System.out.println("incorrect url");
			
			
		WebElement myebay=	driver.findElement(By.cssSelector("#gh-eb-My > div > a.gh-eb-li-a.gh-rvi-menu"));
			myebay.click();
			
			
			//create account
			
			WebElement create_acc=driver.findElement(By.id("id=\"userid\""));
			create_acc.click();
		
			
			WebElement email=driver.findElement(By.id("userid"));
			 email.click();
			 email.sendKeys("samiram.sam1@gmail.com");
			 
			 WebElement continuebttn= driver.findElement(By.id("signin-continue-btn"));
			 continuebttn.click();
			
			//session id
			 
			 String session_id=driver.getWindowHandle();
			 System.out.println(session_id);
			 
			 //Refresh the page
			 driver.navigate().refresh();
			 
			 //Get page title 
			 
			 String page_title=driver.getTitle();
			 System.out.println(page_title);
			 
			 //Close the browser
			 driver.close();
			 
			 
			 
			 
			 
			 
			 
			
			
		}
		
		
		
	}
}
