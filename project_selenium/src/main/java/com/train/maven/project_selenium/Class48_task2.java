package com.train.maven.project_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class Class48_task2 {
 static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\project_selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 driver.navigate().back();
		 driver.navigate().forward();
		
		 //click create new account 
		 
    WebElement create_acc=   driver.findElement(By.id("u_0_0_s7"));
    create_acc.click();
		 
		WebElement email= driver.findElement(By.name("email"));
		 email.click();
		 email.sendKeys("samiram@gmail.com");
		 
		WebElement pass= driver.findElement(By.name("pass"));
		 pass.click();
		 pass.sendKeys("abc123");   
		 
		WebElement first_name=   driver.findElement(By.name("firstname"));
        first_name.click();
        first_name.sendKeys("sami");
    
     WebElement last_name=  driver.findElement(By.name("lastname"));
    last_name.click();
    last_name.sendKeys("medj");
    
       WebElement all_months= driver.findElement(By.id("month"));
    Select month=new Select(all_months);
    month.selectByIndex(0);
    
      WebElement all_day=  driver.findElement(By.id("day"));
      Select day=new Select(all_day);
     day.selectByVisibleText("3");
    
       WebElement all_years= driver.findElement(By.className("2020"));
      Select year=new Select(all_years);
      year.selectByValue("2020");
      
      
     WebElement female_btt= driver.findElement(By.className("_8esa"));
      female_btt.click();
    
    WebElement custom=  driver.findElement(By.className("_8esa"));
      custom.click();
      
      WebElement phone_num=driver.findElement(By.name("reg_email__"));
      phone_num.click();
      
    WebElement new_pass=  driver.findElement(By.id("password_step_input"));
      new_pass.click();
      new_pass.sendKeys("sami1234");
      
     WebElement signup= driver.findElement(By.linkText("Sign Up"));
      signup.click();
      
      //press back button
      driver.navigate().back();
      
      //session ID
      
      String  session_id=driver.getWindowHandle();
      System.out.println(session_id);
      //Refresh the page
      driver.navigate().refresh();
      //Get page title
      
      String page_title=driver.getTitle();
      System.out.println(page_title);
      //Press forward button
      
      driver.navigate().forward();
      
      //close
      driver.close();
	}

}
