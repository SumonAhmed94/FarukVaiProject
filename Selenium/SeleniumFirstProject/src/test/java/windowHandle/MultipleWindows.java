package windowHandle;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
	WebDriver driver;

	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void parentAndChildWindow() {
		   driver.findElement(By.partialLinkText("Start free")).click();
		   System.out.println(driver.getTitle());
		  String parentWindow =driver.getWindowHandle();
		  //System.out.println("this is parent window>>>>> "+parentWindow);
			//System.out.println("this is parent  window>>>>> "+driver.getTitle());
			//System.out.println("this is parent window url >>>>> "+driver.getCurrentUrl());
			
		 Set<String> childWindows=driver.getWindowHandles();
		java.util.Iterator<String> windowIterator= childWindows.iterator();
		 
		 while (windowIterator.hasNext()) {
			String firstChildWindow = (String) windowIterator.next();
			driver.switchTo().window(firstChildWindow);
			//cursor is in first child widow
			System.out.println("******************child window #1******************");
			System.out.println("this is child window>>>>> "+driver.getTitle());
			System.out.println("this is child window url >>>>> "+driver.getCurrentUrl());
			//driver.close();
			System.out.println("******************parent window*******************");
			driver.switchTo().window(parentWindow);
			System.out.println("this is parent window>>>>> "+parentWindow);
			System.out.println("this is parent  window>>>>> "+driver.getTitle());
			System.out.println("this is parent window url >>>>> "+driver.getCurrentUrl());
			
		}
              
		//set tshirt={"red","blue","green"}
		
		
		//array tshirt [{red:3}, {blue:2},{green:1}]
	}
}

