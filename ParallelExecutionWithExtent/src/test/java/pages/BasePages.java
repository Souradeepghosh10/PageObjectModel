package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReports.ExtentTestManager;

public class BasePages
{
	public WebDriver driver;
    public WebDriverWait wait;
 
    //Constructor
    public BasePages (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void NavigateToURL(String baseURL)
    {
    	driver.get(baseURL);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Navigated to the URL :"+baseURL);
    }
 
    //Click Method
    public void click (By elementLocation) {
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the Element :"+elementLocation);
        driver.findElement(elementLocation).click();
    }
 
    //Write Text
    public void writeText (By elementLocation, String text) {
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Entering text in the text box :"+text);
        driver.findElement(elementLocation).sendKeys(text);
    }
 
    //Read Text
    public String readText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }

}
