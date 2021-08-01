package First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//Works only in Firefox
public class actionPerform {
	
@Test
public void actionPerform() throws InterruptedException
{
WebDriver driver=new FirefoxDriver();
//driver.get("file:///C:/Users/Sahil/Desktop/SELENIUM/a.html");
driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_lists_unordered");
WebDriverWait wait = new WebDriverWait(driver, 10);

Thread.sleep(2000);
WebElement one = driver.findElement(By.xpath("html/body/ul/li[2]"));
WebElement five = driver.findElement(By.xpath("html/body/ul/li[1]"));
Actions builder=new Actions(driver);
//builder.sendKeys(Keys.chord("A"));
builder.keyDown(Keys.CONTROL).click(one).click(five);
Action compositeAction=builder.build();
compositeAction.perform();
}
}
