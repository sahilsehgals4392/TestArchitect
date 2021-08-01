package First;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshotutility {
	WebDriver driver;
	String path;
	
	public Screenshotutility(WebDriver driver,String path)
	{
		this.driver=driver;
		this.path=path;
	}
	public void takeScreenshot() throws IOException
	{	
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(this.path));
	}
}
 	
