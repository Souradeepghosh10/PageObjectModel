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
		//master 1 commit
		
		 ExtentTest test = ExtentTestManager.getTest();
		 test.log(LogStatus.PASS,"Test pass");
		System.out.println("Hello Team");
	}
	//master commit
	@Test
	public void testDemo6()
	{
		//master 1 commit
		
		 ExtentTest test = ExtentTestManager.getTest();
		 test.log(LogStatus.PASS,"Test pass");
		System.out.println("Hello Team");
	}
	//test commit
	@Test
	public void testDemo2()
	{
		 ExtentTest test = ExtentTestManager.getTest();
		 test.log(LogStatus.PASS,"Test pass");
		System.out.println("Hello Team");
	}
	
	@Test
	public void testDemo3()
	{
		 ExtentTest test = ExtentTestManager.getTest();
		 test.log(LogStatus.PASS,"Test pass");
		System.out.println("Hello Team");
	}
	
}
