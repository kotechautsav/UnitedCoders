package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.Pages.Registration;



public class registrationTest extends Registration{
	
	static ExtentReports report = ExtendReport.getReportInstance();
	static ExtentTest logger;
	@Test(priority=1)
	public static void validRegistration() {
		
		logger = report.createTest("Registration is successful");

		String success = Registration.register();
		String noPhoneNumber = Registration.withoutPhonenumberRegister();
		
		Assert.assertEquals(success, "Your account was created successfully. You are now logged in.");
		logger.log(Status.INFO, "Registration successfull with valid inputs.");
		Assert.assertEquals(noPhoneNumber, "Your account was created successfully. You are now logged in.");
		logger.log(Status.INFO, "Registration successfull without phone number.");
		logger.log(Status.PASS, "Valid registration done.");
	}
    @Test(priority=2)
	public static void invalidRegistration() {

    	logger = report.createTest("Registration error messages.");
    	
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
		logger.log(Status.INFO, "First name error message verified.");
		Assert.assertEquals(lastnameErr, "Last name is required.");
		logger.log(Status.INFO, "Last name error message verified.");
		Assert.assertEquals(addressErr, "Address is required.");
		logger.log(Status.INFO, "Address error message verified.");
		Assert.assertEquals(cityErr, "City is required.");
		logger.log(Status.INFO, "City error message verified.");
		Assert.assertEquals(stateErr, "State is required.");
		logger.log(Status.INFO, "State error message verified.");
		Assert.assertEquals(zipcodeErr, "Zip Code is required.");
		logger.log(Status.INFO, "Zip code error message verified.");
		Assert.assertEquals(ssnErr, "Social Security Number is required.");
		logger.log(Status.INFO, "SSN error message verified.");
		Assert.assertEquals(usernameErr, "Username is required.");
		logger.log(Status.INFO, "Username error message verified.");
		Assert.assertEquals(passwordErr, "Password is required.");
		logger.log(Status.INFO, "Password error message verified.");
		Assert.assertEquals(passwordConfirmErr, "Password confirmation is required.");
		logger.log(Status.INFO, "Confirm password error message verified.");
		Assert.assertEquals(passwordmismatchErr, "Passwords did not match.");
		logger.log(Status.INFO, "Matching password error message verified.");

		logger.log(Status.PASS, "Invalid registration error message is recieved.");
	}
   /* @AfterClass
	public static void closeBrowser() {
		report.flush();
	}*/
}
