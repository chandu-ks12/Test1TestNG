package TestNG1.Test1TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataprovideDemo {
	
	public class DataprovideeDemo {

	    // DataProvider method to supply test data
	    @DataProvider(name = "searchData")
	    public Object[][] searchData() {
	        return new Object[][] {
	            {"India", "Taj Mahal"},
	            {"France", "Eiffel Tower"},
	            {"USA", "Statue of Liberty"}
	        };
	    }

	@Test(dataProvider = "searchData")
	public void TestCaseGooglesearch(String country, String monument)
	{
		
		 WebDriverManager.chromedriver().setup();

	        // Create EdgeOptions instance
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        // Initialize WebDriver with Edge
	        WebDriver driver = new ChromeDriver (options);

	        // Navigate to a website
	        driver.get("https://www.google.com");
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	        WebElement searchbox1 = driver.findElement(By.name("q"));
	        
	        searchbox1.sendKeys(country + "" + monument);
	        driver.findElement(By.name("btnk"));
	}

	}}
