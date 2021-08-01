package Second;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Contextmenu extends Testng {
@Test
	public void context() throws InterruptedException
	{
		driver.get("http://the-internet.herokuapp.com/context_menu");
		WebElement context=driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(context).contextClick().sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		/*driver.findElement(By.linkText("Basic Auth")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.authenticateUsing(new UserAndPassword("admin", "admin"));
	*/	}

}
