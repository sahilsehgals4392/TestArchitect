package Second;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class alerts {
	WebElement a,b,c;
	WebDriver driver;
@Test
public void alertsExample()
{	driver=new FirefoxDriver();
	driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
	a=driver.findElement(By.cssSelector("input[value='Show alert box']"));
	a.click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	b=driver.findElement(By.xpath("//input[@value='Show alert box']/following::button[1]"));
	b.click();
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
	}

@Test
public void alertsExample1()
{	driver=new FirefoxDriver();
	driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
	a=driver.findElement(By.cssSelector("input[value='Show alert box']"));
	a.click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	b=driver.findElement(By.xpath("//input[@value='Show alert box']/following::button[1]"));
	b.click();
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
	}

}
