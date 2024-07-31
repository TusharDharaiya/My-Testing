package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class DropDown
{

	public static void main(String[] args) throws InterruptedException
	{
		String url = "https://demo.guru99.com/test/newtours/register.php " ;
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement Countries = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
        Countries.click();
        Select Country = new Select (Countries);
        Country.selectByVisibleText("INDIA");
        Thread.sleep(3000);
        driver.quit();
	}

}
