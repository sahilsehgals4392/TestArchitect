package First;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;


public class getcookies extends Testng{
@Test
public void addCookie() throws IOException {
	
	driver.get("http://www.flipkart.com/");
	Cookie name=new Cookie("addedcookie","1");
	driver.manage().addCookie(name);
	Set<Cookie> list=driver.manage().getCookies();
	
	for(Cookie variable1:list)
		System.out.println(variable1);
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("C:/Users/Sahil/Desktop/Flipkart.jpg"));
	}

}
