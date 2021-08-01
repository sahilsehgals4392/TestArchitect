package Second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class objmapper {
	
		WebDriver driver;
		public objmap object;
	@BeforeTest
	public void setUp() throws Exception {
	  // Create a new instance of the Firefox driver
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	  Thread.sleep(2000);
	
	}
	
	@Test
	public void objmapping() throws Exception
	{
		String wrkingdirectory=System.getProperty("user.dir");
		object=new objmap(wrkingdirectory+"\\bin\\Object Properties\\object.properties");
		WebElement usr_name=driver.findElement(object.getLocator("User_name"));
		usr_name.sendKeys("username");
		WebElement next=driver.findElement(object.getLocator("next_button"));
		next.click();
	}
}
