package code.day9_windowsAndTabs;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c3_Properties_practice {
    @Test
    public void TC1_System_properties(){
        // java has some prpperties tyhat we can use as system info

        System.out.println(System.getProperty("os.name"));
    }
    @Test
    public void TC2_configurationProperties() throws FileNotFoundException {
        Properties properties = new Properties();
        //   this is a path for properties file
        String pathForPropertiesFile = "configuration.properties";
        try {
            // tell compiler to open the file
            FileInputStream fileInputStream = new FileInputStream(pathForPropertiesFile);
            // file need to be load in Framework
            properties.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("SmartBear_URL"));
        System.out.println(properties.getProperty("SmartBear_username"));

    }
}
