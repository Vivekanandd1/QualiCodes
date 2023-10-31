package TestNG_Basics;
import org.testng.annotations.*;

public class TestNGPriorities {
	
	@Test (priority = 1)
	public void Login() {
		System.out.println("Login");
	}
	
	@Test (priority = 2)
	public void HomePage() {
		System.out.println("Homepage");
	}
	
	
    @Test (priority = 3)
	public void TicketBooking() {
		System.out.println("TicketBooking");
	}
	@Test (priority = 4)
	public void PrintTicket() {
		System.out.println("PrintTicket");
	}
	
	@Test (priority = 5)
	public void LogOut() {
		System.out.println("LogOut");
	}
	
	
}
