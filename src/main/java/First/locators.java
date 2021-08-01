package First;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
@Test
public class locators extends Testng {

	public void webmath() throws IOException, RowsExceededException, WriteException {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		*/
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Sahil\\Desktop\\SELENIUM\\2.xls");
		WritableWorkbook wb=Workbook.createWorkbook(fo);
		WritableSheet sheet1=wb.createSheet("Dropdown Items", 0);
		driver.get("http://www.webmath.com/");
		Select dropdown=new Select(driver.findElement(By.id("topicItem")));
		String r=driver.findElement(By.id("topicItem")).getText();
		
		System.out.println(r);
		Label label1=new Label(0,0,"Dropdown Items");
		sheet1.addCell(label1);
		System.out.println(dropdown.getOptions().size());
		dropdown.getFirstSelectedOption();
		System.out.println(dropdown.getOptions());
		/*for (int i = 0; i < 9; i++) {
		*/	
		/*String a=dropdown.toString();
		System.out.println(a);
		
		for (int i = 1; i < 9; i++)
		{
		*/
		List<WebElement> a=dropdown.getOptions();
		System.out.println(a);
		
		Label label2=new Label(1,0,r);
		
		sheet1.addCell(label2);
		wb.write();
		wb.close();
		}
	
}


