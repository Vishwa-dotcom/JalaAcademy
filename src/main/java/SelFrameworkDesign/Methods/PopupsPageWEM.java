package SelFrameworkDesign.Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class PopupsPageWEM extends BaseTest  {

	public WebDriver driver;
	
	public  PopupsPageWEM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public PopupsPageWEM() {
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = "//*[text() = ' Popups']")
	WebElement PupupBtn;
	///InWindow PopUp elements///////////////////////////////////////
	@FindBy(id = "btn-six")
	WebElement InWindowPupupBtn;
	
	@FindBy(xpath = "//div[@class='modal-body']/preceding-sibling::div")
	WebElement InWindowPopUpOneHeading;
	
	@FindBy(xpath = "//div[@class='modal-body']")
	WebElement InWindowPopUpOneMessage;
	
	@FindBy(xpath = "//button[text() = 'Close']")
	WebElement InWindowPopUpOneCloseBtn;
	
	
	///Alert Box PopUp elements//////////////////////////////////////////
	
	@FindBy(xpath = "//input[@value='Alert Box']")
	WebElement AlertBoxButton;
	
	
	///Confirm Box PopUp elements//////////////////////////////////////////
	@FindBy(xpath = "//input[@value='Confirm Box']")
	WebElement ConfirmBoxButton;
	
	///Prompt Box PopUp elements//////////////////////////////////////////
	@FindBy(id = "promptBtn")
	WebElement PromptBoxButton;
	
	@Step("Click on pop up")
	public  void ClickOnPopup() {
		wait.until(ExpectedConditions.visibilityOf(PupupBtn));
		SoftAssert sa = new SoftAssert();
		boolean InWindowPupupBtnIsDiplayed =  PupupBtn.isDisplayed();
		Assert.assertTrue(InWindowPupupBtnIsDiplayed);
		sa.assertAll();
		PupupBtn.click();
		
	}
	
	public  void ClickOnWindowPopup() {
		boolean InWindowPupupBtnIsDiplayed =  InWindowPupupBtn.isDisplayed();
		Assert.assertTrue(InWindowPupupBtnIsDiplayed);
		InWindowPupupBtn.click();
		
	}
	
	public void GetTextInWindowPopUpOneHeading() {
	//	wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(InWindowPopUpOneHeading));
		boolean GetTextInWindowPopUpOneHeadingIsDisplayed = InWindowPopUpOneHeading.isDisplayed();
		Assert.assertTrue(GetTextInWindowPopUpOneHeadingIsDisplayed, "GetTextInWindowPopUpOneHeadingIsDisplayed Is Not Displayed");
		String ExpectedText = InWindowPopUpOneHeading.getText();
		String ActualText = "Popup One";
		Assert.assertEquals(ActualText, ExpectedText);
	}
	
	public void GetTextInWindowPopUpOneMessage() {
		//wait.until(ExpectedConditions.visibilityOf(InWindowPopUpOneMessage));
		String ExpectedText = InWindowPopUpOneMessage.getText();
		String ActualText = "Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.";
		Assert.assertEquals(ActualText, ExpectedText);
	}
	
	public void ClickOnInWindowPopUpOneCloseBtn() {
		boolean InWindowPopUpOneCloseBtnIsDiplayed = InWindowPopUpOneCloseBtn.isDisplayed();
		//Assert.assertTrue(InWindowPopUpOneCloseBtnIsDiplayed, "InWindowPopUpOneCloseBtnIsDiplayed Is Not diplayed");
		//driver.switchTo().alert().dismiss();
		InWindowPopUpOneCloseBtn.click();
	}
	
	public void ClickOnAlertBox() {
		boolean AlertBoxButtonIsDisplayed = AlertBoxButton.isDisplayed();
		Assert.assertTrue(AlertBoxButtonIsDisplayed, "AlertBoxButtonIsDisplayed Is not displyed");
		AlertBoxButton.click();
		driver.switchTo().alert().accept();
	}
	
	public void ClickOnConfirmBoxButton() {
		boolean ConfirmBoxButtonIsDisplayed = ConfirmBoxButton.isDisplayed();
		Assert.assertTrue(ConfirmBoxButtonIsDisplayed, "ConfirmBoxButtonIsDisplayed Is not Displyed");
		ConfirmBoxButton.click();
		driver.switchTo().alert().accept();
		
	}
	
	public void ClickOnPromptBoxButton() {
		boolean PromptBoxButtonIsDisplayed = PromptBoxButton.isDisplayed();
		Assert.assertTrue(PromptBoxButtonIsDisplayed, "PromptBoxButtonIsDisplayed is not displyed");
		PromptBoxButton.click();
		driver.switchTo().alert().dismiss();
	}
	
	
	
}
