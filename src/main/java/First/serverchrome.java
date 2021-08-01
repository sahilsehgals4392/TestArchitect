package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class serverchrome {
	

		public static void main(String[] args) throws InterruptedException{
		//Start the ChromeDriver Server
		System.setProperty("webdriver.chrome.driver",
		"C:\\Selenium\\chromedriver.exe");
		ChromeDriverService.Builder builder1=new ChromeDriverService.Builder();
		ChromeDriverService srvc1=builder1.usingDriverExecutable(new File("C:\\Selenium\\chromedriver.exe")).build();
		ChromeOptions opts=new ChromeOptions();
		opts.addExtensions(new File("C:\\Users\\Sahil\\Downloads\\firebug.crx"));
		WebDriver driver=new ChromeDriver(srvc1,opts);
		driver.get("https://www.google.co.in/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Chrome Driver");
		Thread.sleep(5000);
		srvc1.stop();
		}
		
}