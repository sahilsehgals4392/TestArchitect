package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class wordpresspage {

	WebDriver driver;
	@Test
	public void objectmodel()
	{	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		wordpress ob=new wordpress(driver);
		ob.refresh();
		ob.username();
		ob.password();
		ob.submit();		
	}
	@AfterTest
	public void execute()
	{
		System.out.println("Execution Completed");
}
}

