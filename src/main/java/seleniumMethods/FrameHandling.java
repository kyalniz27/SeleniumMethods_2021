package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandling {
	
	public static WebElement element;
	public static WebDriver driver;
	public static String URL = "https://rahulshettyacademy.com/AutomationPractice/";

	public static void main(String[] args) {
		
		driver = ElementUtil.launchBrowser(driver, "firefox");
		ElementUtil.launchURL(driver, URL);
		ElementUtil.windowsDetails(driver, 10);
		
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		
		element = driver.findElement(By.xpath("//a[contains(text(), 'VIEW ALL')]"));
		System.out.println(element.isEnabled());
		
		//System.out.println(driver.findElement(By.cssSelector(".title-text")).getText());
	
		System.out.println(driver.getTitle());
		
		driver.close();
		
		//a[contains(text(), 'VIEW ALL')]
		
	}

}
