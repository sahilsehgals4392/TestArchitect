package First;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testDemo {

	WebDriver driver;
	JavascriptExecutor executor;
	public void initialiseJavaScript()
	{executor= (JavascriptExecutor) driver;
	}
	public void scroll()

	{
		driver = new FirefoxDriver();
		driver.get("https://mail.google.com/mail/");
		initialiseJavaScript();
		executor.executeScript("window.scrollBy(0,500)");
	}

}