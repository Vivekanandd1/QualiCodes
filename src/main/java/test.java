import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("www.google.com");
		
		String Filename = "Homework2.png";
		String FilePath = "C:\\Users\\Admin\\Downloads\\";
		
//	    JavascriptExecutor js =(JavascriptExecutor) driver;
//	    
//	    js.executeScript("window.scrollBy(0,800)");
		
		driver.findElement(By.xpath("//a[normalize-space()='Homework2.png']")).click();
		
		Thread.sleep(5000);
	
	   System.out.println("Is file exist : " + isFilexist(FilePath+Filename));
	    
	    	
	}
	
	public static boolean isFilexist(String FilePath) {
		
		File fl = new File(FilePath);
		if(fl.exists()) {
			return true;
		}
		return false;
		
	}


}