package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingElementInListofElemnts {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("http://www.automationpractice.pl/index.php?");
			
			List<WebElement> shopmenu = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));

			System.out.println(" The items are : "+shopmenu.size());
			
			Thread.sleep(2000);
			
			for(WebElement ee : shopmenu ) {
				try {
				if(ee.getText().equalsIgnoreCase("Dresses")) {
					ee.click();
					System.out.println(driver.getTitle());
				}}
				catch (StaleElementReferenceException e) {
					// TODO: handle exception
				}
			}
			
	}

}
