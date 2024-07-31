package TestNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class DataProviderProd 
{
  static WebDriver driver = null ;
  
  @BeforeClass
  public static void OpenBrowser ()
  {
	  driver = DriverConnection.getDriver("https://careercenter.tops-int.com/");
  }

  @Parameters ("TT")
  @Test(dataProvider="TT")
  public void TopsTest (String MobileNo, String Password) throws InterruptedException
  {
	  WebElement MobileNoEle = driver.findElement(By.name("user_name"));
	  MobileNoEle.clear();
	  MobileNoEle.sendKeys(MobileNo);
	  Thread.sleep(3000);
	  WebElement PasswordEle = driver.findElement(By.name("user_password"));
	  PasswordEle.clear();
	  PasswordEle.sendKeys(Password);
	  Thread.sleep(3000);
  }
  
  @DataProvider (name = "TT")
  public static Object [][] Data () throws InterruptedException
  {
	  Object [][]object = new Object [4][2];
	  
	  object [0][0] =  "123456";
	  object [0][1] =  "Correct@gmail.com";
	  Thread.sleep(3000);
	  
	  object [1][0] =  "12345";
	  object [1][1] =  "Correct@gmail.com";
	  Thread.sleep(3000);
	  
	  object [2][0] =  "123456 ";
	  object [2][1] =  "Incorrect@gmail.com";
      Thread.sleep(3000);
	  
	  object [3][0] =  "12345";
	  object [3][1] =  "Incorrect@gmail.com";
	  Thread.sleep(3000);
	  
	  return object ;
  }
} 
