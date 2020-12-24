package com.testing.Parabank.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testing.Parabank.TestBase.BaseClass;


public class Login extends BaseClass {
	public static void login(WebDriver driver) {
		driver.findElement(By.name("username")).sendKeys("tanmoydebnath");
		driver.findElement(By.name("password")).sendKeys("118187");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
