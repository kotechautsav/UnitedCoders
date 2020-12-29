package com.testing.Parabank.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

public class TransferAmount {
	
	public static String transferringFunds(WebDriver driver) throws Exception {
		
	
		driver.findElement(By.linkText("Transfer Funds")).click();
		System.out.println("Method is working.");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("20000");
		
		Select account1 = new Select(driver.findElement(By.id("fromAccountId")));
		account1.selectByIndex(0);
		Select account2 = new Select(driver.findElement(By.id("toAccountId")));
		account2.selectByIndex(0);
		System.out.println("Account Selected");
		
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		
		Thread.sleep(5000);
		String ssString = driver.findElement(By.xpath("//div[@class=\"ng-scope\"]/p[1]")).getText();
		return ssString;
	}
}