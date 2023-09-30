package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutors {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		/*To refresh a Page*/
//		js.executeScript("location.reload()", "");
		
		
		/*1st way to send the data in textbox*/
//		js.executeScript("document.getElementById('small-searchterms').value='test';");

		/*2nd  way to send the data in textbox*/
//		WebElement searchbox = driver.findElement(By.name("q"));
//		js.executeScript("arguments[0].value='test2'", searchbox);
		
		/*Scrolling winodow in vertical manner with the pixel values*/
//		js.executeScript("window.scrollBy(0,900)");
		
		/*Clicking on WebElement*/
		WebElement searcBTN = driver.findElement(By.xpath("//button[@type='submit']"));
		
		js.executeScript("arguments[0].click();", searcBTN);
		
//		js.executeScript("console.log('hello guys')");
//		
//		String gg = (String) js.executeScript("return document.title;","" );
//		System.out.println(gg);
		
	}

}
