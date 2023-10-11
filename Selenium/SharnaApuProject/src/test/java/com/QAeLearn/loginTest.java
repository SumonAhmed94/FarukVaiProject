package com.QAeLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest {

	
	WebDriver driver;
	@BeforeTest
public void openApplication() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void logintTest() {
	driver.findElement(By.id("email")).sendKeys("sumn1234@hmail.com");
	driver.findElement(By.id("pass")).sendKeys("sumn1234");
	driver.manage().window().maximize();
	driver.findElement(By.name("login")).click();
}

}
