package SelFrameworkDesign.Tests;

import org.testng.annotations.Test;

import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.MenuPageM;
import SelFrameworkDesign.Methods.PopupsPageWEM;

public class popUpPageTest extends BaseTest {

	 @Test
	public static void InWindowPopupTest() {
		PopupsPageWEM pop = new PopupsPageWEM(driver);
		MenuPageM.clickOnMoreOption();
		pop.ClickOnPopup();
		pop.ClickOnWindowPopup();
		//pop.GetTextInWindowPopUpOneHeading();
		//pop.GetTextInWindowPopUpOneMessage();
		pop.ClickOnInWindowPopUpOneCloseBtn();
		
	}
	 @Test
	 public static void AlertBoxTEst() {
		 PopupsPageWEM pop = new PopupsPageWEM(driver);
		 MenuPageM.clickOnMoreOption();
		 pop.ClickOnPopup();
		 pop.ClickOnAlertBox();
	 }
	 @Test
	 public static void ConfirmBoxTEst() {
		 PopupsPageWEM pop = new PopupsPageWEM(driver);
		 MenuPageM.clickOnMoreOption();
		 pop.ClickOnPopup();
		 pop.ClickOnConfirmBoxButton();
	 }
	 @Test
	 public static void PromptBoxTEst() {
		 PopupsPageWEM pop = new PopupsPageWEM(driver);
		 MenuPageM.clickOnMoreOption();
		 pop.ClickOnPopup();
		 pop.ClickOnPromptBoxButton();
	 }
}
