package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChcekBoxBehaviour {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://the-internet.herokuapp.com/checkboxes");
			
			WebElement CheckBox1  = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
			 
			System.out.println(CheckBox1.isDisplayed());//true
			System.out.println(CheckBox1.isEnabled());//true
			System.out.println(CheckBox1.isSelected());//false
			
			CheckBox1.click();
			
			System.out.println("===================================");
			
			System.out.println(CheckBox1.isDisplayed());//true
			System.out.println(CheckBox1.isEnabled());//true
			System.out.println(CheckBox1.isSelected());//true
			
	}

}
