package First;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class node6 {
@Test
public void imageselect() throws InterruptedException, MalformedURLException 
	
	{
	DesiredCapabilities cp=new DesiredCapabilities();
	cp.setBrowserName("chrome");
	cp.setPlatform(Platform.WINDOWS);
	WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cp);
driver.get("https://www.google.co.in/?gfe_rd=cr&ei=TIKHVu7YFs708wfPzYiwDA&gws_rd=ssl");
System.out.println(driver.findElement(By.cssSelector("#hplogo")).getAttribute("title"));
driver.navigate().to("http://www.flipkart.com/yu-yureka-plus/p/itmedh8gfryhcvzr?pid=MOBEDH8GKX8ZE2G2&ref=L%3A-8740994657792606105&srno=p_14&query=one+plus+x&otracker=from-search");
driver.findElement(By.cssSelector(".fk-question-mark.emi-popup-link.know-more")).click();
System.out.println(driver.findElement(By.cssSelector(".table1.tmargin10.emi-popup-table")).getTagName());
WebElement e=driver.findElement(By.cssSelector(".table1.tmargin10.emi-popup-table"));
List <WebElement> rows=e.findElements(By.tagName("tr"));
System.out.println(rows.size());
System.out.println(getClass().getSimpleName()+Thread.currentThread().getId());

}
}
