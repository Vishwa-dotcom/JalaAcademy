package SelFrameworkDesign.Methods;

import java.util.List;

import org.openqa.selenium.WebElement;

import SelFrameworkDesign.WebElements.homePageWE;

public class homePageM {

	public static void clickEmployeeLink() {
		homePageWE.employeeLink().click();
	}

	public static void clickCreateLink() {
		homePageWE.createEmployeeLink().click();
	}

	public static void enterFirstName(String FirstName) {
		homePageWE.firstName().sendKeys(FirstName);
	}

	public static void enterLastName(String LastName) {
		homePageWE.lastName().sendKeys(LastName);
	}

	public static void enterEmail(String Email) {
		homePageWE.emailID().sendKeys(Email);
	}
	
	public static void enterMobileNo(String MobNo) {
		homePageWE.mobileNumber().sendKeys(MobNo);
	}

	public static void DOB(String Date) {
		homePageWE.dateOfBirth().sendKeys(Date);
	}

	public static void genderSelectMale() {
		homePageWE.genderRadioButtonMale();
	}

	public static void genderSelectFeMale() {
		homePageWE.genderRadioButtonFeMale();
	}

	public static void selectCountry() {
		homePageWE.selectCountry("India");
	}

	public static void addAddress(CharSequence Address) {
		homePageWE.adressFields().sendKeys(Address);
	}

	public static void selectCity() {
		homePageWE.selectCity("Chennai");
	}

	public static void selectSkill() {
		homePageWE.skill().click();

	}

	public static void clickSave() {
		homePageWE.saveButton().click();
	}

}
