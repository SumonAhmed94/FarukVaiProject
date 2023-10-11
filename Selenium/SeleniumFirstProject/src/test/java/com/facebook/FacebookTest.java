package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
   WebDriver driver;// instance variable
   
   @Test
   public void openBrowser() {
	   WebDriver driver =new ChromeDriver();// Inheritance 
	   // How to open Browser
	   //WebDriver= DataType/Parent
	   //ChromeDriver=Child Class of WebDriver/Implementation Class
   }
   
   @Test
   public void openApplication() {
	   //how to open Application
	   WebDriver driver =new ChromeDriver();// Inheritance
	   driver.get("https://www.facebook.com/");
	   
   }
}
