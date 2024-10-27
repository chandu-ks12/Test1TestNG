package TestNG1.Test1TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureImageSourceURL {
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	
	
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	WebElement Log = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	
	//capturing "src" attribute value of image logo
	
	Log.getAttribute("src");
	System.err.println("capturing \"src\" attribute value: " + Log.getAttribute("src"));
	
	
	
	}

}
