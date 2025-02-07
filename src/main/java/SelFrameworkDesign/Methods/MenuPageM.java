package SelFrameworkDesign.Methods;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import SelFrameworkDesign.WebElements.menuPageWE;
import io.qameta.allure.Step;

public class MenuPageM extends BaseTest  {
	//////////////////////////////////////////Single Menu////////////////////////////////////////////////
	
	public static Actions action;
	public static ExtentTest test;
	
	@Step("Navigated to More Option")
	public static void clickOnMoreOption()  {
		//test = extent.createTest("Menu Page Test started");
	//	test.log(Status.PASS, "TEst Passed");
		WebElement MoreOption = menuPageWE.moreDropDown();
		wait.until(ExpectedConditions.visibilityOf(MoreOption));
		boolean clickOnMoreOptionIsDisplayed = menuPageWE.moreDropDown().isDisplayed();
		Assert.assertTrue(clickOnMoreOptionIsDisplayed);
		menuPageWE.moreDropDown().click();
	}
	
	@Step("Navigated to Menu Option and Validating Menu Option")
	public static void clickOnMenuOption() {
		WebElement MenuOption = menuPageWE.menuLink();
		wait.until(ExpectedConditions.visibilityOf(MenuOption));
		boolean clickOnMenuOptionIsDisplayed = menuPageWE.menuLink().isDisplayed();
		Assert.assertTrue(clickOnMenuOptionIsDisplayed);
		menuPageWE.menuLink().click();
	}
	
	@Step("Clicked on Single Option")
	public static void clickOnSingleMenu() {
		menuPageWE.singleMenus().click();
	}
	
	@Step("Clicked on Single Option")
	public static void clickOnSingleMenuTesting() {
		menuPageWE.singleMenuTesting().click();
	}
	@Step("Validating Single Menu")
	public static void getTextSingleMenuTesting() {
		String singleMenuTestingText = menuPageWE.singleMenuTestingText().getText();
		Assert.assertEquals(singleMenuTestingText, "You Have Selected Testing Menu Option.");
	}
	
	public static void clickOnSingleMenuJava() {
		menuPageWE.singleMenuJava().click();
	}

	public static String getTesxtSingleMenuJava() {
		 String singleMenuJavaText = menuPageWE.singleMenuJavaText().getText();
		 return singleMenuJavaText;
	}
	
	///////////////////////////////////////////////////////////Sub Menu///////////////////////////////////////////////////////////
	
	public static void clickOnSubMenu() {
		WebElement clickOnSubMenu = menuPageWE.subMenu();
		wait.until(ExpectedConditions.visibilityOf(clickOnSubMenu));
		boolean clickOnSubMenuIsDisplayed = menuPageWE.subMenu().isDisplayed();
		Assert.assertTrue(clickOnSubMenuIsDisplayed);
		menuPageWE.subMenu().click();
		
	}
	
	public static void clickOnSubMenuTesting() {
		WebElement clickOnSubMenuTesting = menuPageWE.subMenuTestingOption();
		wait.until(ExpectedConditions.visibilityOf(clickOnSubMenuTesting));
		boolean clickOnSubMenuIsDisplayed = menuPageWE.subMenuTestingOption().isDisplayed();
		Assert.assertTrue(clickOnSubMenuIsDisplayed);
		 action = new Actions(driver);
		action.moveToElement(clickOnSubMenuTesting).perform();
		
	}
	
	public static void clickOnSubMenuTestingSelenium() {
		WebElement clickOnSubMenuTestingSelenium = menuPageWE.subMenuTestingSeleniumOption();
		wait.until(ExpectedConditions.visibilityOf(clickOnSubMenuTestingSelenium));
		boolean clickOnSubMenuTestingSeleniumIsDisplayed = menuPageWE.subMenuTestingSeleniumOption().isDisplayed();
		Assert.assertTrue(clickOnSubMenuTestingSeleniumIsDisplayed);
		action.moveToElement(clickOnSubMenuTestingSelenium).click().perform();
	}
	@Step("Validating Sub Menu")
	public static void SubMenuTestingSeleniumGetText() {
		WebElement SubMenuTestingSeleniumGetText = menuPageWE.subMenuTestingSeleniumOptionText();
		wait.until(ExpectedConditions.visibilityOf(SubMenuTestingSeleniumGetText));
		String SubMenuTestingSeleniumGetTextActual = menuPageWE.subMenuTestingSeleniumOptionText().getText();
		String SubMenuTestingSeleniumGetTextExpected = "You Have Selected Selenium Menu Option.";
		Assert.assertEquals(SubMenuTestingSeleniumGetTextActual, SubMenuTestingSeleniumGetTextExpected);
		
	}
	
	
	
	
	
	
}


