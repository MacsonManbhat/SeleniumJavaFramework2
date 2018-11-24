import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class testWithTestNG {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;

	@BeforeTest
	public void PreTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		htmlReporter = new ExtentHtmlReporter("Octber24test.html");
		 extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        
	       test = extent.createTest("Mythirdtest", "This report will check testng and extent reports");
	       test.info("The test has started");
	       test.fail("This is the worst test of my life");
	       test.pass("The set up has run successfully" );
		
		
	}
	
	@Test
	public void DuringTest() {
		
		driver.get("http://youtube.com");
		test.pass("Navigated successfully to utube");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Vacation to Maldives");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("Sexy"));
		
		test.info("Looks like everyhting is running smoothly");
		
	
		
		
	}
	
	@AfterTest
	public void AfterTesti() {
		
		driver.close();
		driver.quit();
		System.out.println("This test is complete");
		test.pass("Alright looks good .... goto sleep");
		
	
		extent.flush();
		
		
	}
}
