package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	
	//Jacop API
    // AutoIT
	
	//You can use WebDriver find element send keys method to handle upload file in selenium
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\seker\\Desktop\\screenshot\\article.docx");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	

}
