package Listeners;

import org.testng.annotations.Test;

public class failedTestsRetry {

	@Test (priority = 5)
	public void Junction()	{

		System.out.println("This satement is from the Junction method");


	}
	@Test (retryAnalyzer = config2.retryOfFailedcasesAnalyser.class) 
	public void Junc()	{


		int olkk = 12;
		int jack = 1/0/0;
		System.out.println("This satement is from the middle method");
	}

	@Test (priority = 2)
	public void Loops()	{

		System.out.println("This satement is from the loops method");
	}


}
