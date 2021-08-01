package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class implementing {
	WebDriver driver;

	 public implementing(WebDriver driver) 
	{
		this.driver=driver;
	}
	@Test
	public void navigate() throws InterruptedException
	{	
		
		driver.findElement(By.xpath("//*[@id='tab-flight-tab']/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#flight-departing")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("14")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#flight-returning")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("15")).click();
		driver.findElement(By.id("search-button")).click();
		Thread.sleep(5000);
		
	}
	@Test
	public void bookTicket() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='tab-flight-tab']/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#flight-departing")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("14")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#flight-returning")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("15")).click();
		driver.findElement(By.id("search-button")).click();
		Thread.sleep(5000);
		
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

