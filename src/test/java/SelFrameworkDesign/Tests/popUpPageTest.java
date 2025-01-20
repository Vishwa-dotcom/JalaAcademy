package SelFrameworkDesign.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SelFrameworkDesign.Allure.AllureLiestner;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.MenuPageM;
import SelFrameworkDesign.Methods.PopupsPageWEM;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Listeners(AllureLiestner.class)
public class popUpPageTest extends BaseTest {
	@Description("Validating Popup Page")
	@Feature("Popup Page")
	@Story("In Window Pupup Page Validation")
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
	@Description("Validating Popup Page")
	@Feature("Popup Page")
	@Story("Alert Box Validation")
	 @Test
	 public static void AlertBoxTEst() {
		 PopupsPageWEM pop = new PopupsPageWEM(driver);
		 MenuPageM.clickOnMoreOption();
		 pop.ClickOnPopup();
		 pop.ClickOnAlertBox();
	 }
	
	@Description("Validating Popup Page")
	@Feature("Popup Page")
	@Story("Confirm Box Validation")
	 @Test
	 public static void ConfirmBoxTEst() {
		 PopupsPageWEM pop = new PopupsPageWEM(driver);
		 MenuPageM.clickOnMoreOption();
		 pop.ClickOnPopup();
		 pop.ClickOnConfirmBoxButton();
	 }
	
	 @Description("Validating Popup Page")
	 @Feature("Popup Page")
	 @Story("Prompt Box Validation")
	 @Test
	 public static void PromptBoxTEst() {
		 PopupsPageWEM pop = new PopupsPageWEM(driver);
		 MenuPageM.clickOnMoreOption();
		 pop.ClickOnPopup();
		 pop.ClickOnPromptBoxButton();
	 }
}
