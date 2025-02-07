package SelFrameworkDesign.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class windowHandleWEM extends BaseTest {
	public Actions act;

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
	
	public void rightClickOnLinkOne() {
		Actions act = new Actions(driver);
		act.contextClick(Link1).perform();
		
	}
	
	public void clickOnLinkTwo() {
		Link2.click();

		
	}
	
	public void rightClickOnLinkTwo() {
		act.contextClick(Link2).perform();

		
	}
	
	public void movetoLinkOne() {
		Actions act = new Actions(driver);
		act.moveToElement(Link1).perform();
		act.doubleClick(Link1).perform();
	}
}
