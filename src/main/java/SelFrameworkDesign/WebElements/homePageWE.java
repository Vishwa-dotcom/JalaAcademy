package SelFrameworkDesign.WebElements;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.MenuPageM;

public class homePageWE extends BaseTest {
	
	public static Optional<WebElement> getMoreList(String Option) throws Exception {
		
		
		List<WebElement> MoreOptionList = driver.findElements(By.xpath("//li[@class='treeview menu-open']"));
		Thread.sleep(2000);
		
		Optional<WebElement> MoreOptions = MoreOptionList.stream().filter(e->e.getText().equalsIgnoreCase(Option))//parallel().filter(e->e.getText().equalsIgnoreCase(Option))
		.findFirst();
		return MoreOptions;
	}

	public static WebElement employeeLink() {
		return driver.findElement(By.xpath("//li[@class='treeview']/a/i[@class='fa fa-users']"));

	}

	public static WebElement createEmployeeLink() {
		return driver.findElement(By.xpath("//a[@href='/Employee/Create']"));

	}

	public static WebElement searchEmployeeLink() {
		return driver.findElement(By.xpath("//a[@href='/Employee/Search']"));

	}

	public static List<WebElement> moreOptions() {
		List<WebElement> MoreOptions = driver.findElements(By.xpath("class=\"treeview menu-open\""));
		return MoreOptions;
	}

	public static WebElement firstName() {
		return driver.findElement(By.id("FirstName"));

	}

	public static WebElement lastName() {
		return driver.findElement(By.id("LastName"));

	}

	public static WebElement emailID() {
		return driver.findElement(By.id("EmailId"));

	}

	public static WebElement mobileNumber() {
		return driver.findElement(By.id("MobileNo"));

	}

	public static WebElement dateOfBirth() {
		return driver.findElement(By.id("DOB"));

	}

	public static WebElement genderRadioButtonMale() {
		return driver.findElement(By.xpath("//input[@value='M']"));

	}

	public static WebElement genderRadioButtonFeMale() {
		return driver.findElement(By.xpath("//input[@value='F']"));

	}

	public static WebElement adressFields() {
		return driver.findElement(By.id("Address"));

	}

	public static void selectCountry(String SendCountry) {
		WebElement countrylist = driver.findElement(By.id("CountryId"));
		countrylist.click();
		Select Country = new Select(countrylist);
		Country.selectByVisibleText(SendCountry);

	}

	public static void selectCity(String SendCity) {
		WebElement citylist = driver.findElement(By.id("CityId"));
		citylist.click();
		Select City = new Select(citylist);
		City.selectByVisibleText(SendCity);

	}

	public static WebElement skill() {
		return driver.findElement(By.xpath("//input[@id='chkSkill_1']"));
	}

	public static WebElement saveButton() {
		return driver.findElement(By.xpath("//*[text() = 'Save']"));
	}

	public static WebElement cancelButton() {
		return driver.findElement(By.xpath("//*[text() = 'Cancel']"));
	}
}
