package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pftest extends LoadableComponent<pftest>  {
	WebDriver driver;
	pagefactory obj;
	pagefactnextpage obj1;
	
	
	
	@Test(priority=1)
	public void testdone()
	{
		
		obj=new pagefactory(driver);
		Assert.assertTrue(obj.getbtnvalue().toString().contains("In"));
		System.out.println(obj.btnvalue.getAttribute("value"));
		obj.wplogin("admin","demo123");
		obj1=new pagefactnextpage(driver);
		obj1.title();
		Assert.assertTrue(obj1.title().toString().contains("Dash"));
		
		System.out.println(obj1.title().toString());
		
	}
	@Override
	@Test(priority=0)
	protected void isLoaded() throws Error {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "http://demosite.center/wordpress/wp-login.php");
		// TODO Auto-generated method stub
		
	}
	@Override
	@BeforeTest()
	protected void load() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
	}
}