package com.testing.Parabank.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;

import com.testing.Parabank.TestBase.DriverSetup;

public class Registration {

	static WebDriver driver;
	
	public static void Register() throws Exception {
		
		driver=DriverSetup.invokeDriver("ChromeDriver_WindowsOS");
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dravid");
		driver.findElement(By.id("customer.address.street")).sendKeys("charminar");
		driver.findElement(By.id("customer.address.city")).sendKeys("hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("222143");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("customer.ssn")).sendKeys("332-25-45617");
		driver.findElement(By.id("customer.username")).sendKeys("Rahul@123");
		driver.findElement(By.id("customer.password")).sendKeys("R@hul123");
		driver.findElement(By.id("customer.repeatedPassword")).sendKeys("R@hul123");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	
}

