package First;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class log4jExample {
    public static void main(String[] args) {
      
    // Here we need to create logger instance so we need to pass Class name for 
     //which  we want to create log file in my case log4jExample is classname
         Logger logger=Logger.getLogger("log4jExample");
        

       // configure log4j properties file
       PropertyConfigurator.configure("log4j.properties");


        // Open browser
        WebDriver driver = new FirefoxDriver();
        logger.info("Browser Opened");
      
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Implicit wait given");
      

        // Load application
        driver.get("https://www.google.co.in/");
        logger.info("Url opened");
      

        // type Selenium
        driver.findElement(By.name("q")).sendKeys("Selenium");
        logger.info("keyword type");           
    }
}