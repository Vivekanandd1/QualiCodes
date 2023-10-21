package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.google.com/");
			
			Thread.sleep(3000);
			
//			driver.findElement(By.id("APjFqb")).sendKeys("selenium" + Keys.ENTER);
			
			WebElement fd = driver.findElement(By.id("APjFqb"));
//			fd.sendKeys(name);
			
			Actions Act = new Actions(driver);
			Thread.sleep(3000);
//			Act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
			
			Act.keyDown(Keys.SHIFT).sendKeys(fd,"selenium ").keyUp(Keys.SHIFT).sendKeys("selenium" + Keys.ENTER).build().perform();
			
			Thread.sleep(3000);
			
			Robot dc = new Robot();
			dc.keyPress(KeyEvent.VK_F5);
			dc.keyRelease(KeyEvent.VK_F5);
			
	}
	
}
