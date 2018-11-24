import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ngPriority {
	
	@Test (priority = 5)
	public void cricinfo() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://cricinfo.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//section[contains(@class,'col-one')]"
				+ "//a[contains(@name,'&lpos=cricket:keyseries:11:worldcup')]//span[contains(@class,'quicklinks_list__name')][contains(text(),'World Cup')]")).click();
		
		driver.close();
		System.out.println(" I am from cricinfo test ");
		System.out.println("---------------------------------- ");
	
		

	}
	@Test (priority = 2)
	public void cribuzz() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://cricbuzz.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.className("cb-mdl-hdr")).click();
		
		driver.close();
		System.out.println(" I am from cricbuzz test ");
		System.out.println("---------------------------------- ");
	}
	
	@Test (priority = 1)
	public void ndtv() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\"
				+ "eclipse-workspace\\SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://ndtv.com");
		System.out.println(driver.getPageSource().contains("BJP"));
		
		driver.findElement(By.xpath("//a[contains(text(),'\"Need Gun Control, Not Prayers\": Mother Of Califor')] ")).click();
		driver.close();
		System.out.println(" I am from ndtv test ");
		System.out.println("---------------------------------- ");
	}
	@Test (priority = 4)
	public void apple() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\"
				+ "eclipse-workspace\\SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://apple.ca");
		System.out.println(driver.getClass());
		
		driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']\r\n")).click();
		
		driver.close();
		System.out.println(" I am from apple test ");
		System.out.println("---------------------------------- ");

	}
}
