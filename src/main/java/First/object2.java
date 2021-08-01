package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class object2 {

	WebDriver driver;
	Object1 mapobject;
	WebElement user,pass;
	
	@BeforeTest
	public void start() throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://demosite.center/wordpress/wp-login.php");
			driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{	
		String directory=System.getProperty("usr.dir");
		mapobject=new Object1(directory+"\\bin\\Object Properties\\objectmap.properties");
		user=driver.findElement(mapobject.getlocator("Username_field"));
		user.sendKeys("admin");
		pass=driver.findElement(mapobject.getlocator("Password_field"));
		pass.sendKeys("demo123");
		WebElement login = driver.findElement(mapobject.getlocator("Login_button"));
	    login.click();
	    WebElement nextpage = driver.findElement(mapobject.getlocator("Next_page"));
	    Assert.assertTrue(nextpage.toString().contains("If"));
	}
}
