package First;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class Frames  extends Testng
{	
	@Test(groups={"a"},dependsOnMethods={"a"})
	public void seleniumframe() throws InterruptedException
	{	File fi=new File("");	
		FirefoxBinary fb=new FirefoxBinary(fi);
	
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
		System.out.println(getClass().getSimpleName()+Thread.currentThread().getId());
		}

}
