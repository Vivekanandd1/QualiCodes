package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocators {
	public static void main(String[] args) throws InterruptedException {
//	

		
//		driver.findElement(By.id("search_query_top")).sendKeys("test");
//		
//		List<WebElement> slider = driver.findElements(By.className("homeslider-container"));
//		
//		System.out.println(slider.size());
		
//		driver.findElement(By.name("search_query")).sendKeys("CorrectData");
		Thread.sleep(3000);
		
//		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		
//		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
//		List<WebElement> Pagelink = driver.findElements(By.tagName("a"));
//		System.out.println(Pagelink.size());
//		
//		for (WebElement element:Pagelink) {
//			System.out.println(element.getText());
//		}
		
		/*Cssselector with id and cobination of id and tag*/
//		driver.findElement(By.cssSelector("#search_query_top")).sendKeys("cssselector");
//		
//		driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("tagwith");
		
		
		/*Cssselector with class and cobination of class and tag*/
//		driver.findElement(By.cssSelector(".search_query")).sendKeys("Class1");
//		
//		driver.findElement(By.cssSelector("input.search_query")).sendKeys("withtag");
		
		/*Cssselector with attribute with value and cobination of tag and attribute with value*/
		
//		driver.findElement(By.cssSelector("[id=search_query_top]")).sendKeys("atributeValue");
//		
//		driver.findElement(By.cssSelector("input[id=search_query_top]")).sendKeys("withTags");
//		
//		/*Cssselector with tag, class ,attribute with value*/
//		
//		driver.findElement(By.cssSelector("input.search_query[name=search_query]")).sendKeys("lastoneincssselector");
		
		System.out.println("Hello world");
		
		
		
	}

}
