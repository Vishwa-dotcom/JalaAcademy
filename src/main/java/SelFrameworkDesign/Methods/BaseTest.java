package SelFrameworkDesign.Methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.j2objc.annotations.Property;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	public static ExtentReports extent;
	public static ExtentTest test;
	private  String Email;
	private  String Password;

	public  String getEmail() {
		setEmail("training@jalaacademy.com");
		return Email;
	}

	public  void setEmail(String Email) {
		this.Email = Email; 
	}

	public  String getPassword() {
		setPassword("jobprogram");
		return Password;
	}

	public  void setPassword(String Password) {
		this.Password = Password;
	}

	public static void FileStream() {

		try {
			prop = new Properties();
			FileInputStream InputFile = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\SelFrameworkDesign\\Config\\config.properties");
			prop.load(InputFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@BeforeMethod
	public static void WebDriverSetup() {
		String Browser = System.getProperty("browser") != null ? System.getProperty("browser") : "Chrome";
		// String Browser = prop.getProperty("browser");
		if (Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// String url = prop.getProperty("url");
		driver.get("https://magnus.jalatechnologies.com/");
		BaseTest bs = new BaseTest();
		driver.findElement(By.id("UserName")).sendKeys(bs.getEmail());
		driver.findElement(By.id("Password")).sendKeys(bs.getPassword());
		driver.findElement(By.id("btnLogin")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}

	@AfterMethod
	public static void closeBrowser() {
		driver.findElement(By.xpath("//a[@href='/Account/SignOut']")).click();
		driver.close();
	}

	@AfterMethod
	public static void closeEntireBrowser() {

		driver.close();
	}

	public static void getScreenshot(String testCasename) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Vishwanath.Bidarolli\\neww\\eclipse-workspace\\SelFrameworkDesign\\reports"
				+ testCasename + ".png");
		FileUtils.copyFile(source, file);

	}

	@BeforeTest
	public static ExtentReports extenteReports() {

		String FilePath = System.getProperty("user.dir") + "//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(FilePath); // Is responsible for making configuration
		reporter.config().setReportName("JalaAcademmy Automation Test Report");
		reporter.config().setDocumentTitle("Automation Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vishwanath");
		return extent;
	}

	public static void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());

	}

	public static void onTestPass(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());
	}

}
