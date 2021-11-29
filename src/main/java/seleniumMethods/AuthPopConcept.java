package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopConcept {
	
public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	// https://admin:admin@the-internet.herokuapp.com/basic_auth
	
	String username = "admin";
	String password = "admin";
	
	driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");


	Thread.sleep(2000);
	
	driver.close();
	
	}


}
