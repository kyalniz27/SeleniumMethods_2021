package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessModeConcept {
	
	public static void main(String[] args) {
//		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new HtmlUnitDriver();
		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		System.out.println(driver.getTitle());
//		
//		driver.close();
		
		//NOTE: You can also firefoxoptions or chromeoptions
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions cc = new ChromeOptions();
		cc.addArguments("--headless");
		WebDriver driver = new ChromeDriver(cc);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}
	
	

}
