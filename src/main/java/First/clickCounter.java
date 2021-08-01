package First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class clickCounter {
	WebDriver driver;

	@Test
	public void count() throws InterruptedException
	{
		driver=new ChromeDriver();
		String clickcount=null;
		driver.get("http://cookbook.seleniumacademy.com/html5page.html");
		WebElement button=driver.findElement(By.cssSelector("html>body>article>p>button"));
		JavascriptExecutor js=(JavascriptExecutor) driver;	
		
		clickcount= (String) js.executeScript("return sessionStorage.clickcount;");
		System.out.println(driver.findElement(By.cssSelector("html>body>article>p>button")).getText());
		System.out.println(clickcount);
		button.click();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(1000);
		clickcount= (String) js.executeScript("return sessionStorage.clickcount;");
		System.out.println(clickcount);
		}}