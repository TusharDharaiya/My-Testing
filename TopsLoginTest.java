package TestNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class TopsLoginTest 
{
  static WebDriver driver = null ;
  
  @BeforeTest
  public void BrowserOpen ()
  {
	  String url = " https://careercenter.tops-int.com/" ;
	  driver = DriverConnection.getDriver(url);
  }
  
  @Test
  public void TopsLogin ()
  {
	  WebElement MobileNo = driver.findElement(By.name("user_name"));
	  MobileNo.sendKeys("Selenium@gmail.com");
	  WebElement Password = driver.findElement(By.name("user_password"));
	  Password.sendKeys("Selenium@123");
	  WebElement LoginButton = driver.findElement(By.xpath("//input[@type='submit']"));
	  LoginButton.click();
  }
  
  public void CloseBrowser () throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
