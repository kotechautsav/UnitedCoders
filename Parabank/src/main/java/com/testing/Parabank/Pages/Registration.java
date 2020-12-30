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
		driver.get(sheet.getRow(14).getCell(1).getStringCellValue());
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rightPanel']/p")));

		String actualResult = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
		driver.findElement(By.linkText("Log Out")).click();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		return actualResult;

	}

	
	public static String firstnameError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("customer.firstName.errors")).getText();
		return actualResult;

	}

	
	public static String lastnameError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("customer.lastName.errors")).getText();
		return actualResult;

	}
	
	public static String addressError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String errMessage = driver.findElement(By.id("customer.address.street.errors")).getText();
		return errMessage;

	}
	
	public static String cityError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("customer.address.city.errors")).getText();
		return actualResult;

	}
	
	public static String stateError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("customer.address.state.errors")).getText();
		return actualResult;

	}
	
	public static String zipcodeError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("customer.address.zipCode.errors")).getText();
		return actualResult;

	}
	
	public static String withoutPhonenumberRegister() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue()+"aa");
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
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

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("customer.ssn.errors")).getText();
		return actualResult;

	}
	
	public static String usernameError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("customer.username.errors")).getText();
		return actualResult;

	}
	
	public static String passwordError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("customer.password.errors")).getText();
		return actualResult;

	}
	
	public static String confirmPasswordError() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("repeatedPassword.errors")).getText();
		return actualResult;

	}
	
	public static String passwordMismatchError() {

		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));

		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(13).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualResult = driver.findElement(By.id("repeatedPassword.errors")).getText();
		return actualResult;
	}

}
