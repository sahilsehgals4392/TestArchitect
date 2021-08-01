package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	private WebDriver driver;
	
	public Registration(WebDriver driver)
	{
		this.driver=driver;
	}
	public AccountCreation registernew()
	{	driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.findElement(By.name("Register")).click();
		return new AccountCreation(driver);
	}
}