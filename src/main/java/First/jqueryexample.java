package First;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class jqueryexample {

	WebDriver driver;
	
@BeforeTest
public void setup()
{	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
}
	
/*@Test
public void buttonSelector()
{
driver.get("file:///C:/Users/Sahil/Desktop/Button.html");
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript( "jQuery( ':button' ).addClass( 'marked' )" );

}*/
@Test
public void textContains()
{
driver.get("file:///C:/Users/Sahil/Desktop/Button.html");	
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("return jQuery(\":contains('Demo')\").css('text-decoration' , 'underline');");
//.css('text-decoration' , 'underline')");

}

}
