package SelFrameworkDesign.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class clickUntilTextIsAvailable {
public static WebDriver driver;
	public static void main(String[] args) {
		clickUntilTextIsAvailable c = new clickUntilTextIsAvailable();
		c.clickUntilVisible();

	}

	/*
	 * public clickUntilTextIsAvailable(WebDriver driver) { this.driver = driver;
	 * PageFactory.initElements(driver, this); }
	 * 
	 * @FindBy(xpath = "//a[text() = 'Click Me']") WebElement clickMeLink;
	 * 
	 * public void clickOnLink() { clickMeLink.click(); }
	 */
	
	public void clickUntilVisible() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/81121/retry");
		WebElement clickMeLink =driver.findElement(By.xpath("//a[text() = 'Click Me']"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		String text = clickMeLink.getText();
		while(text.equals(text)) {
			clickMeLink.click();
			
			String text1 = clickMeLink.getText();
			if(text1.equals("Enough")) {
				break;
			}
			
		}
		
		driver.close();
		
	}
	
	
}
