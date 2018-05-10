package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGStartUp {
	
	@Test
	public void testNG() {
		System.out.println("this is startup");
	}
	
	@BeforeTest
	public void day1() {
		System.out.println("i will execute first");
	}


}
