package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePages {

	// *********Constructor*********
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// *********Page Variables*********
	String baseURL = "http://www.facebook.com/";
	// *********Web Elements*********
	String usenameId = "email";
	String passwordId = "pass";
	String loginButtonId = "loginbutton";

	// String errorMessageUsernameXpath =
	// "//*[@id=\"loginForm\"]/div[1]/div/div";
	// String errorMessagePasswordXpath = "//*[@id=\"loginForm\"]/div[2]/div/div
	// ";
	// *********Page Methods*********
	public void goToFaceBookLogin() {
		NavigateToURL(baseURL);
	}

	public void loginToFaceBook(String username, String password) {
		// Enter Username(Email)
		writeText(By.id(usenameId), username);
		// Enter Password
		writeText(By.id(passwordId), password);
		// Click Login Button
		click(By.id(loginButtonId));
	}
	/*
	 * //Verify Username Condition public void verifyLoginUserName (String
	 * expectedText) {
	 * Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)),
	 * expectedText); }
	 * 
	 * //Verify Password Condition public void verifyLoginPassword (String
	 * expectedText) {
	 * Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)),
	 * expectedText); }
	 */
}
