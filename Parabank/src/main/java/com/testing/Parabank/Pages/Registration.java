package com.testing.Parabank.Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.testing.Parabank.TestBase.DriverSetup;
import com.testing.Parabank.Utils.ReadingExcel;

public class Registration {

	static WebDriver driver;
	static XSSFSheet sheet=ReadingExcel.getDataFromExcel();

	public static String register() {

		driver = DriverSetup.invokeDriver("FirefoxDriver_WindowsOS");
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("222dravid@123");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value='Register']")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rightPanel']/p")));

		String actualResult = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
		driver.findElement(By.xpath("//a[contains(text(),\"Log Out\")]")).click();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		return actualResult;

	}

	
	public static String firstnameError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Rahul@23");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("customer.firstName.errors")).getText();
		return actualResult;

	}

	
	public static String lastnameError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Rahul@13");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("customer.lastName.errors")).getText();
		return actualResult;

	}
	
	public static String addressError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Rahul@12");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String errMessage = driver.findElement(By.id("customer.address.street.errors")).getText();
		return errMessage;

	}
	
	public static String cityError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("ahul@123");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("customer.address.city.errors")).getText();
		return actualResult;

	}
	
	public static String stateError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Rhul@123");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("customer.address.state.errors")).getText();
		return actualResult;

	}
	
	public static String zipcodeError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Raul@123");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("customer.address.zipCode.errors")).getText();
		return actualResult;

	}
	
	public static String withoutPhonenumberRegister() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Vishalpandey@123");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rightPanel']/p")));

		String actualResult = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
		driver.findElement(By.xpath("//a[contains(text(),\"Log Out\")]")).click();
		return actualResult;

	}
	
	public static String ssnError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.username")).sendKeys("Rahu@123");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("customer.ssn.errors")).getText();
		return actualResult;

	}
	
	public static String usernameError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("customer.username.errors")).getText();
		return actualResult;

	}
	
	public static String passwordError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Rahul23");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("customer.password.errors")).getText();
		return actualResult;

	}
	
	public static String confirmPasswordError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("hul@123");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("repeatedPassword.errors")).getText();
		return actualResult;

	}
	
	public static String passwordMismatchError() {

		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Rahul");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("R@hl123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

		String actualResult = driver.findElement(By.id("repeatedPassword.errors")).getText();
		return actualResult;
	}

}
