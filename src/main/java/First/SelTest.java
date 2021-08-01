package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class SelTest extends Testng{
	public void demoTestng() throws InterruptedException
	{
	
	driver.get("https://www.expedia.co.in/");
	Thread.sleep(5000);
	Assert.assertTrue(driver.findElement(By.cssSelector("#header-logo>img")).isDisplayed());
	WebElement search=driver.findElement(By.id("search-button"));
	search.click();
	String alert=driver.findElement(By.cssSelector(".alert-title")).getText();
	Assert.assertTrue(driver.findElement(By.cssSelector(".alert-title")).getText().matches("Please correct the errors below."));
	//Assert.assertEquals(alert, driver.findElement(By.cssSelector(".alert-title")).getText());
	
	System.out.println("Please correct the errors below. written in page");
	if(driver.getPageSource().contains("Please correct the errors below."))
	{
	System.out.println("Text is Present");
	}
	else
	{
	System.out.println("Text is not Present");
	}
	
	}


	

	
	}

