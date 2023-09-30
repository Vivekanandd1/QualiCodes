import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		WebElement Host = driver.findElement(By.tagName("book-app"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('app-header');", Host);
	
		WebElement AppToolBar = shadowRoot.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		
		WebElement Bookinput = AppToolBar.findElement(By.tagName("book-input-decorator"));
		
		Bookinput.findElement(By.cssSelector("input#input")).sendKeys("Test");
	}

}
