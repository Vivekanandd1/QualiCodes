package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage {
	
	@Test (dataProvider = "Credentials")
	public void Login(String UserName, String Password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();;
	}
     
	@DataProvider (name="Credentials")
	public Object[][] LoginCred() {
		
		Object[][] data = new Object [4][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="Admin2";
		data[1][1]="admin223";
		data[2][0]="Admin3";
		data[2][1]="admin323";
		data[3][0]="Admin4";
		data[3][1]="admin423";
		
		return data;
		
	}
}
