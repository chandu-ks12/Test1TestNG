package TestNG1.Test1TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo{

	 @Test
	    public void Login() {
	        // Set up WebDriver
	        WebDriverManager.chromedriver().setup();

	        // Set Chrome options
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver(options);
	        
	        SoftAssert softverify = new SoftAssert();
 
	        // Open OrangeHRM login softVerifypage
	      driver.get("https://testautomationpractice.blogspot.com/");
	      System.out.println("verifying title.......");
	      String expectedTitle = "Automation Testing Practicjjje";
	      String actualTitle = driver.getTitle();
	      softverify.assertEquals(expectedTitle, actualTitle,"Title verification.....");
	      
	      System.out.println("verifying presence of wikipedia-icon");
	      WebElement icon= driver.findElement(By.className("wikipedia-icon"));
	      softverify.assertTrue(icon.isDisplayed());
	      
	      System.out.println("verifying presence of wikipedia-search button");
	      WebElement searchbtn= driver.findElement(By.className("wikipedia-search-button"));
	      softverify.assertTrue(searchbtn.isDisplayed());
	      softverify.assertAll();
	 }
}
