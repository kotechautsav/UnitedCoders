package com.testing.Parabank.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Parabank.TestBase.DriverSetup;


public class PayBills {
	static WebDriver driver;

	public static String paybill() {

		driver = DriverSetup.driver;//.invokeDriver("FirefoxDriver_WindowsOS");
		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		//driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("12");
		//driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12");
		//driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		driver.findElement(By.linkText("Bill Pay")).click();
		WebDriverWait Wait = new WebDriverWait(driver, 30);
		
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@ng-show=\"showResult\"]")));

		String actualResult = driver.getTitle();
		return actualResult;

	}
	
	public static String payeenameError() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));


		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.name\"]")).getText();
		return actualResult;

	}

	
	public static String addressError() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.address\"]")).getText();
		return actualResult;

	}
	
	public static String cityError() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String errMessage = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.city\"]")).getText();
		return errMessage;

	}
	
	public static String stateError() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.state\"]")).getText();
		return actualResult;

	}
	
	public static String zipCodeError() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.zipCode\"]")).getText();
		return actualResult;

	}
	
	public static String withoutphoneNumberRegister() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@ng-show=\"!validationModel.phoneNumber\"]")));
		
		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.phoneNumber\"]")).getText();
		return actualResult;

	}
	
	public static String accountNumberError() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();


		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.account == 'empty'\"]")).getText();
		return actualResult;

	}
	
     public static String accountNumberMismatchError() {

		
		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
		

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'mismatch'\"]")).getText();
		return actualResult;
	}
	
	public static String verifyAccountError() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'empty'\"]")).getText();
		return actualResult;

	}
	
	public static String amountError() {

		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.amount == 'empty'\"]")).getText();
		return actualResult;

	}
	
	
	



}
