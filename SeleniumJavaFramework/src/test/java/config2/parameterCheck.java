package config2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterCheck {
@Parameters ("name")
	@Test
	public void onePlus(@Optional ("Macson") String name) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\git\\SeleniumJavaFramework2.9\\SeleniumJavaFramework\\"
				+ "Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.oneplus.com");
		//driver.findElement(By.className("buy-btn one-button btn-red text-sm one-button btn-red frozen")).click();
		driver.close();
		System.out.println(name);
		
	}
}
