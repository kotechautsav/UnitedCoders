package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.Pages.Registration;
import com.testing.Parabank.TestBase.DriverSetup;



public class registrationTest extends Registration{
	
	static ExtentReports report = ExtendReport.getReportInstance();
	static ExtentTest logger;
	@Test(priority=1)
	public static void validRegistration() {
		
		logger = report.createTest("Valid Registration");

		String success = Registration.register();
		String noPhoneNumber = Registration.withoutPhonenumberRegister();
		
		Assert.assertEquals(success, "Your account was created successfully. You are now logged in.");
		logger.log(Status.PASS, "Registration successfull with valid inputs.");
		Assert.assertEquals(noPhoneNumber, "Your account was created successfully. You are now logged in.");
		logger.log(Status.PASS, "Registration successfull without phone number.");
		
	}
    @Test(priority=2)
	public static void invalidRegistration() {

    	logger = report.createTest("Invalid Registration");
    	
		String firstnameErr = Registration.firstnameError();
		String lastnameErr = Registration.lastnameError();
		String addressErr = Registration.addressError();
		String cityErr = Registration.cityError();
		String stateErr = Registration.stateError();
		String zipcodeErr = Registration.zipcodeError();
		String ssnErr = Registration.ssnError();
		String usernameErr = Registration.usernameError();
		String passwordErr = Registration.passwordError();
		String passwordConfirmErr = Registration.confirmPasswordError();
		String passwordmismatchErr = Registration.passwordMismatchError();

		Assert.assertEquals(firstnameErr, "First name is required.");
		logger.log(Status.PASS, "First name error message verified.");
		Assert.assertEquals(lastnameErr, "Last name is required.");
		logger.log(Status.PASS, "Last name error message verified.");
		Assert.assertEquals(addressErr, "Address is required.");
		logger.log(Status.PASS, "Address error message verified.");
		Assert.assertEquals(cityErr, "City is required.");
		logger.log(Status.PASS, "City error message verified.");
		Assert.assertEquals(stateErr, "State is required.");
		logger.log(Status.PASS, "State error message verified.");
		Assert.assertEquals(zipcodeErr, "Zip Code is required.");
		logger.log(Status.PASS, "Zip code error message verified.");
		Assert.assertEquals(ssnErr, "Social Security Number is required.");
		logger.log(Status.PASS, "SSN error message verified.");
		Assert.assertEquals(usernameErr, "Username is required.");
		logger.log(Status.PASS, "Username error message verified.");
		Assert.assertEquals(passwordErr, "Password is required.");
		logger.log(Status.PASS, "Password error message verified.");
		Assert.assertEquals(passwordConfirmErr, "Password confirmation is required.");
		logger.log(Status.PASS, "Confirm password error message verified.");
		Assert.assertEquals(passwordmismatchErr, "Passwords did not match.");
		logger.log(Status.PASS, "Matching password error message verified.");

	}
    @AfterClass
	public static void closeBrowser() {
		report.flush();
	}
}
