package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.Parabank.Pages.PayBills;

public class paybillTest {

	@Test(priority=1)
	public static void validBillPay() {

		String success = PayBills.paybill();
		
		
		Assert.assertEquals(success, "ParaBank | Bill Payment Complete");
		
	}
    @Test(priority=2)
	public static void invalidBillPay() {

		String payeenameErr = PayBills.payeenameError();
		String addressErr = PayBills.addressError();
		String cityErr = PayBills.cityError();
		String stateErr =PayBills.stateError();
		String zipcodeErr =PayBills.zipCodeError();
		String phone_numberErr = PayBills.withoutphoneNumberRegister();
		String account_numberErr =PayBills.accountNumberError();
		String accountmismatchErr = PayBills.accountNumberMismatchError();
		String verify_account_numberErr = PayBills.verifyAccountError();
		String amountErr =PayBills.amountError();
		
        Assert.assertEquals(payeenameErr, "Payee name is required.");
		Assert.assertEquals(addressErr, "Address is required.");
		Assert.assertEquals(cityErr, "City is required.");
		Assert.assertEquals(stateErr, "State is required.");
		Assert.assertEquals(zipcodeErr, "Zip Code is required.");
		Assert.assertEquals(phone_numberErr, "Phone number is required.");
		Assert.assertEquals(account_numberErr, "Account number is required.");
		Assert.assertEquals(accountmismatchErr, "The account numbers do not match.");
		Assert.assertEquals(verify_account_numberErr, "Account number is required.");
		Assert.assertEquals(amountErr, "The amount cannot be empty.");

	}
}



