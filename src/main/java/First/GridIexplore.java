package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridIexplore {
	
	@Test
	public void gridIE() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setBrowserName("chrome");
		//cp.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444//wd/hub"),cp);
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("Sahil");
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("Sehgal");
		driver.findElement(By.cssSelector("input[name*='ne']")).sendKeys("1");	
		driver.findElement(By.cssSelector("input[name$='rName']")).sendKeys("Ssehgal");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Address");
		WebElement p=driver.findElement(By.cssSelector("[size='2']"));
		System.out.println(p.getText());
		Assert.assertTrue(p.getText().contains("basic information"));
		Assert.assertTrue(p.getText().startsWith("To"));
		System.out.println(p.getAttribute("size"));
		
	}

}
