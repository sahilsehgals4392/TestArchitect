package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class paint extends Testng {
	@Test
	public void painting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/html5canvasdraw.html");
		WebElement draw=driver.findElement(By.id("imageTemp"));
		Select tools=new Select(driver.findElement(By.id("dtool")));
		tools.selectByValue("line");
		System.out.println(draw.getLocation().getX()+" "+ draw.getLocation().getY());
		Actions builder=new Actions(driver);
		/*builder.clickAndHold(draw).moveByOffset(10,
				50).moveByOffset(50, 10)
		.moveByOffset(-10, -50).moveByOffset(-50, -10).release(draw).build().perform();*/
		
		builder.clickAndHold(draw).moveByOffset(draw.getLocation().getX()+10,
				draw.getLocation().getY()+10).moveByOffset(10,10).moveByOffset(-15,-100).moveByOffset(-20,-20).release().build().perform();
	}
}
