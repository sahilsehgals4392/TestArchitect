package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class elementIspresent{
	WebDriver driver;
	
	public boolean isElementpresent(By by)
	{	
	try
	{
		driver.findElement(by);
		return true;
	}
	 catch (NoSuchElementException e)
	{
	 return false;
	 }
	}
	@Test
	public void cssfind()
	{	driver.get("http://www.axisbank.com/");
		WebElement welcomedbanner=driver.findElement(By.cssSelector(".mobileBannerClose"));
		WebElement prod=driver.findElement(By.cssSelector("li#product"));
		WebElement account=driver.findElement(By.cssSelector("a[title='Accounts']"));
		WebElement saving=driver.findElement(By.cssSelector("a[href='/personal/accounts/savings-accounts/savings-accounts.aspx']"
												+ 	"[title='Savings Accounts ']"));
		if(isElementpresent(By.cssSelector(".mobileBannerClose")))
		{
		welcomedbanner.click();
		}
		Actions action=new Actions(driver);
		action.moveToElement(prod).perform();
		action.moveToElement(account).moveToElement(saving).click().build().perform();
	}

}
