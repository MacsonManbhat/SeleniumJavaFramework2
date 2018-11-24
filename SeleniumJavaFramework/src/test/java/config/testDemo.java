package config;



	import org.openqa.selenium.By.ByClassName;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.DemoPropertiesFile;
	
	public class testDemo {
	
		public static String browserName ;
		WebDriver driver;

		@BeforeTest

		public void Begin(){

			DemoPropertiesFile.getproperties();

			if (browserName.equalsIgnoreCase("internet explorer")) {

				System.setProperty("webdriver.ie.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
						+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\IE\\IEDriverServer.exe");

				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("Chrome")) {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
						+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Chrome\\chromedriver.exe");

				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmanbhat\\eclipse-workspace\\"
						+ "SeleniumJavaFramework\\Drivers_AllBrowsers\\Gecko_Mozilla\\geckodriver.exe");

				driver = new FirefoxDriver();
			}




		}

		@Test
		public void Do(){

			driver.get("https://cricinfo.com");
			//System.out.println(driver.equals(getClass()));
			driver.findElement(ByClassName.className("quicklinks_list__name"));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		@AfterTest
		public void Finish(){
			driver.close();

		}
	}
