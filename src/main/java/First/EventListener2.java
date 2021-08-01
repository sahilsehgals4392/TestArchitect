package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;

public class EventListener2 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Selenium\\Firefox\\firefox.exe"));

		WebDriver driver = new FirefoxDriver(binary, profile);

		EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
		EventListener eventListener = new EventListener();
		eventFiringDriver.register(eventListener);
		eventFiringDriver.get("http://www.google.com");
		eventFiringDriver.get("http://www.facebook.com");
		WebElement usrname=eventFiringDriver.findElement(By.id("email"));
		usrname.sendKeys("a");
		WebElement pass=eventFiringDriver.findElement(By.cssSelector("#pass"));
		pass.sendKeys("a");
		driver.close();
		}
}
