package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestClass {
	
	public WebDriver driver;
	
	@Test (priority = 0)
	public void GoogleLaunch() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Testng"  + Keys.ENTER);
	    Thread.sleep(2000);	
	    
	    driver.quit();		
		
	}
	@Test (priority = 2)
	public void Facebook() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("Testng"  + Keys.ENTER);
	    Thread.sleep(2000);	
	    
	    driver.quit();			
	}
	
	@Test (priority = 1)
	public void Django() {
		System.out.println("DJngo from python");
	}



}
