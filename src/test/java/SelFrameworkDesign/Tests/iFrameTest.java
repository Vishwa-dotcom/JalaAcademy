package SelFrameworkDesign.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SelFrameworkDesign.Allure.AllureLiestner;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.FramesTestWEM;
import SelFrameworkDesign.Methods.MenuPageM;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Listeners(AllureLiestner.class)
public class iFrameTest extends BaseTest {
	@Description("Validating iFrames ")
	@Feature("iFrames")
	@Story("iFrames Test")
	@Test
	public static void frameTwoTest() {
		popUpPageTest popUpPageTest = new popUpPageTest();
		MenuPageM.clickOnMoreOption();
		FramesTestWEM FramesTestWEM =new FramesTestWEM(driver);
		FramesTestWEM.scrollToiFrameOption();
		FramesTestWEM.clickOniFrameButton();
		FramesTestWEM.scrollToFrameOption();
		FramesTestWEM.switchTOFrame("iframe2");
		FramesTestWEM.clickOnSideBar();
		FramesTestWEM.scrolldown();
		popUpPageTest.InWindowPopupTest();
		
	}

}
