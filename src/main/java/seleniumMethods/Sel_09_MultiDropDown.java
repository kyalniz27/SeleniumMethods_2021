package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_09_MultiDropDown {
	
	static WebDriver driver;
	static String URL = "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/";
	static By dropDownMenu = By.xpath("//input[@id='justAnInputBox']");
	static By selectFromDD = By.xpath("//span[@class='comboTreeItemTitle']");

	public static void main(String[] args) {
		
		driver = ElementUtil.launchBrowser(driver, "firefox");
		ElementUtil.launchURL(driver, URL);
		ElementUtil.windowsDetails(driver, 10);
		
		ElementUtil.clickOnMethod(driver, dropDownMenu);
		
		//Select single value from drop down
		//ElementUtil.selectSingleDropDown(driver, "choice 3", selectFromDD);
		
		//Select multiple value from drop down
		ElementUtil.selectMultipleDropDown(driver, selectFromDD, "choice 2", "choice 4", "choice 6 2 1");
		
		

	}

}
