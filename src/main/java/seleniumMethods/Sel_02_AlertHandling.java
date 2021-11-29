package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_02_AlertHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		ElementUtil.getAlertTextAndAccept(driver);
//		//Import Alert interface which provides 4 methods
//		Alert alert = driver.switchTo().alert();
//		
//		String textString = alert.getText();
//		System.out.println(textString);
//		
//		alert.accept();
		
		driver.quit();
		
		
		

	}
	
	

}
