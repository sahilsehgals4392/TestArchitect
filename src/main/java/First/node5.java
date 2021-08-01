package First;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class node5 {
	@Test
	public void ValidateTitle() throws IOException,MalformedURLException
	{
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setBrowserName("chrome");
		cp.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cp);
		driver.get("http://www.flipkart.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com", driver.getTitle());
		}

}
