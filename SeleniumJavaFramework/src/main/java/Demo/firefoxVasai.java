package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class firefoxVasai {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\git\\SeleniumJavaFramework2.9\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://Vasai.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("The page Vasai.com is working on firefox latest version browser");
		driver.close();
	}

}
