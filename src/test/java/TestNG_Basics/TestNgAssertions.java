package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertions {
	
	
	@Test
	public void FBlogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("DDD" + Keys.ENTER);
		
		/*String ExpecetedTitle = "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpecetedTitle);
		
		System.out.println("Expectation is matching with reality");*/
		
		Boolean ActualTitle = driver.getTitle().isBlank();
//		System.out.println(ActualTitle);
		
		Assert.assertFalse(ActualTitle);
		
		
		
	}

}
