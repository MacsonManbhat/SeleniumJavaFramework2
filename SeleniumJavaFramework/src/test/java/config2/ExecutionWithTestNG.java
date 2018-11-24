package config2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionWithTestNG {
	WebDriver driver = null;
public static 	String browser = null;
	
	
	@BeforeTest
	public void StartTest() {
		
		cricinfotest.getValueszfromConfigFile();
		
	
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\eclipse-workspace"
					+ "\\SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		System.out.println("The Test has Begun And the Browser is Set");
	
	}
	
	@Test
	public void BeginTest() {
		
		driver.get("http://cricinfo.com");
		driver.findElement(By.xpath("//body[contains(@class,'prod cricinfo-25years scoreboard-fixed page-context-top')]/div[@id='global-viewport']/div[@id='header-wrapper']/section[@id='global-scoreboard']/div[contains(@class,'wrap')]/div[contains(@class,'scoreboard-content')]/div[contains(@class,'scores-carousel')]/ul[@id='leagues']/li[1]/div[1]/div[2]/a[1]/div[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"'He's honest, but is he elite honest?'\")]")).click();
		boolean word = driver.getPageSource().contains("elite");
		System.out.println(word);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	}

	
	@AfterTest
	public void EndTest() {
		
		System.out.println("Test Is Complete using the testng framework" + "Now check the stats");
		
		
	}


}
