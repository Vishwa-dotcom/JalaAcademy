package SelFrameworkDesign.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SelFrameworkDesign.Methods.BaseTest;

public class menuPageWE extends BaseTest {
						//Single Menu Options?//
	public static WebElement moreDropDown() {
		return driver.findElement(By.xpath("//i[@class='fa fa-th-list']/parent::a"));
	}

	public static WebElement menuLink() {
		return driver.findElement(By.xpath("//a[@href='/Home/Menu']"));
	}

	public static WebElement singleMenus() {
		return driver.findElement(By.xpath("//*[text() = 'Single Menus']"));
	}

	public static WebElement subMenus() {
		return driver.findElement(By.xpath("//*[text() = 'Sub Menus']"));
	}

	public static WebElement singleMenuTesting() {
		return driver.findElement(By.xpath("//a[@id='b1']"));
	}

	public static WebElement singleMenuTestingText() {
		return driver.findElement(By.xpath("//*[text()='You Have Selected Testing Menu Option.']"));
	}

	public static WebElement singleMenuJavaText() {
		return driver.findElement(By.xpath("//*[text()='You Have Selected Java Menu Option.']"));
	}

	public static WebElement singleMenuJava() {
		return driver.findElement(By.xpath("//a[@id='b2']"));
	}
	public static WebElement singleMenuNet() {
		return driver.findElement(By.xpath("//a[@id='b3']"));
	}
	
	public static WebElement singleMenuNetText() {
		return driver.findElement(By.xpath("//*[text()='You Have Selected .Net Menu Option.']"));
	}
	
	public static WebElement singleMenuDataBase() {
		return driver.findElement(By.xpath("//a[@id='b4']"));
	}
	public static WebElement singleMenuDataBaseText() {
		return driver.findElement(By.xpath("//*[text()='You Have Selected Data base Menu Option.']"));
	}
	
								//Sub Menu Options?//
	
	public  static WebElement subMenu() {
		return driver.findElement(By.xpath("//a[text() = 'Sub Menus']"));
		
	}
	
	public static WebElement subMenuTestingOption() {
		return driver.findElement(By.xpath("//a[text() = 'Testing' and @class = 'dropbtn']"));
	}
	
	public static WebElement subMenuTestingSeleniumOption() {
		return driver.findElement(By.xpath("//a[text() = 'Selenium']"));
	}
	
	public static WebElement subMenuTestingSeleniumOptionText() {
		return driver.findElement(By.xpath("//span[text() = 'You Have Selected Selenium Menu Option.']"));
	}
	
	public static WebElement subMenuTestingManualTestingOption() {
		return driver.findElement(By.xpath("//a[text() = 'DB Testing']"));
	}
	
	public static WebElement subMenuTestingManualTestingOptionText() {
		return driver.findElement(By.xpath("//span[text() = 'You Have Selected Manual Testing Menu Option.']"));
	}
	
	
	
	public static WebElement subMenuTestingUnitTestingOption() {
		return driver.findElement(By.xpath("//a[text() = 'Unit Testing']"));
	}
}
