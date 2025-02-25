package SelFrameworkDesign.Tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findBrokenLinks();
	}
	
	public static void findBrokenLinks() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://www.amazon.in/");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("No of links" + links.size());
		 
		 List<String> newUrlList = new ArrayList<>();
		 for(WebElement e :links) {
			 
			String url = e.getAttribute("href");
			newUrlList.add(url);
			//getResponseCode(url);
		 }
		 long StratTime = System.currentTimeMillis();
		 newUrlList.parallelStream().forEach(e->getResponseCode(e));
		 long EndTime = System.currentTimeMillis();
		 System.out.println("Time Taken -->"+ (EndTime -StratTime) );
		 driver.quit();
	}
	
	@SuppressWarnings("deprecation")
	public static void getResponseCode(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpsURLConnection HttpsURLConnection = (HttpsURLConnection) url.openConnection();
			HttpsURLConnection.setConnectTimeout(5000);
			HttpsURLConnection.connect();
			if(HttpsURLConnection.getResponseCode()>=400) {
				System.out.println(linkUrl + "---->Is a Broken Link" + HttpsURLConnection.getResponseMessage());
			
			
		} 
		}
			catch (Exception e) {
			
		}
	}
}
	


