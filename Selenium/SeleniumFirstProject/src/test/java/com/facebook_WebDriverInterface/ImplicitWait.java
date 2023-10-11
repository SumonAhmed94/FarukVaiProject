package com.facebook_WebDriverInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitWait {
WebDriver driver;

@BeforeTest

public void InitializeApplication() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
@Test
public void loginTest() {
	driver.findElement(By.id("email")).sendKeys("sun1234@hmail.com");
	driver.findElement(By.id("pass")).sendKeys("sum234");
	driver.findElement(By.name("login")).click();
	
}
}
