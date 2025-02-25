package SelFrameworkDesign.Methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsWEM {

	public WebDriver driver;

	public ActionsWEM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/Home/Menu']")
	private WebElement menuLink;

	@FindBy(xpath = "//*[text() = 'Single Menus']")
	private WebElement SingleMenu;

	@FindBy(xpath = "//i[@class='fa fa-th-list']/parent::a")
	private WebElement MoreOption;

	public void moveToMenuLink() {

		Actions act = new Actions(driver);
		act.moveToElement(menuLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		act.contextClick(MoreOption).perform();
	}

	public void moveAndClinkOnMore() {
		Actions act = new Actions(driver);
		act.moveToElement(MoreOption).click().perform();
	}
}
