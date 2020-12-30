package com.testing.Parabank.Pages;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Parabank.TestBase.DriverSetup;
import com.testing.Parabank.Utils.ReadingExcel;

public class OpenAccount {
	static WebDriver driver;
	static XSSFSheet sheet=ReadingExcel.sheet;

	public static String open() {
		
		//driver = DriverSetup.invokeDriver("FirefoxDriver_WindowsOS");
		//driver.get("https://parabank.parasoft.com/parabank/index.html");
		driver=DriverSetup.driver;
		
		driver.findElement(By.name("username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		
		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Open New Account")));

		driver.findElement(By.linkText("Open New Account")).click();
		Select type = new Select(driver.findElement(By.id("type")));
		type.selectByVisibleText("SAVINGS");
		Select acc = new Select(driver.findElement(By.id("fromAccountId")));
		acc.selectByIndex(0);
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
		String accno = new String(driver.findElement(By.id("newAccountId")).getText());
		
		driver.findElement(By.linkText("Accounts Overview")).click();
		
		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accountTable']/tbody/tr/td[1]/a")));
		
		List<WebElement> element =driver.findElements(By.xpath("//*[@id='accountTable']/tbody/tr/td[1]/a"));
		
		int c=0;
		for(int i=0;i<element.size();i++) {
			String str=element.get(i).getText();
			System.out.println(str);
			if(str.contains(accno)) {
				c++;
			}
		}
		if(c>0) {
			return "Account created";
		}
		else {
			return "Account not created";
		}
		
	}
}
