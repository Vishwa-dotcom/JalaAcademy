package Test;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDropDown {
public static WebDriver driver;
	public static void main(String[] args) {
		handleDynamicDropDown();
	}
	
	public static void handleDynamicDropDown() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/14090?retry=1");
		WebElement generate = driver.findElement(By.id("generate"));
		generate.click();
		List<WebElement> listOfele = driver.findElements(By.xpath("//td[@class='task']"));
		String dropC = "//td[text() ='Select word that starts with letter: C']/parent::tr/td[@class='value']";
		
		WebElement drropDownC = driver.findElement(By.xpath(dropC));
		Select sel = new Select(drropDownC);
		String Text = "Select word that starts with letter: C";
		for(WebElement e : listOfele) {
			String text = e.getText();
			if(text.equalsIgnoreCase(Text)) 
			{
				sel.selectByValue("Cloud");
			}
		}
		// Stream<WebElement> option = listOfele.stream().filter(e->e.getText());
	}

}
