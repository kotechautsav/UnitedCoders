package test;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.Pages.TransferAmount;
import com.testing.Parabank.TestBase.BaseClass;
import com.testing.Parabank.TestBase.DriverSetup;




public class TransferAmountTest extends TransferAmount{
	
    //Declaration of static variables.
	public static WebDriver driver;
	public static String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	
	
	//Extent report
	public static ExtentReports report = ExtendReport.getReportInstance();
	public static ExtentTest test;
	
    //Method invoking the browser depending on platform requirements.
	@BeforeMethod
	public static WebDriver getWebDriver() throws Exception {
		
		test = report.createTest("Transferring Amount");
		test.log(Status.INFO, "Opening the Browser");
		
    	//Browser Choices
    	
		
		//Enter your browser choice in between the inverted Commas
		driver=DriverSetup.invokeDriver("ChromeDriver_WindowsOS");
		test.log(Status.PASS, "Browser Opened");
		return driver;
		
    }
	
	//Complete Transfer Amount operation
	@Test
	public static void transferringAmount() throws Exception {
		test.log(Status.INFO, "Logging in");
		BaseClass.navigation(driver);
		BaseClass.login(driver);
		test.log(Status.PASS, "Login Successful");
		test.log(Status.INFO, "Starting the transfer");
		String ssString = TransferAmount.transferringFunds(driver);
		test.log(Status.PASS, ssString);
		test.log(Status.INFO, "Transferring negative amount");
		String ssString2 = TransferAmount.checkingAmount(driver);
		test.log(Status.PASS,ssString2);
		test.log(Status.INFO, "Passing invalid characters");
		String ssString3 = TransferAmount.checkingAmountType(driver);
		test.log(Status.FAIL, ssString3);
		test.log(Status.INFO, "Transferring large amount");
		String ssString4 = TransferAmount.checkingAmountRange(driver);
		test.log(Status.PASS, ssString4);
		
	}
	
	
	
	//Closing the application
	@AfterMethod
	public static void closeApplication(){
		
		test.log(Status.INFO, "Closing the browser");
		driver.close();
		driver.quit();
		report.flush();
		test.log(Status.PASS, "Closed browser successfully");
	}
	
	
	
}