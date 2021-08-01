package First;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class table extends Testng {
	int i,j=0;
@Test
public void tabledata() throws RowsExceededException, WriteException, IOException
{
	String u="http://www.flipkart.com/lenovo-k3-note/p/itmebygmmk8cfmy4?pid=MOBE8AHABTYGSZ2J&ref=L%3A-3610334321436507657&srno=p_2&query=flipkart&otracker=from-search";
	driver.get(u);
	/*driver.findElement(By.cssSelector(".topSpacesmsdivNewBg")).findElement(By.cssSelector(".close-icon.close")).click();
	driver.findElement(By.cssSelector("#fk-top-search-box")).sendKeys("flipkart");
	
	driver.findElement(By.cssSelector(".search-bar-submit.fk-font-13.fk-font-bold")).click();
	System.out.println("webpage is" +driver.getTitle());
	//List<WebElement> search=
	driver.findElement(By.xpath(".//*[@id='products']/div/div[1]/div[2]/div/div[2]/div[1]/a")).click();
	*/
	driver.findElement(By.cssSelector(".fk-question-mark.emi-popup-link.know-more")).click();
	WebElement popup=driver.findElement(By.cssSelector("#emi-popup-content"));
	List<WebElement> rows=popup.findElements(By.tagName("tr"));
	/*/FileOutputStream exlFileName= new FileOutputStream("C:\\Users\\Sahil\\Desktop\\table.xls");
	WritableWorkbook exlWorkBook=Workbook.createWorkbook(exlFileName);
	WritableSheet exlWorkSheet1 = exlWorkBook.createSheet("TestSheet1",0);
	*/for(WebElement row:rows)
	{
		List<WebElement> cols=row.findElements(By.tagName("td"));
	for(WebElement col:cols)
		{
		System.out.print(col.getText()+ " ");
		/*Label Sheet1cellContent = new Label(i,j,col.getText());
		exlWorkSheet1.addCell(Sheet1cellContent);
		
		exlWorkBook.write();
		*/}
	
	System.out.println();

	//.exlWorkBook.close();}
	}
}
}