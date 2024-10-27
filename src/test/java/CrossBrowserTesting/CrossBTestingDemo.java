package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBTestingDemo {

    WebDriver driver;

    public void launchBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origin=*");
            driver = new ChromeDriver(options);
        } 
        else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } 
        else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } 
        else {
            System.out.println("Invalid browser name! Please specify Chrome, Firefox, or Edge.");
            return;
        }
        
        // Launch the website
        driver.get("https://www.google.com/");
        
        // Additional steps or assertions can go here
        
        driver.quit();  // Ensure you close the browser after testing
    }

    public static void main(String[] args) {
        CrossBTestingDemo demo = new CrossBTestingDemo();
        
        // Example: Launch Chrome browser
        demo.launchBrowser("chrome");
        
        // To test in other browsers, pass different strings
        // demo.launchBrowser("firefox");
        // demo.launchBrowser("edge");
    }
}
