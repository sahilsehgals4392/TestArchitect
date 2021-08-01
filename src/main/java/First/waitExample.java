package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class waitExample {

	@Test
	public void getWait()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/gmail/about/");
		System.out.println("Wait started");
		waitUtility.isElementPresnt(driver, "html/body/nav/div/a[1]", 10);
		System.out.println("Wait Done");
	}
	
}
