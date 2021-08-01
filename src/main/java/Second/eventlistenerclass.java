package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class eventlistenerclass extends Testng {
	
	@Test
	public void demo_example()
	{
	EventFiringWebDriver eventDriver=new EventFiringWebDriver(driver);
	Eventlistenerextender event=new Eventlistenerextender();
	eventDriver.register(event);
	
	eventDriver.get("https://dl.dropboxusercontent.com/u/55228056/inputtest.html");
	eventDriver.findElement(By.id("q")).sendKeys("Selenium Testing Tools Cookbook");
		
	}

}
