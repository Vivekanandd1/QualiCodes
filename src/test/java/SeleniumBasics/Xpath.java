package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args)   {
		
		/* Absolute or Full Xpath
		/html/body/div/div/div/header/div/div/div/div/a/img */
		
		/* Relative or Partial Xpath
		 * //img[@alt='My Shop']
		*/
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php?");
		
		/*Xpath with attributes containing approach*/
		
		driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).sendKeys("text1");
		
		driver.findElement(By.xpath("//*[contains(@id,'search_query_top')]")).sendKeys("Test2");
		
		/*Xpath with text containing approach*/
		
		String SiginText = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).getText();
		System.out.println(SiginText);
		
		String normtext = driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).getText();
		System.out.println("it coming from normlize space " + normtext);
		
		/*Xpath with starts-with approach*/
		
		driver.findElement(By.xpath("//input[starts-with(@name,'search_query')]")).sendKeys("Startwith");
		
		/*Xpath with OR approach*/
		
		driver.findElement(By.xpath("//input[@id='search_query_top' or @name='wrong']")).sendKeys("ORstatement");
		
		/*Xpath with AND approach*/
		
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("bothconditionshouldtrue");
		
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='somethingwrong']")).sendKeys("notgonnaexecute");
		
	}

}
