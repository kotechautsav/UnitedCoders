package com.testing.Parabank.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.testing.Parabank.TestBase.BaseClass;

public class AccountOverview extends BaseClass{
	

	
	public static void CheckingAccountDetails(WebDriver driver) {
		
		//Click on Account Overview Link
		driver.findElement(By.xpath("//*[@id=\'leftPanel\']/ul/li[2]/a")).click();
//		String accountNumber = driver.findElement(By.xpath("//tbody")).getText();
//		System.out.println(accountNumber);
		
	}

}
