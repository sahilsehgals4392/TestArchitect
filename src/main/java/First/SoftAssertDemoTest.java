package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertDemoTest {

	@Test
	public void softassert()
	{
		WebDriver driver=new FirefoxDriver();
	
		driver.get("http://www.guru99.com/selenium-tutorial.html");
	SoftAssert	 va=new SoftAssert();
		va.assertEquals(driver.getCurrentUrl(), "http://selenium-tutorial.html");
	
	
	va.assertAll();
	}
	
	
}
