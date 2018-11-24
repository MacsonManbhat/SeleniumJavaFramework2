import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportsDemoWithTestNG {
	
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	
	
	//@BeforeTest if only one test is there use test annotation
	@BeforeSuite
	public void TestSetUp() {
		 // start reporters
        htmlReporter = new ExtentHtmlReporter("extentded.html");
    
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

		
	}
	
	@Test
	public void TestRun() throws Exception {
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
      
		
		
	}
	
	@Test
	public void TestRun2() throws Exception {
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
      
		
		
	}
	
	//@AfterTest if only one test is there use test annotation
	@AfterSuite
	
	public void TestTearDown() {
		  // calling flush writes everything to the log file
        extent.flush();
		
		
	}

}
