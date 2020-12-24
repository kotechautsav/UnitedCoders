package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.Parabank.Pages.Registration;

public class registrationTest extends Registration{
	@Test(priority=1)
	public static void validRegistration() {

		String success = Registration.register();
		String noPhoneNumber = Registration.withoutPhonenumberRegister();
		
		Assert.assertEquals(success, "Your account was created successfully. You are now logged in.");
		Assert.assertEquals(noPhoneNumber, "Your account was created successfully. You are now logged in.");
		
	}
    @Test(priority=2)
	public static void invalidRegistration() {

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
		Assert.assertEquals(lastnameErr, "Last name is required.");
		Assert.assertEquals(addressErr, "Address is required.");
		Assert.assertEquals(cityErr, "City is required.");
		Assert.assertEquals(stateErr, "State is required.");
		Assert.assertEquals(zipcodeErr, "Zip Code is required.");
		Assert.assertEquals(ssnErr, "Social Security Number is required.");
		Assert.assertEquals(usernameErr, "Username is required.");
		Assert.assertEquals(passwordErr, "Password is required.");
		Assert.assertEquals(passwordConfirmErr, "Password confirmation is required.");
		Assert.assertEquals(passwordmismatchErr, "Passwords did not match.");

	}
}
