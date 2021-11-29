package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sel_08_DropDownWithoutSelectClass {
	
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
		
		
//		Select select = new Select(driver.findElement(selectMonth));
//		List<WebElement> monthOptions = select.getOptions();
//		
//		for(WebElement x: monthOptions) {
//			System.out.println(x.getText());
//		}
		
		
		//DropDown without select class you can use customize xpath and getting all values in a loop
		//select[@id='month']/option
		
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Number of months: "+months.size());
		
		for(WebElement x : months) {
			if(x.getText().equals("Mar")) {
				x.click();
				break;
			}
			System.out.println(x.getText());
			
		}
		
		
		//driver.close();
		
	}

}
