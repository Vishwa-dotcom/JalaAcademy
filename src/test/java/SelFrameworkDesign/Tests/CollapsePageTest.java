package SelFrameworkDesign.Tests;

import org.testng.annotations.Test;

import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.MenuPageM;
import SelFrameworkDesign.WebElements.collapsePageWE;

public class CollapsePageTest extends BaseTest {
 
	
	@Test
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
	@Test
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
