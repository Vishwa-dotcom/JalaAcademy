package SelFrameworkDesign.WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import SelFrameworkDesign.Methods.BaseTest;

public class collapsePageWE extends BaseTest  {

	public static WebDriver driver;
	public collapsePageWE(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	PageFactory Factory = new PageFactory();
	/////////////////////////////////////////////////////SingleCollapse///////////////////////////////////////////////////
	@FindBy(xpath ="//a[@href='/Home/Collapse']")
	WebElement ClickOnCollapse;
	
	@FindBy(xpath = " //a[text() = 'Single Collapse']")
	WebElement SingleCollapse;
	
	@FindBy(xpath = " //div[@id='headingOne']")
	WebElement KnowYourGoal;
	
	@FindBy(id = "collapseOne")
	WebElement KnowYourGoalOptio;
	
	@FindBy(xpath = "//p[text() = 'What are your priorities for the day? Make a list of your priorities and plan your day. The tasks of the day must be outlined with the most important and urgent ones on top.']")
	WebElement FirstOption;
	
	@FindBy(xpath = "//a[@href='/Home/Collapse']")
	WebElement CollapsibleContent;
	
	
	public  void clickOnCollapsibleContent() {
		wait.until(ExpectedConditions.visibilityOf(CollapsibleContent));
		boolean CollapsibleContentIsDisplayed = CollapsibleContent.isDisplayed();
		
		Assert.assertTrue(CollapsibleContentIsDisplayed, "CollapsibleContentIsDisplayed is not Displyed");
		CollapsibleContent.click();
		
		
	}
	
	public  static void clickOnCollapsibleContent1() {
		//wait.until(ExpectedConditions.visibilityOf(ClickOnCollapse));
		driver.findElement(By.xpath("//a[@href='/Home/Collapse']")).click();
		
//		boolean CollapsibleContentIsDisplayed = CollapsibleContent.isDisplayed();
//		wait.until(ExpectedConditions.visibilityOf(CollapsibleContent));
//		Assert.assertTrue(CollapsibleContentIsDisplayed, "CollapsibleContentIsDisplayed is not Displyed");
//		CollapsibleContent.click();
		
		
	}
	public  void  clickOnCollapse() {
		boolean SingleCollapseIsDisplayed = ClickOnCollapse.isDisplayed();
		Assert.assertTrue(SingleCollapseIsDisplayed, "SingleCollapseIsDisplayed is not Displyed");
		ClickOnCollapse.click();
		
		
	}
	
	public  void clickOnSingleCollapse() {
		boolean SingleCollapseIsDisplayed = SingleCollapse.isDisplayed();
		Assert.assertTrue(SingleCollapseIsDisplayed, "SingleCollapseIsDisplayed is not Displyed");
		SingleCollapse.click();
		
		
	}
	
	public void clickOnKnowYouGoal() {
		boolean KnowYourGoalIsDisplyed =  KnowYourGoal.isDisplayed();
		Assert.assertTrue(KnowYourGoalIsDisplyed, "KnowYourGoalIsDisplyed is not Displyed");
		KnowYourGoal.click();
	}
	
	public void getTextofFirst() {
		String textExpected = FirstOption.getText();
		String Actual = "What are your priorities for the day? Make a list of your priorities and plan your day. The tasks of the day must be outlined with the most important and urgent ones on top.";
		Assert.assertEquals(textExpected, Actual);
	}
	
	
	///////////////////////////////////////////////MultipleCollapse/////////////////////////////////////////////////
	
	@FindBy(xpath = "//a[text() ='Multiple Collapse']")
	WebElement MultipleCollapse;
	
	@FindBy(xpath ="//div[@role='tablist' and @aria-multiselectable='true']")
	List<WebElement> MultipleCollapseOptions;
	
	@FindBy(id= "collapseFive")
	List<WebElement> LearnAnythingOptions;
	
	public void clickOnMultipleCollapse() {
		boolean MultipleCollapseIsDisplayed = MultipleCollapse.isDisplayed();
		Assert.assertTrue(MultipleCollapseIsDisplayed, "MultipleCollapse is Not displayed");
		MultipleCollapse.click();
		
	}
	
	public void clickOnMultipleCollapseOptions(String OptionToSelect) {
		MultipleCollapseOptions.stream().filter(e->e.getText().equalsIgnoreCase(OptionToSelect))
		.findFirst()
		.ifPresent(e->e.click());
	}
	
	public void getLearnAnythingOptions(String LearnAnythingOption) {
		boolean LearnOption = LearnAnythingOptions.stream().filter(e->e.getText().equals(LearnAnythingOption)).findFirst().isPresent();
		Assert.assertTrue(LearnOption);
	}
	
	
	
	
}
