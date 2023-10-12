package TestPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	
	
	@Test
	public void quitup() throws Exception {
		
		
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("DDD" +Keys.ENTER);
		Thread.sleep(3000);
		
//		Thread.sleep(3000);
//		String actualtext = driver.findElement(By.name("email")).getAttribute("value");
//		System.out.println("this is from driver "+ actualtext );
//		String Expectedtest = "Email address or phone number";
		Boolean Title = driver.getTitle().isBlank();
//		Assert.assertEquals(actualtext, Expectedtest);
//		Assert.assertNotNull(actualtext,Expectedtest);
		Assert.assertFalse(Title);
		driver.quit();
	}


}