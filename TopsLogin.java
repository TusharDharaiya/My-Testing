package Junit_Assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class TopsLogin 
{
  static WebDriver driver = null ;
  
  @Before
  public void OpenBrowser ()
  {
	  driver = DriverConnection.getDriver("https://careercenter.tops-int.com/");
  }
  
  @Test
  public void TopsLoginTest ()
  {
	  WebElement MobileNo = driver.findElement(By.id("mobile"));
	  MobileNo.sendKeys("1234567890");
	  WebElement Password = driver.findElement(By.id("password"));
	  Password.sendKeys("Selenium@123");
	  WebElement LoginButton = driver.findElement(By.xpath("//input [@type='submit']"));
	  LoginButton.click();
  }
  
  @After
  public void CloseBrowser () throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
