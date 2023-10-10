import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	
	
    @Test
	public void DriverLaunch() throws InterruptedException, AWTException, IOException , SocketException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("TestNG"+Keys.ENTER);
		String Expected = "TestNG - Google Search";
		Boolean Actual = driver.getTitle().isBlank();
		String BB = null;
//		Assert.assertEquals(Actual, Expected);
//		Assert.assertFalse(Actual);
		Assert.assertNotNull(BB);
		Thread.sleep(3000);
		driver.quit();
    }
	
//	@Test
//	public void quitup() throws Exception {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("email")).sendKeys("TestNG"+Keys.ENTER);
//		Thread.sleep(3000);
//		driver.quit();
//	}


}