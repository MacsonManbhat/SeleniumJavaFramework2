package config2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class variousBrowserTest {
	static WebDriver driver = null;
	String hp = null;
	@Parameters ("browserName")

	@BeforeTest
	public void testSetup(String browserName)	{

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
					+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
					+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
					+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		System.out.println("The set up has completed succesffuly");
		System.out.println("The Browser being used is " + browserName);
	}

	@Test
	public void testExecution()	{

		driver.get("http://apple.ca");
		driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();
		driver.findElement(By.xpath("//p[@class='icon icon-after icon-playcircle typography-intro-elevated']")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@value='Pause']")).click();

		System.out.println("The Execution has completed");

	}

	@AfterTest
	public void testEnd()	{

		driver.close();
		System.out.println("The Test is over buddy");
	}

}
