package TestPackage;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test2 {

	@Ignore
	@Test(priority = 1)
	public void signup() {
		System.out.println("signup");
	}

	@Test(priority = 1)
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 2)
	public void bookhotel() {
		System.out.println("Bookhotel");
	}

	@Test(priority = 3)
	public void printticket() {
		System.out.println("Printticket");
	}

	@Test(priority = 4)
	public void logout() {
		System.out.println("logout");
	}
}
