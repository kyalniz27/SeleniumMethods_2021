package seleniumMethods;

import org.openqa.selenium.WebDriver;

public class JavaScriptExamples {
	
	public static WebDriver driver;
	public static String URL = "https://darksky.net/";

	public static void main(String[] args) throws InterruptedException {

		driver = ElementUtil.launchBrowser(driver, "firefox");
		ElementUtil.launchURL(driver, URL);
		ElementUtil.windowsDetails(driver, 10);
		
		// System.out.println(driver.getTitle()); //webdriver

//		String title = JavaScriptUtil.getTitleByJS(driver);
//		System.out.println(title);

		// WebElement signupLink = driver.findElement(By.linkText("Sign up"));
		// JavaScriptUtil.clickElementByJS(signupLink, driver);
		// JavaScriptUtil.refreshBrowserByJS(driver);
		// JavaScriptUtil.generateAlert(driver, "This is sign up page");
		// JavaScriptUtil.drawBorder(signupLink, driver);

		// JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "boby@gmail.com");

//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		
//		JavaScriptUtil.flash(email, driver);
//		email.sendKeys("boby@gmail.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("123@test");
//		JavaScriptUtil.flash(loginBtn, driver);
//		loginBtn.click();

		// System.out.println(JavaScriptUtil.getPageInnerText(driver));
//		String browserValue = JavaScriptUtil.getBrowserInfo(driver);
//		System.out.println(browserValue);

		// JavaScriptUtil.scrollPageDown(driver);
		JavaScriptExecutor.specificScrollPageDown(driver);

	}

}
