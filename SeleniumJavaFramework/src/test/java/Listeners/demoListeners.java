package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class demoListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The test Started " + result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The test is succesfull" + result);
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The Test has failed " + result);
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The Test has been skipped" + result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The test has known qualities" + result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(" This test has context" + context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(" The test has finished" + context);
	}

}
