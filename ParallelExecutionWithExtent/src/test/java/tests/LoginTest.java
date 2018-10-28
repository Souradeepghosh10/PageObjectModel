package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReports.ExtentTestManager;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginFaceBook() {
		ExtentTest test = ExtentTestManager.getTest();
		System.out.println(Thread.currentThread().getId());
		WebDriver driver = ThreadWebDriver.get();
		LoginPage loginPage = new LoginPage(driver, wait);
		loginPage.goToFaceBookLogin();
		loginPage.loginToFaceBook("Hello", "Hello");
		test.log(LogStatus.FAIL, "Test fails");
		Assert.assertTrue(false);
		;
	}

	@Test
	public void testDemoFaceBook() {
		ExtentTest test = ExtentTestManager.getTest();
		test.log(LogStatus.FAIL, "Test fails");
		Assert.assertTrue(false);
		;
	}
/*
	@AfterMethod
	public void teardown() {
	    driver = ThreadWebDriver.get();
		driver.quit();
	}
*/	

}
