package First;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class dynamic {

	public static void main(String[] args) throws IOException,InterruptedException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://store.demoqa.com");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Actions action = new Actions(driver);
			WebElement dropDownMenu=driver.findElement(By.xpath("//*[@id='menu-item-33']/a"));
			action.moveToElement(dropDownMenu).build().perform();
			WebElement elementToSelect=driver.findElement(By.xpath("//*[@id='menu-item-34']/a"));
			action.moveToElement(elementToSelect).click().perform();
			/*action.moveToElement(dropDownMenu).moveToElement(elementToSelect).click().build().perform();
			/*driver.findElement(By.cssSelector("#meta>ul>li>a")).click();
			System.out.println(driver.findElement(By.cssSelector(".message.register")).getText());
			*/
			WebElement gridoption=driver.findElement(By.className("wrap")).findElement(By.className("grid"));
			gridoption.click();
			//action.moveToElement(gridoption).build().perform();
			//action.moveToElement(gridoption).click().perform();
			List<WebElement> we  = driver.findElements(By.cssSelector(".wpsc_buy_button"));
			System.out.println(we.size());
					
			for (int i = 0; i <we.size() ;i++ ) {
									
			we.get(i).click();
			
			System.out.println(i+driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/span")).getText());
			
			driver.findElement(By.cssSelector(".continue_shopping")).click();	
			Thread.sleep(2000);
			}
				/*we.get(5).click();
				int j=6;
				System.out.println(j+driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/span")).getText());
				driver.findElement(By.cssSelector(".continue_shopping")).click();	
				//Write in excel sheet	
				System.out.println("Write begins");
				FileOutputStream fo=new FileOutputStream("C:\\Users\\Sahil\\Desktop\\2.xls");
				WritableWorkbook wb=Workbook.createWorkbook(fo);
				WritableSheet sh=wb.createSheet("Cart Items", 0);
				Label l1=new Label(0, 0, "Cart Items");
				sh.addCell(l1);
			Label l2;
				
				for (int i = 0; i <6 ;i++ ) {
					
					we.get(i).click();
					
					l2=new Label(0,i+1,driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/span")).getText());
					sh.addCell(l2);
					driver.findElement(By.cssSelector(".continue_shopping")).click();	
					Thread.sleep(5000);
		
					
					}
										
				wb.write();
				wb.close();
				System.out.println("Write Completes");
				//driver.findElement(By.className("wpsc_buy_button")).click();
			
			//driver.findElement(By.className("input-button-buy")).findElement(By.className("wpsc_buy_button")).click();
			
			*/
			}

}
