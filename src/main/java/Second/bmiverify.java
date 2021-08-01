package Second;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class bmiverify  {
	
	@Test
	public void bmivalues() throws BiffException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebElement ht,wt,button,bmiresult,bmicategory;
		int rows,columns;
		driver.get("https://dl.dropboxusercontent.com/u/55228056/bmicalculator.html");
		ht=driver.findElement(By.id("heightCMS"));
		wt=driver.findElement(By.id("weightKg"));
		button=driver.findElement(By.id("Calculate"));
		bmiresult=driver.findElement(By.id("bmi"));
		bmicategory=driver.findElement(By.id("bmi_category"));
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Sahil\\Desktop\\SELENIUM\\BmiSheet.xls");
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet sh=wb.getSheet(0);
		rows=sh.getRows();
		columns=sh.getColumns();
		for (int i = 0; i < rows; i++) {
			Cell celldata=sh.getCell(0,i);
			//System.out.println(celldata.getContents().toString());
			ht.sendKeys(celldata.getContents().toString());
			
			Cell celldata1=sh.getCell(1,i);
			wt.sendKeys(celldata1.getContents());
			button.click();
			String a=bmiresult.getAttribute("value");
			System.out.println(a);
			Assert.assertEquals(a, sh.getCell(2,i).getContents().toString());
			ht.clear();
			wt.clear();
		}
		
		
				
		}

}
