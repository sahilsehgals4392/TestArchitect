package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class doubleclick extends Testng{

	@Test
	public void doubleclicking()
		{ 	driver.get("http://cookbook.seleniumacademy.com/");
			driver.findElement(By.linkText("Double Click Example")).click();
			Actions builder=new Actions(driver);
			builder.doubleClick(driver.findElement(By.cssSelector("p[align='justify']"))).perform();
			System.out.println(driver.findElement(By.cssSelector("p[align='justify']")).getText());

	
}
}