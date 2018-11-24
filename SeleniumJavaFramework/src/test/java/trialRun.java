import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trialRun {
	
	public static void main(String[] args) {
		BrowseChrome();
		
	}
	
	public static void BrowseChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://shaw.ca");
	System.out.println(driver.getPageSource().contains("value"));	
	System.out.println(driver.getTitle());;
	driver.close();
	
		
		
		
		
		
	}
	

}
