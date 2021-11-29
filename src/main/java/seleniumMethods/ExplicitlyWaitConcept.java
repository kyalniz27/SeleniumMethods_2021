package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
				
		By email = By.name("email");
		By pass = By.name("pass");
		By loginBtn = By.name("login");
		
		explicitlyWaitGetElement(driver, 10, email).sendKeys("test1234@gmail.com");
		explicitlyWaitGetElement(driver, 10, pass).sendKeys("test1234");
		explicitlyWaitGetElement(driver, 10, loginBtn).click();
		
		System.out.println(driver.getTitle());
		

	}
	
	
	public static WebElement explicitlyWaitGetElement(WebDriver driver, int time, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
	
	

}
