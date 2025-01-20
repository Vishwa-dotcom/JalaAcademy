package SelFrameworkDesign.Methods;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FramesTestWEM extends PopupsPageWEM {
	
	
	public FramesTestWEM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@href='/Home/Iframe']")
	WebElement iFrameButton;
	
	
	@FindBy(xpath = "//h3[text() = 'Frame Two']")
	WebElement Frame;
	
	
	@FindBy(xpath = "//a[@class='sidebar-toggle']")
	WebElement SideBarButton;
	
	public void scrollToiFrameOption() {
		// Create JavascriptExecutorString
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the element
        js.executeScript("arguments[0].scrollIntoView(true);", iFrameButton);
		
	}
	
	public void scrollToFrameOption() {
		// Create JavascriptExecutorString
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the element
        js.executeScript("arguments[0].scrollIntoView(true);", Frame);
		
	}
	
	
	public void clickOniFrameButton() {
		boolean iFrameButtonIsDisplyaed = iFrameButton.isDisplayed();
		Assert.assertTrue(iFrameButtonIsDisplyaed, "iFrameButton Is not Displyaed");
		iFrameButton.click();
	}
	
	public void clickOnSideBar() {
		boolean side = SideBarButton.isDisplayed();
		Assert.assertTrue(side, "SideBarButton is not displayed");
		SideBarButton.click();
	}
	
	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0, 500)");
	}
	
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0, -500)");
	}
	
	public void switchTOFrame(String index) {
		driver.switchTo().frame(index);
	}
	
	public void switchTODefaultContent() {
		driver.switchTo().defaultContent();
	}

}
