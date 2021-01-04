package com.testing.Parabank.Pages;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testing.Parabank.TestBase.DriverSetup;
import com.testing.Parabank.Utils.ReadingExcel;

public class UpdateInfo {
	static WebDriver driver;
	static XSSFSheet sheet =ReadingExcel.getDataFromExcel();
	
	public static String update()  {

		driver = DriverSetup.driver;
		

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String result0 = driver
				.findElement(By.xpath(
						"//p[contains(text(),'Your updated address and phone number have been added to the system.')]"))
				.getText();
		 
		return result0;

	}

	public static String UpdatefnameErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result1 = driver.findElement(By.xpath("//span[contains(text(),'First name is required.')]")).getText();
		// System.out.println(result1);
		return result1;

	}

	public static String UpdatelnameErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result2 = driver.findElement(By.xpath("//span[contains(text(),'Last name is required.')]")).getText();
		// System.out.println(result2);
		return result2;

	}

	public static String UpdateaddressErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result3 = driver.findElement(By.xpath("//span[contains(text(),'Address is required.')]")).getText();
		// System.out.println(result3);
		return result3;

	}

	public static String UpdatecityErr() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result4 = driver.findElement(By.xpath("//span[contains(text(),'City is required.')]")).getText();
		// System.out.println(result4);
		return result4;

	}

	public static String UpdatestateErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result5 = driver.findElement(By.xpath("//span[contains(text(),'State is required.')]")).getText();
		// System.out.println(result5);
		return result5;

	}

	public static String UpdateZipCodeErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result6 = driver.findElement(By.xpath("//span[contains(text(),'Zip Code is required.')]")).getText();
		// System.out.println(result6);
		return result6;

	}

}
