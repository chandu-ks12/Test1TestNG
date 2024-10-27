package EncodeDemoPassword;

import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodePassword {

    public static void main(String[] args) {
        
        // Encode password
      //  String password = "secret_sauce"; encoded c2VjcmV0X3NhdWNl
        
        // Encode using java.util.Base64
        //String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());
        
        //System.out.println(encodedPassword);
    	
    	WebDriverManager.chromedriver().setup();
    	ChromeOptions options = new ChromeOptions();
    	
    	
    	options.addArguments("--remote-allow-origins=*");
    	WebDriver driver = new ChromeDriver(options);
    	driver.get("https://www.saucedemo.com/");
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	
    	byte[] decodedPassword = Base64.decodeBase64("c2VjcmV0X3NhdWNl");
    	
    	driver.findElement(By.id("password")).sendKeys(new String(decodedPassword));
    	
    	driver.findElement(By.id("login-button")).submit();
    	//System.out.println(decodedPassword);
    }
}
