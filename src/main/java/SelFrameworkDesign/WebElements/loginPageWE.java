package SelFrameworkDesign.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SelFrameworkDesign.Methods.BaseTest;

public class loginPageWE extends BaseTest {

	/*
	 * public loginPageWE(WebDriver driver) {
	 * 
	 * BaseTest.driver = driver; PageFactory.initElements((SearchContext) this,
	 * driver); }
	 * 
	 * @FindBy(id = "UserName") public static WebElement emailTextBox;
	 * 
	 * @FindBy(id = "Password") static WebElement passwordTextBox;
	 * 
	 * @FindBy(id = "btnLogin") static WebElement loginButton;
	 */
	public static WebElement logOut() {
		return driver.findElement(By.xpath("//a[@href='/Account/SignOut']"));
	}
	
	public static String jalaWelcomePage() {
		return driver.findElement(By.xpath("//*[text() = 'Welcome to JALA Academy']")).getText();
	}
	
	public static String jalaText() {
		return driver.findElement(By.xpath("//*[text() = 'JALA Academy']")).getText();
	}
	
	public static WebElement emailTextBox() {
		return driver.findElement(By.id("UserName"));
	}

	public static WebElement passwordTextBox() {
		return driver.findElement(By.id("Password"));
	}

	public static WebElement loginButton() {
		return driver.findElement(By.id("btnLogin"));
	}

	public static WebElement forgotPassword() {
		return driver.findElement(By.xpath("//a[@href='/Account/ForgotPassword']"));
	}

	public static WebElement adminLogin() {
		return driver.findElement(By.xpath("//a[@href='/Account/AdminLogin']"));
	}

	public static WebElement rememberMe() {
		return driver.findElement(By.xpath("//label[@for='RememberMe']"));
	}
	public static WebElement mailBox() {
		return driver.findElement(By.xpath("//input[@id='UserName']/following-sibling::span[1]"));
	}
	
}
