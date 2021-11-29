package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_10_TableHandling {
	
	static WebDriver driver;
	static String URL = "https://rahulshettyacademy.com/AutomationPractice/";
	static By tableHeaders = By.xpath("//table/tbody/tr/th");
	
	public static void main(String[] args) {
		
		driver = ElementUtil.launchBrowser(driver, "firefox");
		ElementUtil.launchURL(driver, URL);
		ElementUtil.windowsDetails(driver, 10);
		
		ElementUtil.findElements(driver, tableHeaders);
	
		ElementUtil.closeBrowser(driver);
		
		
		
	}

}
