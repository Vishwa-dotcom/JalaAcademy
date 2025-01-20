package SelFrameworkDesign.Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SelFrameworkDesign.Allure.AllureLiestner;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.windowHandleWEM;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners(AllureLiestner.class)
public class windowHandleTest extends BaseTest {

	
	public static List<String> list ;
	public static String MainPage;
	
	@Description("Window Handle")
	@Feature("Window Handle")
	@Story("windowHandleTest")
	@Test
	public static void windowHandleTest() {
		windowHandleWEM windowHandleWEM = new windowHandleWEM(driver);
		MainPage = driver.getWindowHandle();
		windowHandleWEM.clickOnLinkOne();
		windowHandleWEM.clickOnLinkTwo();
		Set<String> windows = driver.getWindowHandles();
		list = new ArrayList<>(windows);
		getRightWindow("Magnus", list);
		closeAllOtherWindows();
	}
	
	@Step("Switching to the Right window : {0}")
	public static boolean getRightWindow(String window, List<String> list) {
		for(String e : list) {
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(window)) {
				System.out.println("Landed to right page...");
				return true;
			}
			
		}
		return false;
		
	}
	
	public static void closeAllOtherWindows() {
		for(String e : list) {
			if(!e.contains("Magnus")) {
				driver.switchTo().window(e).close();
		}
		
		
		}
	}
}
