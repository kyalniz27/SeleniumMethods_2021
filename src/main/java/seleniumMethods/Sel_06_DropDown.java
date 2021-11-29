package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Sel_06_DropDown {
	
	static WebDriver driver;
	static String webURL = "https://www.facebook.com/";
	static By acctBtn = By.linkText("Create new account");
	static By fName = By.name("firstname");
	static By lname = By.name("lastname");
	static By email = By.name("reg_email__");
	static By password = By.xpath("//input[@id='password_step_input']");
	static By selectMonth = By.id("month"); 
	static By selectDay = By.id("day"); 
	static By selectYear = By.id("year"); 
	static By gender = By.xpath("//label[normalize-space()='Male']");
	static By submit = By.name("websubmit");

	public static void main(String[] args) {
		
		driver = ElementUtil.launchBrowser(driver, "firefox");
		ElementUtil.launchURL(driver, webURL);
		ElementUtil.windowsDetails(driver, 10);
		
		ElementUtil.clickOnMethod(driver, acctBtn);
		
		ElementUtil.sendKeysMethod(driver, fName, "Yalniz");
		
		ElementUtil.sendKeysMethod(driver, lname, "Kurt");
		
		ElementUtil.sendKeysMethod(driver, email, "test123@gmail.com");
		
		ElementUtil.sendKeysMethod(driver, password, "123456");
		
		ElementUtil.selectByIndex(driver, selectMonth, 3);
		
		ElementUtil.selectByVisibleText(driver, selectDay, "15");
		
		ElementUtil.selectByValue(driver, selectYear, "1985");
		
		ElementUtil.clickOnMethod(driver, gender);
		
		System.out.println(ElementUtil.getPageTitle(driver));
		
		ElementUtil.clickOnMethod(driver, submit);
		
		System.out.println(ElementUtil.isDropDownMultiple(driver, selectDay));
		
		ElementUtil.closeBrowser(driver);
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		

	}

}
