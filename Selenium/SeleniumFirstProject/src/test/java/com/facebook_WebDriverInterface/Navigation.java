package com.facebook_WebDriverInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Navigation {

	WebDriver driver;
	
	@BeforeTest
	public void initializeApplication() {
		driver=new ChromeDriver(); // what is navigate method=
		driver.navigate().to("https://www.facebook.com/");
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	}
	@Test
	public void linkTest() {
	driver.findElement(By.linkText("Messenger")).click();
	driver.navigate().back(); //going back to previous page
	driver.navigate().forward();
	driver.navigate().refresh();
}
	
}
