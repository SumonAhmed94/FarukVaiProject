package com.QAeLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTitleAndUrl {
	WebDriver driver;
	@BeforeTest
public void openApplication() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void homeTest() {
		String actualTitle="Facebook - log in or sign up";
		String expectedTitle=driver.getTitle();
		System.out.println("expected homepage title" +expectedTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
}
