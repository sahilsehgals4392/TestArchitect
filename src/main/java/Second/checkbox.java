package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;



public class checkbox extends Testng {
@Test
	public void check()
	{
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		List<WebElement> ckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));//input[@id='id']
		for (int i = 0; i < ckbox.size(); i++) {
		if(ckbox.get(i).isSelected())
		{ckbox.get(i).click();}
		}
		for (int i = 0; i < ckbox.size(); i++) {
			ckbox.get(i).click();
		}
		
	}
}
//"//input[@class='classname']"

//driver.findElement(By.cssSelector("input[type='checkbox']"))