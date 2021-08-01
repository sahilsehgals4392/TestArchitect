package First;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class performancenavigation extends Testng {
	@Test
	public void Pn() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		long a=(long)System.currentTimeMillis();
		System.out.println(a);
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		long loadEventEnd= (Long) js.executeScript("return window.performance.timing.loadEventEnd;");
		long navigationStart=(Long) js.executeScript("return window.performance.timing.navigationStart;");
		
		System.out.println(loadEventEnd-navigationStart);
	}
}
