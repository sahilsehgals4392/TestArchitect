package Second;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class demoqa extends Testng {
	@Test	
	public void checkbox()
	{
	driver.get("http://demoqa.com/registration/");
	WebElement ckbox=driver.findElement(By.xpath("//input[@name='checkbox_5[]']"));
		if(!ckbox.isSelected())
		ckbox.click();
		System.out.println(ckbox.getText());
		System.out.println(ckbox.getAttribute("value"));
		System.out.println(ckbox.getClass());
		System.out.println(ckbox.getTagName());
	Assert.assertFalse(!ckbox.isSelected());
	WebElement label=driver.findElement(By.xpath("//label[@for='dropdown_7']"));
	System.out.println(label.getText());
	//http://elementalselenium.com/
	}

}
