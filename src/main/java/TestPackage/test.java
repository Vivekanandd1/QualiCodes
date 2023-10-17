package TestPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;
	
	@Parameters ("browser")
	@BeforeTest
	public void quitup(@Optional("edge") String browser) throws Exception {
		
	switch (browser) {
	case "chrome" :
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		break;
	case "edge" :
        driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		break;	
		
		}
		}
	
	@Test
	public void landup() throws Exception {
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("DDD" +Keys.ENTER);
		Thread.sleep(3000);
		
//		Thread.sleep(3000);
		String actualtext = driver.findElement(By.name("email")).getAttribute("value");
		System.out.println(actualtext);
//		System.out.println("this is from driver "+ actualtext );
		String Expectedtest = "";
//		Boolean Title = driver.getTitle().isBlank();
//		Assert.assertEquals(actualtext, Expectedtest);
		Assert.assertNotNull(actualtext);
//		Assert.assertFalse(Title);

	}
	
	@Test
	public void GoogleLand() throws InterruptedException {
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("DDD" +Keys.ENTER);
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void teardown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}


}