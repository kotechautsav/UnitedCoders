package com.testing.Parabank.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.testing.Parabank.TestBase.DriverSetup;

public class UpdateInfo {
	static WebDriver driver;
   
	public static String update()  {

		driver = DriverSetup.invokeDriver("FirefoxDriver_WindowsOS");
		driver.get("https://parabank.parasoft.com/parabank/index.html");

		driver.findElement(By.name("username")).sendKeys("qqqqq");
		driver.findElement(By.name("password")).sendKeys("q");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Martin");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Vesu");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Gujarat");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("395007");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("987654321");
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

		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Vesu");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Gujarat");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("395007");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("987654321");
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result1 = driver.findElement(By.xpath("//span[contains(text(),'First name is required.')]")).getText();
		// System.out.println(result1);
		return result1;

	}

	public static String UpdatelnameErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Martin");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Vesu");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Gujarat");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("395007");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("987654321");
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result2 = driver.findElement(By.xpath("//span[contains(text(),'Last name is required.')]")).getText();
		// System.out.println(result2);
		return result2;

	}

	public static String UpdateaddressErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Martin");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Gujarat");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("395007");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("987654321");
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result3 = driver.findElement(By.xpath("//span[contains(text(),'Address is required.')]")).getText();
		// System.out.println(result3);
		return result3;

	}

	public static String UpdatecityErr() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Martin");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Vesu");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Gujarat");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("395007");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("987654321");
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result4 = driver.findElement(By.xpath("//span[contains(text(),'City is required.')]")).getText();
		// System.out.println(result4);
		return result4;

	}

	public static String UpdatestateErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Martin");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Vesu");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("395007");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("987654321");
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result5 = driver.findElement(By.xpath("//span[contains(text(),'State is required.')]")).getText();
		// System.out.println(result5);
		return result5;

	}

	public static String UpdateZipCodeErr() {

		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Martin");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Vesu");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Gujarat");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("987654321");
		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();

		String result6 = driver.findElement(By.xpath("//span[contains(text(),'Zip Code is required.')]")).getText();
		// System.out.println(result6);
		return result6;

	}

}