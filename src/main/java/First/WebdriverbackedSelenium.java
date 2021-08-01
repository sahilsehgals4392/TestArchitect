package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriverBackedSelenium;

public class WebdriverbackedSelenium {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseUrl="http://newtours.demoaut.com/register";
/*		Selenium se=new WebDriverBackedSelenium(driver, baseUrl);
		se.open(baseUrl);
		se.type("name=firstName","Demo");
		se.type("name=lastName","Testing");
	*/	
	}

}
