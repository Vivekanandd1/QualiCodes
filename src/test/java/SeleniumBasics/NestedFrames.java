package SeleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement ParentFrame = driver.findElement(By.id("frame1"));
		
		//driver.switchTo().frame(ParentFrame);
		
		String frame1text = driver.findElement(By.xpath("//body[normalize-space()='Parent frame']")).getText();
		
		System.out.println(frame1text);
		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		
        String frame2text = driver.findElement(By.xpath("//body[normalize-space()='Child Iframe']")).getText();
		
		System.out.println(frame2text);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Elements']")).click();
		
	
	}

}
