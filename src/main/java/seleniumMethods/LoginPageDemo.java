package seleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageDemo {
	
	public static WebDriver driver;
	static By emailBy = By.id("email");
	static By passBy = By.name("pass");
	static By clBy = By.tagName("button");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		ElementUtil.getElement(driver, emailBy).sendKeys("kyalniz27@gmail.com");
		ElementUtil.getElement(driver, passBy).sendKeys("27mart85");
		ElementUtil.getElement(driver, clBy).click();
		
		
		
		
		
		
		
		

	}

}
