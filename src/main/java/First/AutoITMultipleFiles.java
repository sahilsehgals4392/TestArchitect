package First;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AutoITMultipleFiles {

	WebDriver driver;

	@Test
	public void multipleFiles() throws InterruptedException, IOException, BiffException {
		FirefoxProfile profile = new FirefoxProfile();
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Selenium\\Firefox\\firefox.exe"));

		driver = new FirefoxDriver(binary, profile);
		driver.get("http://toolsqa.com/automation-practice-form");
		FileInputStream fi = new FileInputStream("C:\\Users\\Sahil\\Desktop\\SELENIUM\\Keyword Driven\\AutoIT.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet sh = wb.getSheet(0);
		for (int i = 0; i < sh.getColumns(); i++) {
			driver.findElement(By.id("photo")).click();
			Thread.sleep(5000);
			System.out.println("Print");
			Runtime.getRuntime()
					.exec("C:\\Users\\Sahil\\Documents\\Au\\MultipleUpload.exe" + " " + sh.getCell(i, 0).getContents());
			Thread.sleep(5000);
		}
		wb.close();
		fi.close();
	}

}
