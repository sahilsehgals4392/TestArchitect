package Second;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class excel extends Testng {
	int cols;
	WebElement fname,lname,phone,email;
	@Test
	public void readfromexcel() throws BiffException, IOException
	{
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=4e703c8e39e7f573424dcb4789000f1c");
		fname=driver.findElement(By.name("firstName"));
		lname=driver.findElement(By.name("lastName"));
		phone=driver.findElement(By.name("phone"));
		email=driver.findElement(By.name("userName"));
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Sahil\\Desktop\\SELENIUM\\MercuryTours.xls");
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet sh=wb.getSheet(0);
		cols=sh.getColumns();
		Cell cell=sh.getCell(0, 0);
		fname.sendKeys(cell.getContents().toString());
		Cell cell1=sh.getCell(1, 0);
		lname.sendKeys(cell1.getContents().toString());
		Cell cell2=sh.getCell(2, 0);
		phone.sendKeys(cell2.getContents().toString());
		Cell cell3=sh.getCell(3, 0);
		email.sendKeys(cell3.getContents().toString());
		System.out.println("Read and Write Succesful");
		
	}
			
		
	}
