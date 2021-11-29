package seleniumMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementUtil {

	/**
	 * Alert handling
	 * 
	 * @param driver
	 * @return
	 */
	public static String getAlertTextAndAccept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

		return text;

	}

	/**
	 * Launch browser
	 * 
	 * @param driver
	 * @param browserName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println(browserName + " is not available.");
		}

		return driver;

	}

	/**
	 * Launch URL
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);

	}

	/**
	 * Get Element
	 * 
	 * @param driver
	 * @param element
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;

	}

	/**
	 * Get page title
	 * 
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver) {

		return driver.getTitle();
	}

	/**
	 * Get text method
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String getText(WebDriver driver, By locator) {
		return driver.findElement(locator).getText();
	}

	/**
	 * Click on method
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void clickOnMethod(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * Send text method
	 * 
	 * @param driver
	 * @param locator
	 * @param text
	 */
	public static void sendKeysMethod(WebDriver driver, By locator, String text) {

		driver.findElement(locator).sendKeys(text);

	}

	/**
	 * Close browser method
	 * 
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}

	/**
	 * Get maximize, delete cookies and Implicitly Wait
	 * 
	 * @param driver
	 * @param time
	 */
	public static void windowsDetails(WebDriver driver, int time) {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	/**
	 * Page load timeout
	 * 
	 * @param driver
	 * @param time
	 */
	public static void waitPageLoad(WebDriver driver, int time) {
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}

	/**
	 * Select from drop down menu by text
	 * 
	 * @param driver
	 * @param locator
	 * @param text
	 */
	public static void selectByVisibleText(WebDriver driver, By locator, String text) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	/**
	 * Select from drop down menu by index
	 * 
	 * @param driver
	 * @param locator
	 * @param text
	 */
	public static void selectByIndex(WebDriver driver, By locator, int index) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	/**
	 * Select from drop down menu by value
	 * 
	 * @param driver
	 * @param locator
	 * @param text
	 */
	public static void selectByValue(WebDriver driver, By locator, String value) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		select.selectByValue(value);

	}

	/**
	 * To check drop down is multiple
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static boolean isDropDownMultiple(WebDriver driver, By locator) {

		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		return select.isMultiple();
	}

	/**
	 * Select single value from drop down menu
	 * 
	 * @param driver
	 * @param value
	 */
	public static void selectSingleDropDown(WebDriver driver, String value, By locator) {

		List<WebElement> dropList = driver.findElements(locator);
		// System.out.println(dropList.size());

		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			// System.out.println(text);

			try {
				if (!text.isEmpty()) {
					if (text.equals(value)) {
						dropList.get(i).click();
						break;
					}
				}
			} catch (Exception e) {

			}
		}

	}

	/**
	 * Select multiple value from drop down menu
	 * 
	 * @param driver
	 * @param value
	 */
	public static void selectMultipleDropDown(WebDriver driver, By locator, String... value) { // Array

		List<WebElement> dropList = driver.findElements(locator);
		// System.out.println(dropList.size());

		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			// System.out.println(text);

			// Array
			for (int j = 0; j < value.length; j++) {

				try {
					if (!text.isEmpty()) {
						if (text.equals(value[j])) {
							dropList.get(i).click();
							break;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}

	/**
	 * Print list of elements
	 * @param driver
	 * @param locator
	 */
	public static void findElements(WebDriver driver, By locator) {
		List<WebElement> element = driver.findElements(locator);

		for (WebElement x : element) {
			System.out.println(x.getText());
		}

	}

	/**
	 * Wait until the element to be visible
	 * @param driver
	 * @param time
	 * @param locator
	 * @return
	 */
	public static WebElement explicitlyWaitGetElement(WebDriver driver, int time, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		WebElement element = driver.findElement(locator);
		return element;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
