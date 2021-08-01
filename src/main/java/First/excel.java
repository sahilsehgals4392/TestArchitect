package First;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;


public class excel {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		/*Select dropdown=new Select(driver.findElement(By.id("topicItem")));
		*/
		FileOutputStream exlFileName= new FileOutputStream("C:\\Users\\Sahil\\Desktop\\1.xls");
		WritableWorkbook exlWorkBook=Workbook.createWorkbook(exlFileName);
		WritableSheet exlWorkSheet1 = exlWorkBook.createSheet("TestSheet1",0);
		WritableSheet exlWorkSheet2 = exlWorkBook.createSheet("TestSheet2",1);
		//Creating data(cell values) into above excel workbook
		Label Sheet1cellContent = new Label(0,0,"Test sheet1");
		Label Sheet2cellContent = new Label(0,0,"Test sheet2");
		//Adding cell value to its respective sheet.
		exlWorkSheet1.addCell(Sheet1cellContent);
		exlWorkSheet2.addCell(Sheet2cellContent);
		//Writing the values into excel.
		exlWorkBook.write();
		//Close the workbook
		exlWorkBook.close();
		System.out.println("Write Successful");
		}
	}