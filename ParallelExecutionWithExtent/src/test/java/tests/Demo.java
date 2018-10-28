package tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReports.ExtentTestManager;

public class Demo
{
	@Test
	public void testDemo()
	{
		 ExtentTest test = ExtentTestManager.getTest();
		 test.log(LogStatus.PASS,"Test pass");
		System.out.println("Hello Team");
	}

}
