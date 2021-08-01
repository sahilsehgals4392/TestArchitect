package First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionToolsqa extends Testng {
	
@Test
public void toolsqa()
{	driver.get("http://demoqa.com/draggable/");
	WebElement wb=driver.findElement(By.id("draggable"));
	Actions builder=new Actions(driver);
	builder.dragAndDropBy(wb, 100, 100).perform();
	((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView();", driver.findElement(By.xpath("html/body/div[1]/footer/div[1]/div/div[2]/aside/h3")));
//	driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");

	}		
}
