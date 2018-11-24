import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {
	
	public static void main(String[] args) {
	
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		// initialize ExtentReports and attach the HtmlReporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		// creating tests
		ExtentTest test = extent.createTest("MyFirstTestWithExtentReporter");
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\SeleniumJavaFramework\\"
				+ "Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		test.info("Startting this test. Are you guys ready for this ");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://hughesnet.com");
		test.pass("Navigated Successfully to my former employers webpage");
		
		System.out.println(driver.getTitle());
		test.pass("Ok Ok everyone this is just basically adding logs for each test case in html format");
		test.pass("Bte..  Title was printed successfully");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		test.info("The test has finished");
		
		extent.flush();
		
		
		

	}

}
