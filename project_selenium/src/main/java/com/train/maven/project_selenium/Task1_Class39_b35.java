package com.train.maven.project_selenium;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Class39_b35 {
   static WebDriver driver;
	public static void main(String[] args) {
		
		           
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\project_selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//Task-1_Class39_b35
		//verify current url and page title
		
		String expected_url=("https://www.amazon.com/");
		String current_url=driver.getCurrentUrl();
		    System.out.println("current url is correct");
	
		    if (current_url.equals(expected_url)) {
		    	System.out.println("current url is correct");
		    }
		    else{
		    	System.out.println("curren url is not correct");
		    }
		
		// verify page_title
		    
		   String actual_title= driver.getTitle();
		System.out.println("actual_title");           
		
		
		        //Hover over on acounts&lists and click on music library by storing elements by expath
		
		           WebElement account_list=      driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		           account_list.click();
		
		 WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
		 email.click();
		 email.sendKeys("samira@gmail.com");
		
	  WebElement continue_butt=   driver.findElement(By.xpath("//input[@id='continue']"));
	  continue_butt.click();      
		
		//click on music , it wont be clickabale,so verify the url
	              WebElement music= driver.findElement(By.xpath("//a[@class='nav-a'][1]"));
	              music.click();
	              
	             //verify the url
	              String expected_URL=("https://www.amazon.com/music/player?ref_=nav_cs_music");
	             String current_URL= driver.getCurrentUrl();
		          if(current_URL.equals(expected_URL)) {
		        	  System.out.println("correct url");    
		          }
		          else {
		        	  System.out.println("incorrect url");
		          }         
		
		           WebElement search_field=  driver.findElement(By.id("twotabsearchtextbox"));
		            search_field.click();
		            search_field.sendKeys("phone");
		
		          WebElement search_buttn= driver.findElement(By.xpath("//input[@type='submit']"));
		          search_buttn.click();
		
	
		      String expected_url1="https://www.amazon.com/s?k=phomes&crid=3BNATUFEOOTFZ&sprefix=phomes%2Caps%2C144&ref=nb_sb_noss_2";
		
		         String actural=driver.getCurrentUrl();
		            System.out.println("actual");
		
		         driver.navigate().back();    
		
		//m
		      WebElement m=   driver.findElement(By.name("//a[@class='a-carousel-goto-prevpage']"));
		      m.click();
		
		         WebElement m2= driver.findElement(By.className("hmenu-item hmenu-title "));
		         m2.click();
		
		       WebElement amazon_fresh=          driver.findElement(By.className("hmenu-item hmenu-title "));
		       amazon_fresh.click();
		
		
driver.close();
	}

}
