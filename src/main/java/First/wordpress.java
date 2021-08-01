package First; /**
 * 
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Sahil
 *
 */
public class wordpress {
	WebDriver driver;
	
	public wordpress(WebDriver driver)
	{
		this.driver =driver;
	}
	public void refresh()
	{
		driver.navigate().refresh();
	}
	public void username()
	{
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
	}
	public void password()
	{
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
	}
	public void submit()
	{
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	}

}
