package First;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class tableDemo {

	WebDriver driver;
		
	@Test
	public void table() throws IOException, RowsExceededException, WriteException
	{
		driver=new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement table=driver.findElement(By.cssSelector(".tsc_table_s13"));
		List<WebElement> th=table.findElements(By.cssSelector("thead th"));
		List<WebElement> leftth=driver.findElements(By.cssSelector("tbody th"));
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Sahil\\Desktop\\SELENIUM\\Book1.xls");
		WritableWorkbook wb=Workbook.createWorkbook(fo);
		WritableSheet sh=wb.createSheet("Sheet 1", 0);
		Label l1 = null;
		System.out.println(th.size());
		int k = 1;
		for(int i=0;i<th.size();i++)
		{
			System.out.print(th.get(i).getText()+"  ");
			l1=new Label(i, 0, th.get(i).getText());
			sh.addCell(l1);
		}
		System.out.println();
		for(int i=0;i<leftth.size();i++)
		{
			System.out.print(leftth.get(i).getText()+"  ");
			l1=new Label(0,i+1, leftth.get(i).getText());
			sh.addCell(l1);
		}
	
		Label l2=new Label(0,5,driver.findElement(By.cssSelector("tfoot th")).getText());
		sh.addCell(l2);
		List<WebElement> td=table.findElements(By.tagName("td"));
		System.out.println(td.size());
		System.out.println(sh.getRows()  +"  "+sh.getColumns());
			for (int i = 1; i < sh.getRows(); i++) {
				for (int j = 1; j < sh.getColumns(); j++) {
					if(k<(td.size()))
					{
					l1=new Label(j,i,td.get(k).getText());
				
				sh.addCell(l1);	
				k++;
			}}				

			
		}
		

		wb.write();
		wb.close();
	}
	
}
