package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enterClick {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enterClick();
	}
	
	public static void enterClick() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/41041/retry");
		WebElement input = driver.findElement(By.id("resulttext"));
		input.click();
		input.sendKeys("{Click}");
		driver.close();
	}

}
