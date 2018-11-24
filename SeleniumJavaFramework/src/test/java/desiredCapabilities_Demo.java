import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapabilities_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("ignoreZoomSetting", true);
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\IE\\IEDriverServer.exe ");
		
		
		 
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Ma");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.className("q qs")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		System.out.println("The Test is complete");
		

	}

}
