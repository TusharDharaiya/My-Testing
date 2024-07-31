package TestNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class FacebookLogin 
{
	static WebDriver driver = null ;
   
	@BeforeTest
   public void FBlogin ()
   {
	   String url = "https://www.facebook.com/ " ;
	   driver = DriverConnection.getDriver(url);   
   }
	
	
	@Test
	public void LoginTest ()
	{
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("Selenium@gmail.com");
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("Selenium@123");
		WebElement LoginButton = driver.findElement(By.name("login"));
		LoginButton.click();
	}
	
	@AfterTest
	public void BrowserClose () throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
