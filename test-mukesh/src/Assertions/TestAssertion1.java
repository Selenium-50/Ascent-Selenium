package Assertions;


import org.junit.ComparisonFailure;
import org.testng.Assert;

public class TestAssertion1 {

	public static void main(String[] args) {

		try {
			Assert.assertEquals("Test", "Test1");
		} catch (AssertionError  e) {
			
		System.out.println(e.getMessage());
		}
		try {
			org.testng.Assert.assertEquals(12, 14);
		} catch (AssertionError e) {
		
			System.out.println(e.getMessage());
		}
	}

}
