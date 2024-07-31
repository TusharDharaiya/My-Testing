package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class MyPartialLinkText
{

	public static void main(String[] args) throws InterruptedException
	{
		String url = " https://www.facebook.com/" ;
		WebDriver driver = DriverConnection.getDriver(url);

		List <WebElement> AllCreate = driver.findElements(By.partialLinkText("Create"));
		for (WebElement AC : AllCreate)
		{
			System.out.println(AC.getText() + " " );
		}
		AllCreate.get(1).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
	}
}
