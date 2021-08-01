package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Autoit{

	@Test
	public void fileUpload()throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();

	    driver.get("http://toolsqa.com/automation-practice-form");
 
	    driver.findElement(By.id("photo")).click();
	    Thread.sleep(5000);
	    System.out.println("Print");
	    Runtime.getRuntime().exec("C:\\Users\\Sahil\\Documents\\Au\\First.exe");
	    driver.quit();
 

	}

}
