package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://trytestingthis.netlify.app/");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
//			WebElement option = driver.findElement(By.id("option"));
			
//			WebElement option = driver.findElement(By.id("owc"));
//			
			js.executeScript("window.scrollBy(0,1500)");
//			
//			Select select = new Select(option);
//			Thread.sleep(2000);
//			select.selectByIndex(1);
//			Thread.sleep(2000);
//			select.selectByValue("option 2");
//			Thread.sleep(2000);
//			select.selectByVisibleText("Option 3");
//			Thread.sleep(2000);
//			select.deselectAll();
			
	   List<WebElement> TableHeaders =	driver.findElements(By.xpath("//tbody/tr[1]/th"));
	   
	   for(WebElement header :TableHeaders) {
		   if(header.getText().contentEquals("Firstname"))
		   System.out.println(header.getText());
	   }
	  
			
			
			Thread.sleep(3000);
			
			driver.quit();
			

	}

}
