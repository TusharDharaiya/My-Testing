package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class MyKeyBoardWriteEvent {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/newtours/register.php ";
		WebDriver driver = DriverConnection.getDriver(url);
		Thread.sleep(2000);

		WebElement FirstName = driver.findElement(By.name("firstName"));
		Actions action = new Actions (driver);
		action.click(FirstName).sendKeys("tusu").build().perform();
		
		WebElement LastName = driver.findElement(By.name("lastName"));
		action.click(LastName).sendKeys("Tusu").build().perform();
		
		WebElement Phone = driver.findElement(By.name("phone"));
		action.click(Phone).sendKeys("1234567890").build().perform();
		
		WebElement Email = driver.findElement(By.name("userName"));
		action.click(Email).sendKeys("Tusutusu@gmail.com").build().perform();
		
		WebElement Address = driver.findElement(By.name("address1"));
		action.click(Address).sendKeys("Maninagar Railway Station").build().perform();
		
		WebElement City = driver.findElement(By.name("city"));
		action.click(City).sendKeys("Ahmedabad").build().perform();
		
		WebElement State = driver.findElement(By.name("state"));
		action.click(State).sendKeys("Gujarat").build().perform();
		
		WebElement Postalcode = driver.findElement(By.name("postalCode"));
		action.click(Postalcode).sendKeys("380026").build().perform();
		
		WebElement Countries = driver.findElement(By.name("country"));
		Countries.click();
		Select Country = new Select (Countries);
		Country.selectByVisibleText("INDIA");
		
		WebElement UserName = driver.findElement(By.name("email"));
		action.click(UserName).sendKeys("Tusu123").build().perform();
		
		WebElement Password = driver.findElement(By.name("password"));
		action.click(Password).sendKeys("Tusu@123").build().perform();
		
		WebElement ConfirmPassword = driver.findElement(By.name("confirmPassword"));
		action.click(ConfirmPassword).sendKeys("Tusu@123").build().perform();
		
		WebElement SubmitButton = driver.findElement(By.name("submit"));
		action.click(SubmitButton);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
