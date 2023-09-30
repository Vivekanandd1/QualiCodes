package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
//			WebElement rightLink = driver.findElement(By.xpath("//a[text()='Vertical Scroll']"));
//			WebElement BoxA = driver.findElement(By.xpath("//li[@name='A']"));
//			WebElement BoxC = driver.findElement(By.xpath("//li[@name='C']"));
			
			WebElement outerbox = driver.findElement(By.id("draggable"));
			WebElement Biggerbox = driver.findElement(By.id("droppable"));
			Actions act = new Actions(driver);
			/*Mouser will hover over this element*/
//			act.moveToElement(rightLink);
			/*Clicking right on webElement*/
//			act.contextClick();
			/*Performing Double click*/
//			act.doubleClick();
			js.executeScript("window.scrollBy(0,400)");
			/*Click and hold and element and placing it on diffrent element*/
//			act.moveToElement(BoxA);
//			act.clickAndHold();
//			act.clickAndHold(BoxC);
			Thread.sleep(3000);
			/*Drag and Drop one element into another*/
			act.dragAndDrop(outerbox, Biggerbox).build().perform();
			
			
//			act.build().perform();
//			Thread.sleep(3000);
//			act.release().perform();
			
			Thread.sleep(3000);
			driver.quit();
	}

}
