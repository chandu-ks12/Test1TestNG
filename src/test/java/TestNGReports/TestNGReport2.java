package TestNGReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGReport2 {
	@Test
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("Chrome browser opened");
		
		driver.get("https:\\www.google.com");
		Reporter.log("Google URL opened");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("India Gate");
		Reporter.log("KeyWord Entered");
		searchbox.sendKeys(Keys.ENTER);
		
	}

}
