package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	@AfterTest
	public void day2() {
		System.out.println("i will execute at last");
	}

	@Test
	public void testNG() {
		System.out.println("hello");
	}

}
