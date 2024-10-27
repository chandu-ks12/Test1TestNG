package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
          ChromeOptions options = new ChromeOptions();
          options.addArguments("--remote-allow-origin=*");
          WebDriver driver = new ChromeDriver(options);
          driver.get("https://www.amazon.in/");
        
          Set <Cookie> cookiesList = driver.manage().getCookies();
          System.out.println(cookiesList.size());
          
         // for(Cookie ck:cookiesList) {
        //	  System.out.println(ck.getName());
         // }
          //driver.quit();
          
          //get specific cookie according to name
        //System.out.println(driver.manage().getCookieNamed("session-id-time"));  
          
          //CreatingCookie
          Cookie cookieObje = new Cookie("TestCookie","https://www.amazon.in/");
          
          //Adding Cookie
          driver.manage().addCookie(cookieObje);
          
          
	}
	

}
