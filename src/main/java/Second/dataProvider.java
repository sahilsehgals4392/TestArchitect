package Second;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class dataProvider extends Testng {
	
	@Test(dataProvider="Test")
	public void data(String a,String b,String c)
	{
		WebElement num1,num2,addthem,br;
		driver.get("http://webmath.com/");
		Select list=new Select(driver.findElement(By.id("topicItem")));
		list.selectByValue(a);
	num1=driver.findElement(By.cssSelector("input[name='n1']"));
	num2=driver.findElement(By.cssSelector("input[name='n2']"));
	num1.sendKeys(b);
	num2.sendKeys(c);
	addthem=driver.findElement(By.xpath("//input[@value='Add them!']"));
	addthem.click();
	br=driver.findElement(By.xpath("//center[br[2]]"));
	//System.out.println(br.getText().length());
	System.out.println("Result of adding "+b+" and "+c+" is: "+br.getText().substring(25, br.getText().length()));
	}
	
	@DataProvider(name="Test")
 	public Object[][] addition() throws BiffException, IOException
	{	
		int rows,columns;
		FileInputStream fi=new FileInputStream("C:\\Users\\Sahil\\Desktop\\SELENIUM\\Webmath.xls");
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet sh=wb.getSheet(0);
		rows=sh.getRows();
		columns=sh.getColumns();
		String[][] Input=new String[rows][columns];
	
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
		Cell celldata=sh.getCell(j,i);
		Input[i][j]=celldata.getContents();
		}
	}
	return Input;	
	
	}
}
