package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.Pages.OpenAccount;

public class openaccountTest extends OpenAccount {

	static ExtentReports report = ExtendReport.getReportInstance();
	static ExtentTest logger;

	@Test(priority = 1)
	public static void openaccountmessage() {

		logger = report.createTest("Open Account Message");

		String success = OpenAccount.open();

		Assert.assertEquals(success, "Congratulations, your account is now open.");
		logger.log(Status.PASS, "New Account has been opened with minimum balance");
	}

	@Test(priority = 2)
	public static void verifyAccount() {

		logger = report.createTest("Verify Account");

		String verify = OpenAccount.validateaccount();
		Assert.assertEquals(verify, "account created");
		logger.log(Status.PASS, "New Account has been opened and verified");
	}

	/*@AfterClass
	public static void closeBrowser() {
		report.flush();
	}*/
}
