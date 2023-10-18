package TestNG_Basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameters {
	@Parameters({ "a", "b" })
	@Test
	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println("the sume of a and b is : " + sum);
	}

	@Parameters({ "a", "b" })
	@Test
	public void multiply(int a, int b) {
		int multiply = a * b;
		System.out.println("the multiplication of a and b is : " + multiply);
	}
}
