package SelFrameworkDesign.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SelFrameworkDesign.Allure.AllureLiestner;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.MenuPageM;
import SelFrameworkDesign.WebElements.collapsePageWE;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import SelFrameworkDesign.Methods.MenuPageM;

@Listeners(AllureLiestner.class)
public class MenuPageTest extends BaseTest {
	
	private static List<WebElement> until;
	
	@Description("Validating Menu Page")
	@Feature("Menu Page")
	@Story("Single Menu Page Validation")
	@Test
	public static void SinleMenuTest() {
		
		MenuPageM.clickOnMoreOption();
		MenuPageM.clickOnMenuOption();
		MenuPageM.clickOnSingleMenu();
		MenuPageM.clickOnSingleMenuTesting();
		MenuPageM.getTextSingleMenuTesting();
				
	}
	
	@Description("Validating Menu Page")
	@Feature("Menu Page")
	@Story("Sub Menu Page Validation")
	@Test
	public static void subMenuTest() {
		MenuPageM.clickOnMoreOption();
		MenuPageM.clickOnMenuOption();
		MenuPageM.clickOnSubMenu();
		MenuPageM.clickOnSubMenuTesting();
		MenuPageM.clickOnSubMenuTestingSelenium();
		MenuPageM.SubMenuTestingSeleniumGetText();
	}
	
}
