package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class settingattribute {
	@Test
	public void attr() throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
		WebElement ht=driver.findElement(By.id("heightCMS"));
		ht.sendKeys("160");
		Thread.sleep(2000);
		System.out.println(ht.getAttribute("value"));
		setAttribute.setAttributemethod(ht, "value", "109");
		
	}

}
