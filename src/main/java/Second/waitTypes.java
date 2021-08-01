package Second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;



public class waitTypes  extends Testng{


public void waitexamplesfromtoolsqa() throws InterruptedException

{
	driver.get("http://toolsqa.com/selenium-webdriver/wait-commands/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/* Purpose: 
	 * Selenium WebDriver has borrowed the idea of implicit waits from Watir.
	 *  This means that we can tell Selenium that we would like it to wait for a certain amount of time before throwing an exception
	 *  that it cannot find the element on the page. We 
	 *  should note that implicit waits will be in place for the entire time the browser is open.
	 *  This means that any search for elements on the page could take the time the implicit wait is set for.*/
	
	Wait wait=new FluentWait<WebDriver>(driver).withTimeout(10 ,TimeUnit.SECONDS).pollingEvery(500 , TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
	 /*Purpose:
 Each FluentWait instance defines the maximum
 amount of time to wait for a condition, as well as the 
frequency with which to check the condition.
 Furthermore, the user may configure the wait to ignore specific types of exceptions
 whilst waiting, such as NoSuchElementExceptions when 
searching for an element on the page.
*/
	WebDriverWait waiting = new WebDriverWait(driver, 10);
	 
//	 WebElement element = waiting.until(ExpectedConditions.elementToBeClickable(By.id("")));
	
	 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	 
	 driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
	 
	 driver.manage().timeouts().setScriptTimeout(100,TimeUnit.MILLISECONDS);
//	 WebElement message = new WebDriverWait(driver, 5);
//	 .until(new ExpectedCondition<WebElement>() {
//	 public WebElement apply(WebDriver d) {
//	 return d.findElement(By.id("page4"));
//	 }
//	 });
}

}
