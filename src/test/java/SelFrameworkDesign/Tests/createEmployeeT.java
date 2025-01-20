package SelFrameworkDesign.Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SelFrameworkDesign.Allure.AllureLiestner;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.homePageM;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Listeners(AllureLiestner.class)
public class createEmployeeT extends BaseTest {
	@Description("Creating Employee using object ")
	@Feature("Employee")
	@Story("Creating and validating Employee")
	@Test(dataProvider = "getData")
	public static void createEmployee(String FirstName, String LastName, String Email, String MobNo, String DOB, String Address) {
		homePageM.clickEmployeeLink();
		homePageM.clickCreateLink();
		homePageM.enterFirstName(FirstName);
		homePageM.enterLastName(LastName);
		homePageM.enterEmail(Email);
		homePageM.enterMobileNo(MobNo);
		homePageM.DOB(DOB);
		homePageM.genderSelectFeMale();
		homePageM.addAddress(Address);
		homePageM.selectCountry();
		homePageM.selectCity();
		homePageM.selectSkill();
		homePageM.clickSave();
	}
	
	@DataProvider
	public static Object[][] getData() {
		return new Object [][] {{"Vishwa", "B", "Test@test.com","1234567890", "11/11/1997", "Test Street"}, 
			{"Sada", "B", "Test@test.com","9876543212", "10/10/1978", "Test Street"}};
	}
	
}


