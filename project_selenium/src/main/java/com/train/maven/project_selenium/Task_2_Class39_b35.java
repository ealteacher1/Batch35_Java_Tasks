package com.train.maven.project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_2_Class39_b35 {
  static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\project_selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		//verify the current url and page title 
		String expected_url=("https://www.facebook.com/");
		String current_url=driver.getCurrentUrl();
		if(expected_url.equals(current_url)) {
			System.out.println("url id true");
		}
		else {
			System.out.println("url is false");
		}
		
		
		//page title
		String expected_pageTitle=("https://www.facebook.com/");
		String current_title=driver.getTitle();
		System.out.println("page title is true");
		
		
		
		WebElement create_acc=   driver.findElement(By.id("u_0_0_Vy"));
		create_acc.click();
		
		WebElement first_name=driver.findElement(By.xpath("//input[@ type='text' and @ id='u_0_8_zT']"));
		first_name.click();
		first_name.sendKeys("samira");  
		
		
		WebElement last_name=driver.findElement(By.cssSelector("#u_0_8_j1"));
		last_name.click();
		last_name.sendKeys("medj");
		
		
		WebElement all_month=driver.findElement(By.name("birthday_month"));
		Select month=new Select(all_month);
		month.selectByIndex(1);
		
	WebElement all_day=	driver.findElement(By.name("birthday_day"));
		Select day=new Select(all_day);
		day.selectByValue("2");
		WebElement all_year=  driver.findElement(By.name("birthday_year"));
		Select year=new Select(all_year);
		year.selectByVisibleText("2");
		
	WebElement gender=	driver.findElement(By.name("name"));
		gender.click();
		
		
	WebElement custom=	driver.findElement(By.name("sex"));
		custom.click();
		
	WebElement email=	driver.findElement(By.className("sex"));
		email.click();
		email.sendKeys("sami@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.click();
		pass.sendKeys("abc123");
		
		
		
	WebElement signup=	driver.findElement(By.xpath("//button[@id='u_0_n_n9']"));
		signup.click();
		
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		
		
		
		
		
		//get session_id
		String session_id=driver.getWindowHandle();
		System.out.println(session_id);
		
		
		driver.navigate().refresh();
		
		
		
		
		
		
	}

}
