package config2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class impExpWaits {
	WebDriver driver;
	
	

	@BeforeTest
	public void first() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe ");

		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// default polling time is 250 milliseconds (for Interview)
		System.out.println("The browser is set to be Chrome");
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.DAYS);

	}

	@Test
	public void second() {
		

		driver.get("http://vasai.com");
		System.out.println("Navigated successfully to Vasai.com");
		
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[contains(text(),'For More Jobs click here....')]")));
		System.out.println(element);
		
		driver.findElement(By.xpath("//b[contains(text(),'For More Jobs click here....')]")).click();
		driver.findElement(By.cssSelector("#HyperLink12")).click();
		
		System.out.println("testing Waits starting right now");
		
		
		driver.findElement(By.cssSelector("#Hyper")).click();
		System.out.println("Could not find that item .. dude");

	}

	@AfterTest
	public void third() {

		driver.close();
		driver.quit();

		System.out.println("The test has completed. Thanks for your time");
	}


}
