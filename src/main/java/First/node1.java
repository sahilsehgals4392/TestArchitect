package First;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class node1 {

	@Test
	public void a() throws Exception
	{	//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		/*SeleniumServer sv=new SeleniumServer();
		sv.start();*/
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setBrowserName("chrome");
		cp.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cp);
		driver.get("https://www.google.com/intl/en/mail/help/about.html");
		

	}}
