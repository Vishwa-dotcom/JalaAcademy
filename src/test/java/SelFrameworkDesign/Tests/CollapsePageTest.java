package SelFrameworkDesign.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SelFrameworkDesign.Allure.AllureLiestner;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.MenuPageM;
import SelFrameworkDesign.WebElements.collapsePageWE;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Listeners(AllureLiestner.class)
public class CollapsePageTest extends BaseTest {
 
	@Description("Validating Collapse Page ")
	@Feature("Collapse Page")
	@Story("Single Collapse page test")
	@Test(priority = 1)
	public static void singleCollapseTest() throws Exception {
		MenuPageM.clickOnMoreOption();
		//homePageWE.getMoreList("Collapsible Content").ifPresent(e->e.click());
		collapsePageWE collapsePageWE = new collapsePageWE(driver);
		collapsePageWE.clickOnCollapsibleContent1();
		collapsePageWE.clickOnCollapse();
		collapsePageWE.clickOnSingleCollapse();
		collapsePageWE.clickOnKnowYouGoal();
		collapsePageWE.getTextofFirst();
	}
	
	@Description("Validating Collapse Page ")
	@Feature("Collapse Page")
	@Story("Multi Collapse page test")
	@Test(dependsOnMethods = "singleCollapseTest")
	public static void multipleCollapseTest() throws Exception {
		//homePageWE.getMoreList("Collapsible Content");
		MenuPageM.clickOnMoreOption();
		collapsePageWE collapsePageWE = new collapsePageWE(driver);
		collapsePageWE.clickOnCollapsibleContent();
		collapsePageWE.clickOnCollapse();
		collapsePageWE.clickOnMultipleCollapse();
		collapsePageWE.clickOnMultipleCollapseOptions("Learn Anything Quickly");
		collapsePageWE.getLearnAnythingOptions("Learn by doing. Always play with the code while learning1.");
	}
}
