package Junit_Assignment;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Connection.DriverConnection;

@RunWith(Parameterized.class)
public class ParameterizedDemo1
{
    int MobileNo ;
    String Password ;

	public ParameterizedDemo1 (int MobileNo, String Password)
	  {
		  this.MobileNo = MobileNo ;
		  this.Password = Password ;
	  }

	  static WebDriver driver = null ;

	  @Before
	  public void OpeningBrowser ()
	  {
		  String url = " https://careercenter.tops-int.com/";
		  driver = DriverConnection.getDriver(url);
	  }

	@Test
	  public void test () throws InterruptedException
	  {
		  WebElement Name = driver.findElement(By.name("user_name"));
		  Name.clear();
		  Name.sendKeys("123456");
		  WebElement Password = driver.findElement(By.name("user_password"));
		  Password.clear();
		  Password.sendKeys("Selenium@123");
		  Thread.sleep(4000);
		  driver.quit();
	  }

	  @Parameters
	  public static List <Object[]> Data ()
	  {
		  Object object [][] = new Object [4][2];

		  object [0][0] =  123456 ;
		  object [0][1] = "Selenium@123";

		  object [1][0] =  12345 ;
		  object [1][1] = "Selenium@123";

		  object [2][0] = 123456 ;
		  object [2][1] = "selenium@123";

		  object [3][0] = 12345 ;
		  object [3][1] = "selenium@123";

		  return Arrays.asList(object) ;
	  }
}
