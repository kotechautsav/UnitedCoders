package com.testing.Parabank.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Parabank.TestBase.DriverSetup;

public class OpenAccount {
	static WebDriver driver;

	public static String open() {
		
		driver = DriverSetup.invokeDriver("FirefoxDriver_WindowsOS");
		driver.get("https://parabank.parasoft.com/parabank/index.html");
		
		driver.findElement(By.name("username")).sendKeys("qqqqq");
		driver.findElement(By.name("password")).sendKeys("q");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		
		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Open New Account")));

		driver.findElement(By.linkText("Open New Account")).click();
		Select type = new Select(driver.findElement(By.id("type")));
		type.selectByVisibleText("SAVINGS");
		Select acc = new Select(driver.findElement(By.id("fromAccountId")));
		acc.selectByIndex(1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@class='button']")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]")));

		String result = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]")).getText();
		return result;
	}

	public static String validateaccount() {
		String accno = driver.findElement(By.id("newAccountId")).getText();
		driver.findElement(By.linkText("Accounts Overview")).click();
		String accno1 = driver.findElement(By.xpath("//*[@id=\"accountTable\"]/tbody/tr[3]/td[1]/a")).getText();
		if (accno.equals(accno1)) {
			return "account created";
		} else
			return "No account created";
	}
}
