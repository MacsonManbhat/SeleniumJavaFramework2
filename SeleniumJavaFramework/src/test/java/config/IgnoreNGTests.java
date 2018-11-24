package config;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreNGTests {
	@Test (dependsOnMethods = {"makeIndia"})
	public void make() {
		System.out.println("This is from the topmost method");

	}
	
	@Test 
	public void makeIndia() {

		System.out.println("This is from the middle method");
	}
	
@Ignore
	@Test
	public void makeIn() {
		System.out.println("This is from the bottom method");

	}
	@Test
	public void makefo() {

		System.out.println("This is from the new method");
	}

}
