package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebDriverFactory {
	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void start(@Optional ("firefox")  String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			break;

		case "firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			break;
		case "edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			break;
		default:
			System.out.println("you entered wrong keyword");
		}

	}

	@Test
	public void Fblanding() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Googlelanding() {
		driver.get("https://www.google.co.in/");
	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
