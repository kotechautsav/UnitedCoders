package com.testing.Parabank.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.testing.Parabank.TestBase.BaseClass;

public class OpenAccount extends BaseClass {
	
	public static void openAccount(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
//		Select select = new Select(driver.findElement(By.xpath("//select[@id='type']")));
//		select.selectByVisibleText("SAVINGS");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input")).click();
		Thread.sleep(10000);
	}

}