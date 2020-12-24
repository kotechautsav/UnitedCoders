package com.testing.Parabank.TestBase;


import org.openqa.selenium.WebDriver;

import com.testing.Parabank.Pages.AccountOverview;
import com.testing.Parabank.Pages.Login;
import com.testing.Parabank.Pages.OpenAccount;

public class BaseClass {
	
	//Initializing the WebDriver.
	
	private static WebDriver driver;
	
	public static WebDriver getDriver(String s) {
		driver = DriverSetup.invokeDriver(s);
		return driver;
	}
	
	public static void navigation(WebDriver driver) {
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	}
	
	public static void main(String[] args) throws Exception {
		driver = getDriver("Chrome_Windows");
		navigation(driver);
		Login.login(driver);
		AccountOverview.CheckingAccountDetails(driver);
		OpenAccount.openAccount(driver);
		System.out.println("Methods Working Fine");
		AccountOverview.CheckingAccountDetails(driver);
		Thread.sleep(10000);
		driver.close();
		driver.quit();
		
	}
	
	
	
	

}
