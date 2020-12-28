package com.testing.Parabank.TestBase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testing.Parabank.Pages.TransferAmount;

public class BaseClass {
	private static WebDriver driver;
	private static String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	
	public static WebDriver getDriver() {
		driver = DriverSetup.invokeDriver("ChromeDriver_WindowsOS");
		return driver;
	}
	public static void navigation(WebDriver driver) {
		driver.get(url);
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	public static void login(WebDriver driver) {
		driver.findElement(By.name("username")).sendKeys("helloWorld123");
		driver.findElement(By.name("password")).sendKeys("kofwing2031");
		driver.findElement(By.xpath("//input[@class='button']")).click();
	}
	public static void closingDriver(WebDriver driver){
		driver.close();
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		navigation(driver);
		login(driver);
		String meString = TransferAmount.transferringFunds(driver);
		System.out.println(meString);
		closingDriver(driver);
	}
}
