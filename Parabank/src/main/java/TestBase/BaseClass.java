package TestBase;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static void main(String[] args) {
		WebDriver driver = DriverSetup.invokeDriver("ChromeDriver_WindowsOS");
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		String pageTitleString = driver.getTitle();
		System.out.println(pageTitleString);
		driver.close();
		driver.quit();
	}

}
