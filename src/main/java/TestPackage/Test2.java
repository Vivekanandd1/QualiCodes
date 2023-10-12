package TestPackage;
import java.time.Duration;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test2 {
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	
	public void launch(String browser ) {
		
		switch (browser) {
		case "chrome":
            driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			driver.get("https://trytestingthis.netlify.app/");
//			String Expectedurl1 = "https://trytestingthis.netlify.app/rr";
//			String ActualUrl1 = driver.getCurrentUrl();
//			Assert.assertEquals(ActualUrl1, Expectedurl1);
			break;
		case "firefox":
            driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			driver.get("https://trytestingthis.netlify.app/");
			break;
			
		case "edge":
            driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			driver.get("https://trytestingthis.netlify.app/");
			break;

		default:
//			String Expectedurl = "https://trytestingthis.netlify.app/rr";
//			String ActualUrl = driver.getCurrentUrl();
			System.out.println("browser name is incorrect");
//			Assert.assertEquals(ActualUrl, Expectedurl);
			break;
		}
		
			
			
			
	}
	}
