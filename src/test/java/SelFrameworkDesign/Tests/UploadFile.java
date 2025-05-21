package SelFrameworkDesign.Tests;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	
	protected static WebDriver driver;
	public UploadFile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//label[contains(@for, 'files-input')]")
	WebElement Upload;
	
	public void ClickUpload() {
		Upload.click();
	}
	
	
	public static void main(String[] args) {
		UploadFile upload = new UploadFile(driver);
		try {
			upload.upload();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void upload() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.get("https://www.file.io/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//label[contains(@for, 'files-input')]")).click();
		StringSelection path = new StringSelection("C:\\Users\\Vishwanath.Bidarolli\\Downloads\\download.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Robot rb = new Robot();
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
		
	}

}
