package TestNG1.Test1TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenerDemo {

	
	 @Test
	    public void Login() {
	        // Set up WebDriver
	        WebDriverManager.chromedriver().setup();

	        // Set Chrome options
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver(options);

	        // Open OrangeHRM login page
	        driver.get("https://www.facebook.com/login");

	        // Locate and interact with elements using correct IDs
	        driver.findElement(By.id("email")).sendKeys("Admin");
	        driver.findElement(By.id("pass")).sendKeys("admin123");
	       driver.findElement(By.id("loginbutton")).submit();  // Click on login button
           Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
	        // Close the browser after actions (optional)
	        //driver.quit();
	    }
	}
