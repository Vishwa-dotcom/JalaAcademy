package SelFrameworkDesign.Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import SelFrameworkDesign.WebElements.loginPageWE;

public class loginPageM extends BaseTest {

	public static void jalaAcademyPage() {
		String Expected = loginPageWE.jalaText();
		String Actual = "JALA Academy";
		Assert.assertEquals(Actual, Expected);
	}
	
	public static void jalaWelcomePage() {
		String Expected = loginPageWE.jalaWelcomePage();
		String Actual = "Welcome to JALA Academy";
		Assert.assertEquals(Actual, Expected);
	}
	
	public static void enterUserName(String UserName) {
		loginPageWE.emailTextBox().sendKeys(UserName);
	}

	
	public static void enterPassword(String Password) {
		loginPageWE.passwordTextBox().sendKeys(Password);
	}

	public static void clickLoginButton() {
		loginPageWE.loginButton().click();
	}
	public static void clickLogOutButton() {
		loginPageWE.logOut().click();
	}
	
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
