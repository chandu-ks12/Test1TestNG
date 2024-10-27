package DataDrevinTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {

    public static void main(String[] args) {
        
        // Initialize WebDriver
        WebDriver driver = null;
        
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);
        
        // Navigate to the login page
        driver.get("https://www.saucedemo.com/");
        
        // Excel file path
        File excelFile = new File("C:\\Book1DataDraven.xlsx"); // Update with your correct file path
        FileInputStream inputStream = null;
        XSSFWorkbook ExcelWBook = null;
        
        try {
            // Open Excel file
            inputStream = new FileInputStream(excelFile);
            ExcelWBook = new XSSFWorkbook(inputStream);
            
            // Get the first sheet
            XSSFSheet ExcelWSheet = ExcelWBook.getSheetAt(0);
            
            // Iterate through all rows of the sheet (starting from row 1)
            for (int currentRow = 1; currentRow <= ExcelWSheet.getLastRowNum(); currentRow++) {
                XSSFRow row = ExcelWSheet.getRow(currentRow);
                
                // Get the username and password from the current row
                String username = row.getCell(0).toString();
                String password = row.getCell(1).toString();
                
                // Find the username and password input fields on the web page
                WebElement usernameField = driver.findElement(By.id("user-name"));
                WebElement passwordField = driver.findElement(By.id("password"));
                WebElement loginButton = driver.findElement(By.id("login-button"));
                
                // Clear the fields first before sending new values
                usernameField.clear();
                passwordField.clear();
                
                // Input the username and password from Excel
                usernameField.sendKeys(username);
                passwordField.sendKeys(password);
                
                // Click the login button
                loginButton.click();
                
                // Optional: Add assertion or validation to verify the login success
                // Example: Check if user is redirected to the correct page after login
                
                // Here, for simplicity, we'll just navigate back to the login page for the next iteration
                driver.get("https://www.saucedemo.com/");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close Excel resources
            try {
                if (ExcelWBook != null) {
                    ExcelWBook.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // Optional: Close the browser
        driver.quit();
    }
}
