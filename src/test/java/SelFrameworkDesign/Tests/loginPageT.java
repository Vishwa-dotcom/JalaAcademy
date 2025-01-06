package SelFrameworkDesign.Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.homePageM;
import SelFrameworkDesign.Methods.loginPageM;

public class loginPageT extends BaseTest {

	@Test
	public static void loginTest() {
		ExtentTest test = extent.createTest("Login Page Test");
		loginPageM.clickLogOutButton();
		loginPageM.validateAllElementsfromLoginPage();
		loginPageM.enterUserName("training@jalaacademy.com");
		loginPageM.enterPassword("jobprogram");
		loginPageM.clickLoginButton();
		

	}
}
