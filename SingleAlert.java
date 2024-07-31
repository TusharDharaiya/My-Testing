package Selenium_Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class SingleAlert 
{

	public static void main(String[] args) throws InterruptedException 
	{
	  	 String url = "https://demo.guru99.com/test/delete_customer.php";
	  	 WebDriver driver = DriverConnection.getDriver(url);
	  	 
	  	 WebElement CustomerId = driver.findElement(By.name("cusid"));
	  	 CustomerId.click();
	  	 CustomerId.sendKeys("12345");
	  	 
	  	 WebElement Submit = driver.findElement(By.name("submit"));
	  	 Submit.click();
	  	 Alert alert = driver.switchTo().alert();
	  	 Thread.sleep(2000);
	  	 alert.dismiss();
	  	 //alert.accept();
//	  	 Thread.sleep(3000);
//	  	 Alert alert1 = driver.switchTo().alert();
//	  	 alert1.accept();
	  	 Thread.sleep(4000);
	  	 driver.quit();
	}

}
