package TestNG1.Test1TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
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
	        driver.get("https://www.saucedemo.com/");
	        
	        Assert.assertEquals(driver.getTitle(),"Swag Labs");
	        
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
	
	@Test
	public void VerifyLogo()
	{
		
		 WebDriverManager.chromedriver().setup();

	        // Create EdgeOptions instance
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        // Initialize WebDriver with Edge
	        WebDriver driver = new ChromeDriver (options);

	        // Navigate to a website
	        driver.get("https://www.saucedemo.com/");
	        
	       // Assert.assertEquals(driver.getTitle(),"Swag Labs");
	       WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
	       Assert.assertTrue(logo.isDisplayed());
	        
	       try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}