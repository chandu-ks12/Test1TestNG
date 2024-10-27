package TestNG1.Test1TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelDemo1 {
	
	@Test
	public void VerifyTitle()
	{
		
		 WebDriverManager.chromedriver().setup();

	        // Create EdgeOptions instance
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        // Initialize WebDriver with Edge
	        WebDriver driver = new ChromeDriver (options);

	        // Navigate to a website
	        driver.get("https://www.facebook.com/");

}
}