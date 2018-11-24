import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class miccheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://youtube.com");
		//test.pass("Navigated successfully to utube");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Vacation to Maldives");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("Sexy"));

	}

}
