package SelFrameworkDesign.Methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	public static ExtentReports extent;
	public static ExtentTest test;
	private String Email;
	private String Password;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public String getEmail() {
		setEmail("training@jalaacademy.com");
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getPassword() {
		setPassword("jobprogram");
		return Password;
	}

	public void setPassword(String Password) {
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

	@Step("Launcing the Browser ")
	@BeforeMethod
	public static WebDriver WebDriverSetup() {
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
		tdriver.set(driver);
		return driver;
	}

	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

	@Parameters({ "browser", "CrossBrowser" })
	// @BeforeMethod
	public static void crossBrowserSetUp(String browser, String CrossBrowser) throws Exception {
		if (CrossBrowser.equals("Yes")) {

			DesiredCapabilities cap = new DesiredCapabilities();

			if (browser.equalsIgnoreCase("chrome")) {
				cap.setBrowserName("chrome");
				driver = new RemoteWebDriver(new URI("http://192.168.93.149:4444").toURL(), cap);

			}

			if (browser.equalsIgnoreCase("firefox")) {
				cap.setBrowserName("firefox");
				driver = new RemoteWebDriver(new URI("http://192.168.93.149:4444").toURL(), cap);

			}

			if (browser.equalsIgnoreCase("edge")) {
				cap.setBrowserName("edge");
				driver = new RemoteWebDriver(new URI("http://192.168.93.149:4444").toURL(), cap);

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
	}
	//Headless Driver SetUp
	public static void headlessTestSetup() {
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
		
		
	}

	@Step("Closing the Browser")
	@AfterMethod
	public static void closeBrowser() {
		driver.findElement(By.xpath("//a[@href='/Account/SignOut']")).click();
		driver.close();
	}

	@Step("Closing all the windows and the Browser")
	@AfterMethod
	public static void closeEntireBrowser() {

		driver.quit();
	}

	@Attachment
	public static void getScreenshot(String testCasename) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Vishwanath.Bidarolli\\neww\\eclipse-workspace\\SelFrameworkDesign\\reports"
				+ testCasename + ".png");
		FileUtils.copyFile(source, file);

	}

	

}
