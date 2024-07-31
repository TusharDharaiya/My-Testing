package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Connection.DriverConnection;

public class MyLinkText
{

	public static void main(String[] args) throws InterruptedException
	{
		String url = "https://www.facebook.com/ " ;
		WebDriver driver = DriverConnection.getDriver(url);

		driver.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(3000);
        driver.navigate().back();

        driver.findElement(By.linkText("Create ad")).click();
        Thread.sleep(3000);
        driver.navigate().back();

        driver.findElement(By.linkText("Create Page")).click();
        Thread.sleep(3000);
        driver.quit();
	}

}
