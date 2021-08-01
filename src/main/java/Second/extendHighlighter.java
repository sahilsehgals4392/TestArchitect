package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class extendHighlighter extends Testng  {

	@Test
	public void highlighting() throws InterruptedException
	{
	/*System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	*/
	driver.get("https://www.google.com/intl/en/mail/help/about.html");
	WebElement a=driver.findElement(By.cssSelector("#gmail-sign-in"));
	ElementHighlight.highlighter(a);
	Thread.sleep(2000);
	ElementHighlight.highlighter(a);
	}
	}

