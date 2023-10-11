package com.facebook_WebDriverInterface;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTitleAndURL {

	WebDriver driver;
	
	@BeforeTest
	
	public void initializeApplication() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void homePageTest() {
		
		//test messenger page
		String actualTitle="Facebook - log in or sign up";
		String expectedTitle=driver.getTitle();
		System.out.println("Expected home page title " +expectedTitle);
		
		// assert
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//URL test
		String actualURL="https://www.facebook.com/";
		String expectedURL=driver.getCurrentUrl();
		System.out.println("Expected home page URL : " +expectedURL);
		Assert.assertEquals(actualURL, expectedURL);
			
}
}
