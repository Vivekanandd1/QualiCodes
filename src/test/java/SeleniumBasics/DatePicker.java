package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		
		String Date = "28";
		String Month = "October";
		String Year = "2023";
		
		driver.findElement(By.id("datepicker1")).click();
		
		String currentMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//div[@class='ui-datepicker-title']/span[1]")).getText();
		String currentYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//div[@class='ui-datepicker-title']/span[2]")).getText();
         
		if(currentMonth.equalsIgnoreCase(Month)&& currentYear.equalsIgnoreCase(Year)) {
			List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody//td"));
		  for(WebElement onedate : dates) {
			  if(onedate.getText().equalsIgnoreCase(Date)) {
				  onedate.click();
				  break;
			  }
				
			}
			
	
		  }
		  
		  
		}
	}


