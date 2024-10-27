package ProperiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
    Properties properties;
    String path = "C:\\Users\\popeye\\Java Programming\\Test1TestNG\\src\\test\\java\\ProperiesFiles\\Config.properties";

    public ReadConfigFile() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration file not found at path: " + path);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while loading configuration file.");
        }
    }

    public String getURL() {
        String url = properties.getProperty("Url");
        if (url != null) {
            return url; // Fixed to return the property value
        } else {
            throw new RuntimeException("URL not specified in the config file.");
        }
    }

    public String getUserName() {
        String username = properties.getProperty("UserName");
        if (username != null) {
            return username; // Fixed to return the property value
        } else {
            throw new RuntimeException("UserName not specified in the config file.");
        }
    }

    public String getPassword() {
        String password = properties.getProperty("Password");
        if (password != null) {
            return password; // Fixed to return the property value
        } else {
            throw new RuntimeException("Password not specified in the config file.");
        }
    }
}
