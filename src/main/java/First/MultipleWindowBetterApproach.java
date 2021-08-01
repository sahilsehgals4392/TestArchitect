package First;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;



public class MultipleWindowBetterApproach {

	WebDriver driver;
	@Test
    public void multipleWindowsRedux() {
        driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
        String firstWindow = driver.getWindowHandle();
        String newWindow = "";
        driver.findElement(By.cssSelector(".example a")).click();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(firstWindow)) {
                newWindow = window;
            }
        }

        driver.switchTo().window(firstWindow);
        Assert.assertFalse(driver.getTitle().equals("New Window"));

        driver.switchTo().window(newWindow);
        Assert.assertTrue(driver.getTitle().equals("New Window"));
    }

	@Test
	public void testSecond()
	{
		System.out.println("2");
	}
}
