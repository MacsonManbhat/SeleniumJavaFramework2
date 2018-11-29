package pageObjectModelSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchObjectsGoogle {
	
	private static WebElement element = null;

	
	public static WebElement SearchTextBox (WebDriver driver ) {
		
	WebElement element =	driver.findElement(By.name("q"));
	return element;
	
	}
	
	public static WebElement SearchButon (WebDriver driver)	{
		
		WebElement element = driver.findElement(By.name("btnK"));
		return element;
	}

}
