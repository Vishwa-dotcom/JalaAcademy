package SelFrameworkDesign.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SelFrameworkDesign.Allure.AllureLiestner;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.homePageM;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners(AllureLiestner.class)
public class createEmployeeDataProviderTest extends BaseTest {
	
	@Description("Creating Employee Hash Map ")
	@Feature("Employee")
	@Severity(SeverityLevel.NORMAL)
	@Story("Creating and validating Employee")
	@Test
	public static void createEmployee() {
		homePageM.clickEmployeeLink();
		homePageM.clickCreateLink();
		homePageM.enterFirstName("FirstName");
		homePageM.enterLastName("LastName");
		homePageM.enterEmail("Test@test.com");
		homePageM.enterMobileNo("1234567890");
		homePageM.DOB("11/11/1997");
		homePageM.genderSelectFeMale();
		homePageM.addAddress("Test Street");
		homePageM.selectCountry();
		homePageM.selectCity();
		homePageM.selectSkill();
		homePageM.clickSave();
	}
}


