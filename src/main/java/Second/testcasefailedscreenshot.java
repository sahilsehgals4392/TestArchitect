package Second;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class testcasefailedscreenshot {
	WebDriver driver;
	@Test
	public void testcase() throws InterruptedException
	{
	driver=new FirefoxDriver();
	driver.get("http://www.axisbank.com/");
	//WebDriverWait wait=new WebDriverWait(driver, 15,3000);
    Thread.sleep(5000);
	WebElement prod=driver.findElement(By.xpath(".//span[text()='Products']"));
    WebElement saving=driver.findElement(By.xpath(".//a[starts-with(@title,'Savings Accounts')]"));
    WebElement account=driver.findElement(By.xpath(".//a[text()='Accounts++']"));
    Actions action=new Actions(driver);
    action.moveToElement(prod).moveToElement(account).moveToElement(saving).click().build().perform();
}
	
	@AfterMethod
	public void screenshot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Sahil\\Desktop\\"+ result.getName()+"a.jpg"));
		}
	}
}
