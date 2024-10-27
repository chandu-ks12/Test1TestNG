package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class CrossbrowserTestingDemo1 {
	
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser)
	{
		
		switch(browser.toLowerCase())
		{
		case "chrome": 
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origin=*");
         driver = new ChromeDriver(options);
         break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			 EdgeOptions options1 = new EdgeOptions();
	         options1.addArguments("--remote-allow-origin=*");
	         driver = new EdgeDriver(options1);
	         break;
	         default:
	        	 driver = null;
	        	 break;
	}
	}
	@Test
    public void VerifyTittle()
    {
		driver.get("https://www.google.com");
    	String expectedTitle = "Google";
    	String actualTitle = driver.getTitle();
    	
    	Assert.assertEquals(expectedTitle, actualTitle);
    	
    	System.out.println("Test Passed");
    	
    }
	@AfterMethod
	public void Quite()
	{
		driver.quit();
	}
	
}
