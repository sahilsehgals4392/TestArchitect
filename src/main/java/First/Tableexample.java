package First;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Tableexample{

	@Test
	public void Example()
	{	WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/tables");
		WebElement table=driver.findElement(By.id("table1"));
		List<WebElement> tr=table.findElements(By.tagName("tr"));
		List<WebElement> td=table.findElements(By.tagName("td"));
		System.out.println(tr.size());
		for(WebElement trow:tr)
		{
			if(trow.getText().contains("Bach"))
			{	List<WebElement> tdata=trow.findElements(By.tagName("td"));
				for(WebElement tabledata:tdata)
				{System.out.println(tabledata.getText());
				}
			}
			
		}
		
		
	}
	
}
