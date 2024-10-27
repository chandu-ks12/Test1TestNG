package HeadLessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadLessBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		
		System.out.println("Before Search" + driver.getTitle());
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("India Gate");
        searchbox.sendKeys(Keys.ENTER);
        System.out.println("After Search" + driver.getTitle());

	}

}
