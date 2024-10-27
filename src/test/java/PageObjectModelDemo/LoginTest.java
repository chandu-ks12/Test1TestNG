package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions optins = new ChromeOptions();
		optins.addArguments("--remote-allow-origin=*");
		WebDriver driver = new ChromeDriver(optins);
		
		LoginPage pg = new LoginPage (driver);
		
		driver.get("https://www.saucedemo.com/");
		pg.enterUsername("standard_user");
		pg.enterPassword("secret_sauce");
		driver.findElement(By.id("login-button")).submit();
	}

}
