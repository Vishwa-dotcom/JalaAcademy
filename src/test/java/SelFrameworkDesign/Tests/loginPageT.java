package SelFrameworkDesign.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import SelFrameworkDesign.Allure.AllureLiestner;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.homePageM;
import SelFrameworkDesign.Methods.loginPageM;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Listeners(AllureLiestner.class)
public class loginPageT extends BaseTest {

	
	@Description("Validating Login Page")
	@Feature("Login Page")
	@Story("Login Page Validation")
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
