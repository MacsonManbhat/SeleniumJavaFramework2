package config2;

import org.testng.annotations.Test;

public class ngGroups {
	
	@Test (groups = "Sanity") 
	public void testBegin() {
		System.out.println("I am inside the Topmost method");

	}
	@Test (groups = {"Smoke", "Sanity"})
	public void Btestflow() {

		System.out.println("I am inside the middle method");
	}
	@Test (groups = "regression")
	public void Ctestsnack() {

		System.out.println("I am inside the third method");
	}

	@Test (groups = {"Smoke", "regression"}) 
	public void DtestEnd() {

		System.out.println("I am inside the bottom method");
	}

}
