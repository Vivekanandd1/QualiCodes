package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
		Thread.sleep(2000);	
	}
	
	@Test
	public void select() throws Exception {
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);	
	}

	
	@AfterTest
	public void cleanup() {
		driver.quit();
	}
	

}
