package com.facebook_WebDriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	/*open chrome
	 * open facebook
	 * enter user name
	 * enter password
	 * click login button
	 */
	
	WebDriver driver; 
	
	@BeforeTest
public void OpenApplication() {
		
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
}
	
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("sumn1234@hmail.com");
		driver.findElement(By.id("pass")).sendKeys("sumn1234");
		driver.findElement(By.name("login")).click();
		
		
	}
	//@AfterTest
	//public void closeApplication() {
		//driver.quit();
	}
	

