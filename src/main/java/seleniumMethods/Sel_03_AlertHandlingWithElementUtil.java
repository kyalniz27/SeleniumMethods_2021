package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_03_AlertHandlingWithElementUtil {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		String  uRLString = "https://rahulshettyacademy.com/AutomationPractice/";
		
		By textBox = By.xpath("//input[@id='name']");
		By clickBTN = By.xpath("//input[@id='alertbtn']");
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		ElementUtil.launchURL(driver, uRLString);
		
		ElementUtil.sendKeysMethod(driver, textBox, "Mustafa");
		
		ElementUtil.clickOnMethod(driver, clickBTN);
		
		ElementUtil.getAlertTextAndAccept(driver);
		
		ElementUtil.closeBrowser(driver);
		
		

	}

}
