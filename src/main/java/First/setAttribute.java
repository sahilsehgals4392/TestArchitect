package First;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.Test;

public class setAttribute extends Testng{
	@Test
	public static void setAttributemethod(WebElement element, String attributeName, String value)
			{
			WrapsDriver wrappedElement = (WrapsDriver) element;
			JavascriptExecutor driver = (JavascriptExecutor)wrappedElement.getWrappedDriver();
			driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, value);
	
		}
	

}
