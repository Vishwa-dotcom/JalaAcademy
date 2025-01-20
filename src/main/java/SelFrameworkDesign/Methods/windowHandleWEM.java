package SelFrameworkDesign.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class windowHandleWEM extends BaseTest {
	

	public windowHandleWEM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@href='https://jalaacademy.com/']")
	WebElement Link1;
	
	@FindBy(xpath = "//a[text() ='JALA Technologies']")
	WebElement Link2;
	
	public void clickOnLinkOne() {
		Link1.click();
		
	}
	
	public void clickOnLinkTwo() {
		Link2.click();

		
	}
}
