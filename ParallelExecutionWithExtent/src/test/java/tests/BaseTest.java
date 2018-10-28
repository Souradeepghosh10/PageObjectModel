package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
	//public static  RemoteWebDriver driver;
	public  DesiredCapabilities cap;

	public  static RemoteWebDriver getDriver() {
		return (RemoteWebDriver) ThreadWebDriver.get();
	}
	@Parameters({"remoteUrl"})
	@BeforeMethod
	public void setup(String remoteurl) throws MalformedURLException {
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chiku\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		ThreadWebDriver.set(driver);
		*/
		/*
		cap=new DesiredCapabilities().chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN8_1);
		driver = new RemoteWebDriver(new URL(remoteurl),cap);
		ThreadWebDriver.set(driver);
		*/

		// Create a wait. All test classes use this.
		//wait = new WebDriverWait(driver, 15);

		// Maximize Window
		//driver.manage().window().maximize();
		switch (remoteurl) {
		case "local":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chiku\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			ThreadWebDriver.set(driver);
			// Create a wait. All test classes use this.
			wait = new WebDriverWait(driver, 15);

			// Maximize Window
			driver.manage().window().maximize();
			break;
		case "grid":
			cap=new DesiredCapabilities().chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WIN8_1);
			driver = new RemoteWebDriver(new URL(remoteurl),cap);
			ThreadWebDriver.set(driver);
			// Create a wait. All test classes use this.
			wait = new WebDriverWait(driver, 15);

			// Maximize Window
			driver.manage().window().maximize();

		default:
			break;
		}
	}
	
	
	@AfterMethod
	public void teardown() {
	    driver = ThreadWebDriver.get();
		driver.quit();
	}
	
	

}
