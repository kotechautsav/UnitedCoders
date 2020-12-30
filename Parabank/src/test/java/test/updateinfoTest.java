package test;

import com.testing.Parabank.Pages.UpdateInfo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;

public class updateinfoTest extends UpdateInfo {
	static ExtentReports report = ExtendReport.report;
	static ExtentTest logger;

	@Test(priority = 1)
	public static void validUpdate() {

		logger = report.createTest("Update Valid Information");

		String valid = UpdateInfo.update();
		Assert.assertEquals(valid, "Your updated address and phone number have been added to the system.");
		logger.log(Status.PASS, "Information Update Successfull with valid inputs.");

	}

	@Test(priority = 2)
	public static void invalidUpdate() {
		logger = report.createTest("Invalid Update Information");

		String fname = UpdateInfo.UpdatefnameErr();
		String lname = UpdateInfo.UpdatelnameErr();
		String address = UpdateInfo.UpdateaddressErr();
		String city = UpdateInfo.UpdatecityErr();
		String state = UpdateInfo.UpdatestateErr();
		String zip = UpdateInfo.UpdateZipCodeErr();

		Assert.assertEquals(fname, "First name is required.");
		logger.log(Status.PASS, "First name error message verified.");
		Assert.assertEquals(lname, "Last name is required.");
		logger.log(Status.PASS, "Last name error message verified.");
		Assert.assertEquals(address, "Address is required.");
		logger.log(Status.PASS, "Address error message verified.");
		Assert.assertEquals(city, "City is required.");
		logger.log(Status.PASS, "City error message verified.");
		Assert.assertEquals(state, "State is required.");
		logger.log(Status.PASS, "State error message verified.");
		Assert.assertEquals(zip, "Zip Code is required.");
		logger.log(Status.PASS, "Zip code error message verified.");

	}

	/*@AfterClass
	public static void closeBrowser() {
		report.flush();
	}*/

}