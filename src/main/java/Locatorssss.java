import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locatorssss {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.get("https://demoqa.com/automation-practice-form");
		driver.get("https://trytestingthis.netlify.app/");
		
		
//		driver.findElement(By.name("q")).sendKeys("selenium locator",Keys.ENTER);
		
	
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='owc']/option"));
		int count = options.size();
		System.out.println(count);
		
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());		
//			
//		}
		
		for(WebElement element:options) {
			if(element.getText().equalsIgnoreCase("Option 2")) {
			System.out.println(element.getText());
			System.out.println("here is the choosen one");
		}
			}
		
//		WebElement lname = driver.findElement(By.id("lname"));
//		
//		driver.findElement(RelativeLocator.with(By.tagName("input")).above(lname)).sendKeys("testHardia");
		
//		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		
//		driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		
//		int slider = driver.findElements(By.className("homeslider-container")).size();
//		
//		System.out.println(slider);
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		
//		for (WebElement element:links) {
//			System.out.println(element.getText());
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input.form-control[id=name]")).sendKeys("vivek");
		
//			driver.findElement(By.cssSelector("input[id=lname]")).sendKeys("Deshmukh");
//		driver.findElement(By.cssSelector("input.mr-sm-2 form-control[placeholder=Mobile Number]")).sendKeys("8190772504");
		


	}


}
