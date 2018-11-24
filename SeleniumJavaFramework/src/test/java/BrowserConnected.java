import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserConnected {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\SeleniumJavaFramework\\"
				+ "Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://cricinfo.com");
		Boolean AreWordsPresent = driver.getPageSource().contains("Indiess" ) || driver.getPageSource().contains("Jaipur");
		System.out.println("The test of the mentioned words is " + AreWordsPresent);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
				
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\"
				+ "IE\\IEDriverServer.exe ");
		
		 driver = new InternetExplorerDriver();
		
		driver.get("http://ndtv.com");
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource().contains("#metoo"));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
	}

}
