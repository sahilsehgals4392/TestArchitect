package First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SessionStorage {
	
private WebDriver driver;

@BeforeTest
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://cookbook.seleniumacademy.com/html5storage.html");
}
@Test
public void testHTML5SessionStorage() throws Exception {
WebElement clickButton = driver.findElement(By.cssSelector("button[onclick='clickCounter()']"));

JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
// Get current value of sessionStorage.clickcount, should be null
String clickCount = (String) jsExecutor.executeScript("return sessionStorage.clickcount;");
System.out.println(clickCount);
clickButton.click();
//Get current value of sessionStorage.clickcount, should be 1
clickCount = (String) jsExecutor.executeScript("return sessionStorage.clickcount;");
System.out.println(clickCount);
}}