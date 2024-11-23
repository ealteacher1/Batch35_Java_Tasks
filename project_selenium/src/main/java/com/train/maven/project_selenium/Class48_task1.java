package com.train.maven.project_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class48_task1 {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\project_selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		
		//Amazon page
		//current url
		 
		 String current_url=driver.getCurrentUrl();
		 System.out.println(current_url);
		
		 //page title
		 
		 String page_title=driver.getTitle();
		 System.out.println(page_title);
		
		WebElement search_field=driver.findElement(By.id("twotabsearchtextbox"));
		search_field.click();
		search_field.sendKeys("phones");
		
		
		WebElement press= driver.findElement(By.className("nav-input nav-progressive-attribute"));
		press.click();      
		
		//current url
		
		String current_URL=driver.getCurrentUrl();
		System.out.println(current_URL);
		
		//go back
		driver.navigate().back();               
		
		//select All
		
		WebElement All_elements=driver.findElement(By.name("url"));
		Select ALL=new Select(All_elements);
	      ALL.selectByIndex(2);
	    		  
	      WebElement amazon_devices=driver.findElement(By.name("url"));
		Select devices=new Select(amazon_devices);
		devices.selectByVisibleText("Black Friday");
		
		WebElement amazon_pharmacy=driver.findElement(By.name("url"));
		Select pharmacy=new Select(amazon_pharmacy);
		pharmacy.selectByValue("search-alias=amazonfresh");
		
		
		
		driver.close();
		
	}

}
