package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class GoogleChrome {

	
	private static final Object START_WITH_HOME_PAGE = "https://mail.google.com/";

	@Test
	public void options()
	{	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();

		 Map<String, Object> preferences = new HashMap<String, Object>();
		preferences.put( "browser.startup.homepage", "https://mail.google.com/" );
		preferences.put( "browser.startup.page",START_WITH_HOME_PAGE);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);

		 capabilities.setCapability( ChromeOptions.CAPABILITY, options);

		WebDriver driver = new ChromeDriver(capabilities);
		
	}
}
