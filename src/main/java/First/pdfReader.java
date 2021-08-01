package First;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;



public class pdfReader {
	
	@Test
	public void ReadPDF() throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.axmag.com/download/pdfurl-guide.pdf");
		URL TestURL = new URL("http://www.axmag.com/download/pdfurl-guide.pdf");
		//URL TestURL=new URL("file:///C:/Selenium/Selenium%20Books/Selenium%20Testing%20Tools%20Cookbook,%202nd%20Edition.pdf");
		Screenshotutility object=new Screenshotutility(driver, "C:\\Users\\Sahil\\Desktop\\Screenshot.jpg");
		object.takeScreenshot();
		BufferedInputStream bis = new BufferedInputStream(TestURL.openStream());
		PDDocument doc = PDDocument.load(bis);
		String text = new PDFTextStripper().getText(doc);
		doc.close();
		bis.close();
		System.out.println(text);
		Assert.assertTrue(text.contains("Open the setting.xml, you can see it is like this"));
		/*PDFParser TestPDF = new PDFParser(TestFile);
		TestPDF.parse();
		String TestText = new PDFTextStripper().getText(TestPDF.getPDDocument());
		System.out.println(TestText);
		Assert.assertTrue(TestText.contains("Open the setting.xml, you can see it is like this"));
*/
		}
	
}
