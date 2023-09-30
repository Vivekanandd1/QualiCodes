package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		WebElement btn = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
		boolean bb = btn.isDisplayed();
		
		System.out.println(bb);
		
		btn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
//		
//		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).
//				withTimeout(Duration.ofSeconds(15)).
//				pollingEvery(Duration.ofSeconds(2)).
//				ignoring(NoSuchElementException.class);
		
		WebElement WebdriverText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		
//		 = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		Boolean Status = WebdriverText.isDisplayed();
		
		if (Status) {
			System.out.println("text is displayed by both waits");
		}

	}

}
