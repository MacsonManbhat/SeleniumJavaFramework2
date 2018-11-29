package pageObjectModelSuite;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModelSuite.searchObjectsGoogle;

public class TestCase12 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\git\\SeleniumJavaFramework2.9\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		searchObjectsGoogle.SearchTextBox(driver).sendKeys("Man");
		
		//searchObjectsGoogle.SearchButon(driver).sendKeys(Keys.RETURN);
		// above line the return key is not working hence add the below click function to get this resolved.
		
		searchObjectsGoogle.SearchButon(driver).click();
		
		driver.close();
		
		System.out.println("The test is over Man@");
		
		
	}

}
