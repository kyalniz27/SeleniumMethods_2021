package seleniumMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		System.out.println("Total links are: " + linkList.size());

		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();

			// Ignoring broken links
//			if (!text.isEmpty()) {
//				System.out.println(text);
//			}
			
			if(text.equals("Home")) {
				linkList.get(i).click();
				break;
			}

		}

		driver.close();

	}

}
