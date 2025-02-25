package SelFrameworkDesign.Tests;

import org.testng.annotations.Test;

import SelFrameworkDesign.Methods.ActionsWEM;
import SelFrameworkDesign.Methods.BaseTest;

public class actionsTest extends BaseTest {
	
	@Test
	public static void actionTest() throws Exception  {
		
		ActionsWEM ActionsWEM = new ActionsWEM(driver);
		ActionsWEM.moveAndClinkOnMore();
		ActionsWEM.moveToMenuLink();
		Thread.sleep(5000);
	}
}
