package TestNG_Basics;

import org.testng.annotations.Test;

public class TestNGFile {
	
	
	@Test
	public void execute() {
		System.out.println("Sample Text");
	}
	
	@Test
	public void Asetup() {
		System.out.println("TestNg Setup");
	}

	@Test
	public void Beta() {
		System.out.println("Order of execution should be second");
	}
}
