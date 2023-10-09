package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDriver {
	
	 public WebDriver driver;	
	
	@BeforeTest
	public void setup() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void Execution() throws Exception {
        driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testng"  + Keys.ENTER);
		Thread.sleep(3000);	
	}
	
	@AfterTest
	public void cleanup() {
		driver.quit();
	}
	

}
