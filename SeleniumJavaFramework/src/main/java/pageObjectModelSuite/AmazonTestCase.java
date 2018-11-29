package pageObjectModelSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase {
	
	static WebDriver driver;

	 public static void main(String[] args) {
		Amazon();
	}
	 
	 public static void Amazon()	{
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\git"
		 		+ "\\SeleniumJavaFramework2.9\\SeleniumJavaFramework"
		 		+ "\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 AmazonObjects web = new AmazonObjects(driver);
		 
		 driver.get("https://amazon.ca");
		 web.setTextForSearch("Fossil Watch");
		 web.clickForSearch();
		 
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getPageSource().contains("mens"));
		 
		 System.out.println(driver.getClass());
		 
		 driver.close();
		 
		 System.out.println(" The Test is complete"  );
	 }
}
