package windowHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CloseAndQuit {
	WebDriver driver;

	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void close() {
   //driver.findElement(By.linkText("Start free trial")).click();
   driver.findElement(By.partialLinkText("Start free")).click();
   driver.close();
    }
	
	@Test
	public void quit() {
   //driver.findElement(By.linkText("Start free trial")).click();
   driver.findElement(By.partialLinkText("Start free")).click();
   driver.quit();
    }
	
}

