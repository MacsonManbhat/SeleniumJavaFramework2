import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath0Elements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework"
				+ "\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://shaw.ca");
	
		driver.findElement(By.className("serviceability-call")).click();
		driver.findElement(By.id("drawer_gsa_location")).sendKeys("Calgary AB, Canada");
		driver.findElement(By.className("primary-wrapper")).click();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("modal_gsa_location")).sendKeys("unit 220, 7110 80 avenue NE t3j0n4");
		driver.findElement(By.className("form")).click();
		driver.findElement(By.xpath("//input[@value='Check availability']")).click();
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
				).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();;
		
		//driver.findElement(By.xpath("//span[@class='ic ic-shaw-search']")).click();
		//driver.findElement(By.xpath("//input[@id='searchTerm']")).click();
		
		/*driver.get("http://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Macson Manbhat");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
		
		
		
		//driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys("phone hardware ");
		
		
		
		driver.close();*/
		
	}

}
