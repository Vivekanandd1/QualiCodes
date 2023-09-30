package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
	
	
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://the-internet.herokuapp.com/upload");
    
    /*Uploading Files with Sendkeys method*/
//    Thread.sleep(2000);
    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\Desktop\\TestFile.png");
    
    
//    Thread.sleep(2000);
//    driver.findElement(By.id("file-submit")).click();
    
    /*Uploading File with the Help of AutoIT*/
    Thread.sleep(2000);
//    
//    driver.findElement(By.id("drag-drop-upload")).click();
//    
//    Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\Upload.exe");
    
    
    /*Uploading File with the Help of Robot class*/
    
    WebElement Btn = driver.findElement(By.id("file-upload"));
    
    
    Actions act = new Actions(driver);
    
    
    try {
    	Btn.click();
    }
    catch (InvalidArgumentException e) {
		System.out.println("Found the Invalid argument exception");
	}
    finally {
    	act.click(Btn).build().perform();
    	System.out.println("Clicked with Action class");
	}
    
    StringSelection str = new StringSelection("C:\\Users\\Admin\\Desktop\\TestFile.png");
    
    /*Fetching the path from clipboard (Window shortcut : window + V)*/
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
    
    Robot rb = new Robot();
    
    Thread.sleep(3000);
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    
    Thread.sleep(2000);
    
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    Thread.sleep(2000);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    
    rb.keyPress(KeyEvent.VK_F5);
	rb.keyRelease(KeyEvent.VK_F5);
    
    driver.findElement(By.id("file-submit")).click();
 
    Thread.sleep(4000);
    
    driver.quit();
   

}
}