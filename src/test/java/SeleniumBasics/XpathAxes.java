package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.automationpractice.pl/index.php?");
	
	/* Xpath Axes with SELF keyword*/
	String logintext = driver.findElement(By.xpath("//*[@class='login']/self::a")).getText();
	System.out.println(logintext);
	
	/* Xpath Axes with Parent keyword*/
	String Parenettext = driver.findElement(By.xpath("//a[@title='Contact us']/parent::div")).getText();
	System.out.println(Parenettext);
	
	/* Xpath Axes with Ancestor keyword*/
	String Ancestortext = driver.findElement(By.xpath("//a[@class='login']/ancestor::nav")).getText();
	System.out.println(Ancestortext);
	
	/* Xpath Axes with Following-sibling keyword*/
	String FollowingSiblingtext = driver.findElement(By.xpath("//div[@id='contact-link']/following-sibling::span")).getText();
	System.out.println(FollowingSiblingtext);
	
	/* Xpath Axes with preceding-sibling keyword*/
	String PrecedingSiblingtext = driver.findElement(By.xpath("//div[@id='contact-link']/preceding-sibling::div")).getText();
	System.out.println(PrecedingSiblingtext);
	
	/* Xpath Axes with child keyword*/
	String Childtext = driver.findElement(By.xpath("//div[@id='contact-link']/child::a")).getText();
	System.out.println(Childtext);
	
	/* Xpath Axes with child keyword*/
	String DescendantText = driver.findElement(By.xpath("//ul[@class='toggle-footer']/descendant::a")).getText();
	System.out.println(DescendantText);
	
	List<WebElement> Links = driver.findElements(By.xpath("//ul[@class='toggle-footer']/descendant::a"));
	
	for(WebElement ele : Links) {
		System.out.println(ele.getText());
	}
		
	}
	}