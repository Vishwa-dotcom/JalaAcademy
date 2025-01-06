package SelFrameworkDesign.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.MenuPageM;
import SelFrameworkDesign.WebElements.collapsePageWE;
import SelFrameworkDesign.Methods.MenuPageM;

public class MenuPageTest extends BaseTest {
	
	private static List<WebElement> until;

	@Test
	public static void SinleMenuTest() {
		
		MenuPageM.clickOnMoreOption();
		MenuPageM.clickOnMenuOption();
		MenuPageM.clickOnSingleMenu();
		MenuPageM.clickOnSingleMenuTesting();
		MenuPageM.getTextSingleMenuTesting();
				
	}
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
