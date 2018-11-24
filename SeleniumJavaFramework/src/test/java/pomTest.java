import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearch;

public class pomTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestPom();
		
		

	}
	
	public static void TestPom() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\SeleniumJavaFramework\\"
				+ "Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		googleSearch.textBoxItem(driver).sendKeys("Macson Valentin Manbhat");
		googleSearch.SearchButton(driver).click();
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource().contains("Tester"));
		driver.close();
		
		
		
		
		
	}

}
