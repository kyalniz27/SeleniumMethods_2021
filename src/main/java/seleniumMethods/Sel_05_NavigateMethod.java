package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_05_NavigateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//In Get method web driver will wait until the page is fully loaded
		driver.get("https://www.amazon.com");
		
		// Navigate provides back, forward, and refresh methods. It doesn't wait until the page is loaded
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		
	}

}
