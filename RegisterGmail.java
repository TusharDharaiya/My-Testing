package Selenium_Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class RegisterGmail
{

	public static void main(String[] args) throws InterruptedException
	{
		String url = "https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&ddm=0&dsh=S-1794621474:1721729296459305&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=ALoj5Ap9yjqj1tDLW3f0za7mJ7X-9qD89KCK0ZDHz1n4CiXXhUIF07VHEYIPZ4mk" ;
		WebDriver driver = DriverConnection.getDriver(url);

		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();

	    WebElement FirstName = driver.findElement(By.name("firstName"));
	    FirstName.sendKeys("TusharTusu");

	    WebElement LastName = driver.findElement(By.name("lastName"));
	    LastName.sendKeys("Dhairya");

	    driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();

	    Thread.sleep(5000);

	    WebElement Day = driver.findElement(By.id("day"));
	    Day.sendKeys("10");

	    WebElement Months = driver.findElement(By.id("month"));
	    Select Month = new Select (Months);
	    Month.selectByValue("1");

	    WebElement Year = driver.findElement(By.id("year"));
	    Year.sendKeys("2010");

	    WebElement Genders = driver.findElement(By.id("gender"));
	    Genders.click();
	    Select Gender = new Select (Genders);
	    Gender.selectByVisibleText("Male");

	    driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();

	    Thread.sleep(3000);

	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();

	    driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();

	    Thread.sleep(3000);
	    WebElement Password = driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
	    Password.sendKeys("Tusu123@");

	    WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
	    ConfirmPassword.sendKeys("Tusu123@");

	    driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();

	    Thread.sleep(3000);
//	    String url1 = "https://accounts.google.com/signup/v2/idvbyphone?TL=ALoj5Ar_81CXlrpBgI2PIRghJlwav6eWSQmoNWs7gB5QYwHDtDzZ2XEiWs7Ed9F2&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ddm=0&dsh=S1865522861%3A1721815299476432&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en-GB&service=mail&theme=glif";
//	    driver.navigate().to(url1);
//	    Thread.sleep(3000);
//	    driver.navigate().back();

//	    String url2 = "https://accounts.google.com/signup/v2/idvbyphone?TL=ALoj5Aq5l9IsgOkwNxiiFi-jg3Jfn6seRjEPq4VR1OaASAuD1CVxEz1uOsLNZFwO&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ddm=0&dsh=S1546481166%3A1721818318628051&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en-US&service=mail&theme=glif " ;
//	    driver.navigate().to(url2);
//	    Thread.sleep(3000);
	    WebElement Country= driver.findElement(By.xpath("//*[@id=\"countryList\"]/div/div[1]/div[2]"));
	    Country.click();

	    driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("9979508982");

	    driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[1]/div[2]/div/div/div[3]/div/div/div/div/button/span")).click();
	    Thread.sleep(3000);

	    driver.findElement(By.id("code")).sendKeys("");
	    // for OTP

	    driver.findElement(By.xpath("//*[@id=\"recoverySkip\"]/div/button/div[3]")).click();


	    driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
	    Thread.sleep(3000);


	}

}
