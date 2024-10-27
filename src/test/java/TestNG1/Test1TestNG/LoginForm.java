package TestNG1.Test1TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class LoginForm {

    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the login page
        driver.get("https://www.saucedemo.com/");
        
        // Create an instance of Actions class
        Actions actions = new Actions(driver);

        // Build a series of actions for login
        Action seriesOfActions = actions
                .moveToElement(driver.findElement(By.id("user-name"))).click()
                .sendKeys("standard_user", Keys.TAB)
                .sendKeys("secret_sauce", Keys.ENTER)
                .build();

        // Perform the actions
        seriesOfActions.perform();
        
        // Optionally, you can add some validation here to confirm login success

        // Close the driver (optional)
        // driver.quit();
    }
}
