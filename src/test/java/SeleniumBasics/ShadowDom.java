package SeleniumBasics;

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
		
		/*Finding the shadow Host on Dom*/
		WebElement ShadowHost = driver.findElement(By.tagName("book-app"));
		/*Intialize the javascriptexcutor by typecasting driver object*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*with the help of jsexcutor we are finding shadowRoot by its selector and indicating the host. And than declaring whole 
		 * code syntax in WebElement*/
		WebElement ShadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('app-header');", ShadowHost);
		/*Drill down in shadow tree via shadow roots*/
		WebElement AppToolBar = ShadowRoot.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		/*Drill down in shadow tree via shadow roots*/
		WebElement BookinputDecorator = AppToolBar.findElement(By.tagName("book-input-decorator"));
		/*Element which we have to inteact in down of shadowdom hierarchy */
		BookinputDecorator.findElement(By.cssSelector("input#input")).sendKeys("ShadowDom Handing");		
		
		
	
		
}
	}