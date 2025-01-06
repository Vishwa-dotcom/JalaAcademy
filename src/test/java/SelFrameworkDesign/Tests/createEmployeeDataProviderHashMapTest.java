package SelFrameworkDesign.Tests;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.homePageM;




public class createEmployeeDataProviderHashMapTest extends BaseTest {

	@Test(dataProvider = "getData")
	public static void createEmployee(HashMap<String, String> data) {
		homePageM.clickEmployeeLink();
		homePageM.clickCreateLink();
		homePageM.enterFirstName(data.get("FirstName"));
		homePageM.enterLastName(data.get("LastName"));
		homePageM.enterEmail(data.get("Email"));
		homePageM.enterMobileNo(data.get("MobNo"));
		homePageM.DOB(data.get("DOB"));
		homePageM.genderSelectFeMale();
		homePageM.addAddress(data.get("Address"));
		homePageM.selectCountry();
		homePageM.selectCity();
		homePageM.selectSkill();
		homePageM.clickSave();
		//Listners.test.log(Status.PASS, "Create Employee completed");
	}
	@DataProvider
	public static Object[][] getData() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("FirstName", "VishwaHAsh");
		map.put("LastName", "B");
		map.put("Email", "Test@test.com");
		map.put("MobNo", "1234567890");
		map.put("DOB", "11/11/1997");
		map.put("Address", "Test Street");
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("FirstName", "SadaHash");
		map1.put("LastName", "B");
		map1.put("Email", "Test@test.com");
		map1.put("MobNo", "9876543212");
		map1.put("DOB", "10/10/1978");
		map1.put("Address", "Test Street");
		
		return new Object [][] {{map}, {map1}};
	}


}






