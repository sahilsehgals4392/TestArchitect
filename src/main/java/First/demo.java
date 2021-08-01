package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Test
public class demo extends Testng {
		public void google()
		{	
		List<String> actual=new ArrayList<String>();
		List<String> a=new ArrayList<String>();
		List<String> expected=Arrays.asList("Hindi", "Bengali");
		driver.get("http://www.google.co.in/");
		
		List<WebElement> list=driver.findElements(By.tagName("@"));
		System.out.println(list.size());
		for(WebElement w:list)
		{
			System.out.println(w.getText());
			actual.add(w.getText());
		}
		
		assert actual.contains("Settings");
		/*driver.get("http://store.demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='slide_menu']/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='slide_menu']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='menu-item-33']/a")).click();
		driver.findElement(By.xpath("//*[@id='menu-item-34']/a")).click();
		driver.wait(5);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='default_products_page_container']/div[1]/div/a[1]"));	
		driver.findElement(By.xpath("//*[@id='meta']/ul/li[1]/a")).click();
		*/		/*
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id='menu-item-33']/a")));
		dropdown.selectByIndex(1);*/
	}
}
