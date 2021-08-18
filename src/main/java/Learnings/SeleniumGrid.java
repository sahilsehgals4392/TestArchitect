package Learnings;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {

    @Test
    public void executeGrid() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        //Chrome Option Definitions
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
        String hubUrl = "http://localhost:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }

    @Test
    public void executeGrid1() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        //Chrome Option Definitions
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
        String hubUrl = "http://localhost:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }
    @Test
    public void executeGrid2() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        //Chrome Option Definitions
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
        String hubUrl = "http://localhost:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }
    @Test
    public void executeGrid3() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        //Chrome Option Definitions
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
        String hubUrl = "http://localhost:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }
    @Test
    public void executeGrid4() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        //Chrome Option Definitions
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
        String hubUrl = "http://localhost:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }

}
