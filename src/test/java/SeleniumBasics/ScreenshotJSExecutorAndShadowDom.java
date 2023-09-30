package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotJSExecutorAndShadowDom {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		/*The object is taking screenshot and storing in virtual memory*/
//		File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		/*From the File object we are storing it in local storage*/
//		FileUtils.copyFile(ts, new File("./fullpage.png"));
		
//		WebElement HomeIcon = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		
//		File Iconimage = HomeIcon.getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(Iconimage, new File("./IconImages.png"));
		
		WebElement Sectionpart = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File Sectionimage = Sectionpart.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Sectionimage, new File("./Sectionimage.png"));
	
		
		
		
		
	}
	
	

}
