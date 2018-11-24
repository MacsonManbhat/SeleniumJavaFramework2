import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testWithNG {

	WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public  void TestSetup() {

		if (browserName.equalsIgnoreCase("internet explorer")) {

			System.setProperty("webdriver.ie.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\SeleniumJavaFramework\\Drivers_AllBrowsers\\IE\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
					+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
					+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");

			 driver = new FirefoxDriver();

		}
	}

	@Test
	public  void Test1() {

		driver.get("http://ndtv.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource().contains("Internet"));


	}

	@AfterTest
	public  void TestComplete() {


		driver.close();
		System.out.println("Test Is Complete using the testng framework" + "Now check the stats");



	}

}
