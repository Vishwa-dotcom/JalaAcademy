package SelFrameworkDesign.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.MenuPageM;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HeadlessTest {
	
	@Test
	public static void headlessTestSetup() {
		System.out.println("Headless Test : Started");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		DesiredCapabilities capab = new DesiredCapabilities();
		capab.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capab);
		WebDriver headless= new ChromeDriver(options);
		headless.get("https://magnus.jalatechnologies.com/");
		BaseTest bs = new BaseTest();
		headless.findElement(By.id("UserName")).sendKeys(bs.getEmail());
		headless.findElement(By.id("Password")).sendKeys(bs.getPassword());
		headless.findElement(By.id("btnLogin")).click();
		headless.close();
		System.out.println("Headless Test : Finished");
		
		//SinleMenuTest();
		//subMenuTest();
		
	}
	
public static void SinleMenuTest() {
		
		MenuPageM.clickOnMoreOption();
		MenuPageM.clickOnMenuOption();
		MenuPageM.clickOnSingleMenu();
		MenuPageM.clickOnSingleMenuTesting();
		MenuPageM.getTextSingleMenuTesting();
				
	}
	
	
	public static void subMenuTest() {
		MenuPageM.clickOnMoreOption();
		MenuPageM.clickOnMenuOption();
		MenuPageM.clickOnSubMenu();
		MenuPageM.clickOnSubMenuTesting();
		MenuPageM.clickOnSubMenuTestingSelenium();
		MenuPageM.SubMenuTestingSeleniumGetText();
	}
	


}
