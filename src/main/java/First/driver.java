package First;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;


public class driver {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.webmath.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.id("header-username")).sendKeys("abcde");
		driver.findElement(By.xpath("//*[@id='header-password']")).sendKeys("abcde");
		driver.findElement(By.className("header-btn")).click();
		String p=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissable>p")).getText();
		System.out.println(p);
		driver.navigate().back();
		
		}
			/*
		dropdown.selectByIndex(11);		
		driver.findElement(By.name("param0")).sendKeys("50");
		
		Select dropdown2=new Select(driver.findElement(By.name("param2")));
		dropdown2.selectByVisibleText("square centimeter(s)");
		driver.findElement(By.xpath("//*[@id='d-childMainContLeft']/div[2]/form/center/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/p/b/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*System.out.println(driver.findElement(By.xpath("html/body/font/font/font/center")).getText());
		String r=driver.findElement(By.xpath("html/body/font/font/font/p[1]")).getText();
		int i=Integer.parseInt(r);
		System.out.println(i);*/
	}