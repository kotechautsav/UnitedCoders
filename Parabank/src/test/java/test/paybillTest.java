package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.Pages.PayBills;

public class paybillTest {
	
	static ExtentReports report = ExtendReport.getReportInstance();
	static ExtentTest logger;

	@Test(priority=1)
	public static void validBillPay() {
		logger = report.createTest("Valid BillPay");
		String success = PayBills.paybill();
		
		
		Assert.assertEquals(success, "ParaBank | Bill Payment Complete");
		logger.log(Status.PASS, "Bill Payment successful.");
	}
    @Test(priority=2)
	public static void invalidBillPay() {
    	
    	logger = report.createTest("Invalid BillPay");
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
        logger.log(Status.INFO, "Payee name error message verified.");
		Assert.assertEquals(addressErr, "Address is required.");
		logger.log(Status.INFO, "Address error message verified.");
		Assert.assertEquals(cityErr, "City is required.");
		logger.log(Status.INFO, "City error message verified.");
		Assert.assertEquals(stateErr, "State is required.");
		logger.log(Status.INFO, "State error message verified.");
		Assert.assertEquals(zipcodeErr, "Zip Code is required.");
		logger.log(Status.INFO, "Zip Code error message verified.");
		Assert.assertEquals(phone_numberErr, "Phone number is required.");
		logger.log(Status.INFO, "Phone number error message verified.");
		Assert.assertEquals(account_numberErr, "Account number is required.");
		logger.log(Status.INFO, "Account number error message verified.");
		Assert.assertEquals(accountmismatchErr, "The account numbers do not match.");
		logger.log(Status.INFO, "Account mismatch error message verified.");
		Assert.assertEquals(verify_account_numberErr, "Account number is required.");
		logger.log(Status.INFO, "Account number error message verified.");
		Assert.assertEquals(amountErr, "The amount cannot be empty.");
		logger.log(Status.INFO, "Amount error message verified.");

		logger.log(Status.PASS, "Invalid billpay error message is recieved.");
	}
    
    
    
}



