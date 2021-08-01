package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class elementhighlight extends Testng {
@Test
public void elements() throws InterruptedException, IOException
{
	driver.get("https://in.yahoo.com/?p=us");
	Thread.sleep(5000);
	WebElement a=driver.findElement(By.xpath(".//*[@id='yucs-profile']/a/b"));
	WebElmentextender.highlightElement(a);
	WebElmentextender.highlightElement(a);
	Screenshotutility obj=new Screenshotutility(driver,"C:/Users/Sahil/Desktop/Flipkart.jpg");
	obj.takeScreenshot();
}
}
