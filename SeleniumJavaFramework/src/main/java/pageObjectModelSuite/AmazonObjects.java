package pageObjectModelSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonObjects {
	
	WebDriver driver = null;
	
	By textBox = By.id("twotabsearchtextbox");
	
	By searchButton = By.xpath("//input[@value='Go']");
	
	public AmazonObjects (WebDriver driver)	{
		
		this.driver = driver;
	}
	
	public void setTextForSearch (String input )	{
		
		driver.findElement(textBox).sendKeys(input);
		
	}
	
	public void clickForSearch()	{
		
		driver.findElement(searchButton).sendKeys(Keys.RETURN);
		
	}

}
