import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			driver.get("https://trytestingthis.netlify.app/");
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,800)");
			
			WebElement options  = driver.findElement(By.id("owc"));
			
			
			Select select = new Select(options);
	
			Thread.sleep(3000);
			select.selectByIndex(1);
			Thread.sleep(3000);
			select.selectByValue("option 2");
			Thread.sleep(3000);
			select.selectByVisibleText("Option 3");
			Thread.sleep(3000);
			select.deselectByVisibleText("Option 3");
			Thread.sleep(3000);
			select.deselectAll();
			Thread.sleep(3000);
			
			
//			List<WebElement> alloptions = select.getOptions();
////			List<WebElement> alloptions = driver.findElements(By.xpath("//select[@id='owc']"));
//			Thread.sleep(3000);
//			for(WebElement option : alloptions) {
//			     System.out.println(option.getText());
//				if(option.getText().equalsIgnoreCase("Option 2")) 
//				option.click();
//			}
			
			
			
			Thread.sleep(3000);
			driver.close();
	}
	}
