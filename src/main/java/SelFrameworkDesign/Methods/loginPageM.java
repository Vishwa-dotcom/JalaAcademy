package SelFrameworkDesign.Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import SelFrameworkDesign.WebElements.loginPageWE;
import io.qameta.allure.Step;

public class loginPageM extends BaseTest {
	@Step("Validating the Login Page Heading")
	public static void jalaAcademyPage() {
		String Expected = loginPageWE.jalaText();
		String Actual = "JALA Academy";
		Assert.assertEquals(Actual, Expected);
	}
	
	@Step("Validating the Welcomem page Heading")
	public static void jalaWelcomePage() {
		String Expected = loginPageWE.jalaWelcomePage();
		String Actual = "Welcome to JALA Academy";
		Assert.assertEquals(Actual, Expected);
	}
	
	@Step("Entering Username: {0}")
	public static void enterUserName(String UserName) {
		loginPageWE.emailTextBox().sendKeys(UserName);
	}

	@Step("Entering Password: {0}")
	public static void enterPassword(String Password) {
		loginPageWE.passwordTextBox().sendKeys(Password);
	}
	
	@Step("Logged in into the application")
	public static void clickLoginButton() {
		loginPageWE.loginButton().click();
	}
	
	@Step("Logged out from the application")
	public static void clickLogOutButton() {
		loginPageWE.logOut().click();
	}
	
	@Step(" validate All Elements from LoginPage")
	public static void validateAllElementsfromLoginPage() {
		System.out.println("Validation for all the elements in Login Page - Started");
		boolean emailTextBoxIsDisplayed = loginPageWE.emailTextBox().isDisplayed();
		Assert.assertTrue(emailTextBoxIsDisplayed, "emailTextBox not displayed");
		
		boolean passwordTextBox = loginPageWE.passwordTextBox().isDisplayed();
		Assert.assertTrue(passwordTextBox, "passwordTextBox not displayed");
		
		boolean loginButton = loginPageWE.loginButton().isDisplayed();
		Assert.assertTrue(loginButton, "loginButton not displayed");
		
		boolean adminLogin = loginPageWE.adminLogin().isDisplayed();
		Assert.assertTrue(adminLogin, "adminLogin not displayed");
		
		boolean rememberMe= loginPageWE.rememberMe().isDisplayed();
		Assert.assertTrue(rememberMe, "rememberMe not displayed");
		
		boolean mailBox = loginPageWE.mailBox().isDisplayed();
		Assert.assertTrue(mailBox, "mailBox not displayed");
		
		System.out.println("Validation for all the elements in Login Page - Completed");
	}

}
