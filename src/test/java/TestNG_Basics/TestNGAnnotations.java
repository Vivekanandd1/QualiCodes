package TestNG_Basics;

import org.testng.annotations.*;

public class TestNGAnnotations {
	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("This  is BeforeSuite");
	}
	
    @AfterSuite
	public void AfterSuite() {
		System.out.println("This  is AfterSuite, after all suite execution");
	}
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("This  is BeforeClass");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This  is AfterClass");
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This  is BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This  is AfterMethod");
	}

	@Test
	public void test() {
		System.out.println("This  is testmethod");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("This  is AfterTest");
	}
	
	
	@BeforeTest
	public void Beforetest() {
		System.out.println("This  is Beforetest");
	}

}
