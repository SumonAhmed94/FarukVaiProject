package com.facebook_Locators;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElements {
WebDriver driver;// Instance Variable

@BeforeMethod

 public void openApp() {	
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
public void findElementsByForLoop() {
	WebElement grandpa = driver.findElement(By.id("pageFooterChildren"));//WebElement-DataType, Grandpa-Variable, Operator =, value=driver.....
	WebElement parent=grandpa.findElement(By.tagName("ul"));
	List<WebElement> child= parent.findElements(By.tagName("li"));// List{Webelement} -Plural/MoreThan one Elements
	int totalChilds = child.size();
	System.out.println("Total links" +totalChilds);// 
	int actualSize= 31;
	Assert.assertEquals(totalChilds, actualSize);
	
	//print all the links
for (int i = 0; i < totalChilds; i++) {
	//System.out.println(i);
System.out.println(i+ " link is "+child.get(i).getText());

}
//test the links
for (int i = 0; i < totalChilds; i++) {
	if (child.get(i).getText().equalsIgnoreCase("Games")) {
	child.get(i).click();
	}
	
}
//Assertion
for (int i = 0; i < totalChilds; i++) {
	if (child.get(i).getText().equalsIgnoreCase("Games")) {
		boolean expectedLinkText= child.get(i).getText().equalsIgnoreCase("Games");
		Assert.assertTrue(expectedLinkText);
	child.get(i).click();
	
}
}
}
}
