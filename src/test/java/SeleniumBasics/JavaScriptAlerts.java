package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		/*Handling a JSAlerts and retreiving the resulting text*/
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Alert alert1  = driver.switchTo().alert();
//		Thread.sleep(3000);
//		/*For Accepting an Alert*/
//	    alert1.accept();
//		if (driver.getPageSource().contains("You successfully clicked an alert")) {
//			System.out.println("It clicked on JS Alerts");
//			
//		}
//		System.out.println("==================================================");
//		
//		/*Handling a JS Confirmation alerts and retreiving the resulting text*/
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Alert alert2  = driver.switchTo().alert();
//		Thread.sleep(3000);
//		System.out.println(alert2.getText());
//		/*For Dismissing an Alert*/
//		alert2.dismiss();
//	    
//		if (driver.getPageSource().contains("You clicked: Cancel")) {
//			System.out.println("It clicked on JS confirmation alert");
//			
//		}
//		System.out.println("==================================================");
//		Thread.sleep(2000);*/
		
		/*Handling a JS Prompt alerts and Sending text inside that prompt alerts*/
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert3  = driver.switchTo().alert();
		
		System.out.println(alert3.getText());
		Thread.sleep(3000);
		/*For Sending text inside  an Alert*/
	    alert3.sendKeys("js prompt alert");
	   
	    alert3.accept();
	 
		if (driver.getPageSource().contains("You entered: js prompt alert")) {
			System.out.println("It clicked on JS prompt alert");
			
		}
		System.out.println("==================================================");

	}

}
