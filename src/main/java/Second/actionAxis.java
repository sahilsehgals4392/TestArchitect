package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionAxis {
	@Test
	public void a() throws InterruptedException
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.axisbank.com/");
	//WebDriverWait wait=new WebDriverWait(driver, 15,3000);
    Thread.sleep(5000);
	WebElement prod=driver.findElement(By.xpath(".//span[text()='Products']"));
    WebElement saving=driver.findElement(By.xpath(".//a[starts-with(@title,'Savings Accounts')]"));
    WebElement account=driver.findElement(By.xpath(".//a[text()='Accounts']"));
    Actions action=new Actions(driver);
action.moveToElement(prod).moveToElement(account).moveToElement(saving).click().build().perform();
/*action.moveToElement(saving).click().build().perform();
    action.click(prod).perform();
    action.moveToElement(account).perform();
    action.moveToElement(saving).click().perform();
    /*Actions action=new Actions(driver);
	WebElement prod=driver.findElement(By.id("product"));
	WebElement saving=driver.findElement(By.xpath("html/body/form/div[5]/div[1]/div[3]/div/div[1]/div[2]/div/div/ul[2]/ul/li[1]/a"));
	WebElement account=driver.findElement(By.xpath("html/body/form/div[5]/div[1]/div[3]/div/div[1]/div[2]/div/div/ul[1]/li[1]/a"));
	action.moveToElement(prod).moveToElement(account).moveToElement(saving).click();
	Action composite=action.build();
	composite.perform();
	//action.moveToElement(account).moveToElement(driver.findElement(By.xpath("html/body/form/div[5]/div[1]/div[3]/div/div[1]/div[2]/div/div/ul[2]/ul/li[1]/a"))).click().build().perform();
	/*action.moveToElement(prod).perform();
	action.moveToElement(account).perform();
	Thread.sleep(1000);
	action.click(saving).build().perform();action.moveToElement(saving).click().build().perform();
//	driver.get("http://www.axisbank.com/");

	// move the cursor to the menu Product
	//WebElement element = driver.findElement(By.cssSelector("#product span"));
	//new Actions(driver).moveToElement(element).perform();

	// click on accounts
	*/
	}
}
