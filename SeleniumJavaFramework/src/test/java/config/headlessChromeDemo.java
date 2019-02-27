package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test()	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\git\\SeleniumJavaFramework2.9\\SeleniumJavaFramework\\"
				+ "Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Srinath");
		//driver.findElement(By.linkText("javascript:void(0)")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.get("http://vasai.com");
		System.out.println(driver.getPageSource().contains("exams"));
	if (driver.getPageSource().contains("exams")) {
		
		System.out.println("There is exams on the website");
	} else
	{
		System.out.println("There is no exams word on the website");
		
	}
		
		System.out.println("The test has completed");
				
		System.out.println(driver.getTitle());
		
	}

}
