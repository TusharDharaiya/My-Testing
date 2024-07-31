package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.DriverConnection;

public class MyMouseHoverEvent
{

	public static void main(String[] args) throws InterruptedException
	{
		String url = " https://demo.guru99.com/test/newtours/register.php" ;
		WebDriver driver = DriverConnection.getDriver(url);
		Thread.sleep(3000);

		WebElement Home = driver.findElement(By.linkText("Home"));

		Actions action = new Actions (driver);
		action.moveToElement(Home).build().perform();
		Thread.sleep(4000);
		driver.quit();
	}

}
