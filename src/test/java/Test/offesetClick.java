package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class offesetClick {
public static WebDriver driver;
	
public static void main(String[] args) throws Exception {
	offseetClick();
}

	public static void offseetClick() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/41038?retry=1");
		WebElement button = driver.findElement(By.xpath("//button[text() = 'Click into my right half']"));
		Actions act = new Actions(driver);
		act.moveToElement(button, 50, 0).click().perform();
		Thread.sleep(4000);
		driver.close();
	}
}
