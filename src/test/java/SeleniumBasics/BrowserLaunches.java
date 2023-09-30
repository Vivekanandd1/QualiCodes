package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunches {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = WebDriverManager.chromedriver().create();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
		
		driver.switchTo().frame(frame);
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Alert")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		String originalwindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://www.google.co.in/");
		
		
		driver.switchTo().window(originalwindow);
		
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		
		System.out.println(height);
		System.out.println(width);
		
		driver.manage().window().fullscreen();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
          
		String WebTitle = driver.getTitle();
		System.out.println(WebTitle);
//		
		String CurrntURL =  driver.getCurrentUrl();
        System.out.println(CurrntURL);		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
