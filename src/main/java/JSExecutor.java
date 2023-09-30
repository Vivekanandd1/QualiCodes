import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		
//		driver.get("https://www.google.com/");
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		
		/*Create a reference*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*Call the JavascriptExecutor method*/
//		js.executeScript("script", "argument");
		
		Thread.sleep(2000);
	    //1.Reload the page
//		js.executeScript("location.reload()","");
		
		//2. Sending text inside a textbox. : Way 1
		//js.executeScript("document.getElementById('APjFqb').value = 'selenium'");
	
		
		//2. Sending text inside a textbox. : Way 1
//		WebElement textbox = driver.findElement(By.name("q"));
//		js.executeScript("arguments[0].value='testuser'", textbox);
//		
//		String text = (String) js.executeScript("return arguments[0].value", textbox);  
//		System.out.println(text); 
		
		
		//Generate alert Pop-up
//		js.executeScript("alert('hello Vivek');");
		
		//3. scroll by pixel in vertical way
//		js.executeScript("window.scrollBy(0,400)");
		
		//4.clicking on an element
//		WebElement mobile = driver.findElement(By.xpath("(//div[normalize-space()='Forms'])[2]"));
//		js.executeScript("arguments[0].click();", mobile);
		
		//5. printing text in browser console
		
		js.executeScript("console.log('hi, whatsapp is using me')");
	}
		

}
