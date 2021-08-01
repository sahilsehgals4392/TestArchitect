package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pagefactnextpage {
	WebDriver driver;
		
	public pagefactnextpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public String title()
	{
		return driver.getTitle();
	}
	
	

}
