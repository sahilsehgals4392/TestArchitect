package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Testng { 
	public WebDriver driver;
	@BeforeMethod
	public void initial(){
	driver = new FirefoxDriver();
	/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	*/
	driver.manage().window().maximize();
	
	}
	@AfterTest
	public void execute()
	{
		System.out.println("Execution Completed");
}
}