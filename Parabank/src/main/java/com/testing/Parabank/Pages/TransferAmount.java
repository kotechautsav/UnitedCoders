package com.testing.Parabank.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TransferAmount {
	
	public static String transferringFunds(WebDriver driver) throws Exception {
		
		driver.findElement(By.xpath("//a[@href ='/parabank/transfer.htm']")).click();
		System.out.println("Method is working.");
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("20000");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		Select account1 = new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		account1.selectByIndex(0);
		Select account2 = new Select(driver.findElement(By.xpath("//select[@id='toAccountId']")));
		account2.selectByIndex(0);
		System.out.println("Account Selected");
		return "Successful";
	}
}
