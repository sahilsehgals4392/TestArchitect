package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class csselectors extends Testng{

	@Test
	public void cssdetailed()
	{
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Sahil");
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
  