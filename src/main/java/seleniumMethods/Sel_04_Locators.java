package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_04_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		By homePage = By.linkText("Home");
		ElementUtil.getElement(driver, homePage).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		
		
		

	}

}
