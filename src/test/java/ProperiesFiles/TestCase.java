package ProperiesFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //launch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		ReadConfigFile ConfigFile = new ReadConfigFile();
		
		driver.get(ConfigFile.getURL());
		
		//driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(ConfigFile.getUserName());
		driver.findElement(By.id("password")).sendKeys(ConfigFile.getPassword());
		driver.findElement(By.id("login-button")).submit();
	}

}
