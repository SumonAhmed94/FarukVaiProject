package com.QAeLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyProject {

	WebDriver driver; // Creating Variable (Instance)
	@BeforeTest
	public void openBrowser() {
		WebDriver driver= new ChromeDriver();// Inheritance
	    driver.get("https://www.qaelearn.com/"); // WebDriver is a DataType
	    driver.navigate().to("https://www.qaelearn.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(01, 01));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	   String actualTitle= "QAeLearn.com - Student Portal";
	   String expectedTitle= driver.getTitle();
	   System.out.println("expected homepage title" + expectedTitle);
	   String actualUrl= "https://www.qaelearn.com/";
	   String expectedUrl=driver.getCurrentUrl();
	   System.out.println("expected homepage Url" + expectedUrl);
	   
	}
	@Test
	public void openApplication() {
	driver.findElement(By.linkText("email")).click();
    driver.navigate().forward();
    driver.navigate().refresh();
    driver.navigate().back();
    
	}
}

