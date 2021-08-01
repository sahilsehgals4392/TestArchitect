package First;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;


public class Buttons {
	WebDriver driver;
	@Test 
	public void buttonexample ()
	{	driver=new FirefoxDriver();
	    driver.get("http://demoqa.com/registration/");
	    WebElement e=driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[1]"));
		e.click();
		assertTrue(e.isSelected());
		System.out.println("Selected");
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[2]")).click();
	
	}
	@Test 
	public void buttonexample1 ()
	{	driver=new FirefoxDriver();
	    driver.get("http://demoqa.com/registration/");
	    WebElement e=driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[1]"));
		e.click();
		assertTrue(e.isSelected());
		System.out.println("Selected");
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[2]")).click();
	
	}
}
