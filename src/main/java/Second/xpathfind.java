package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;



public class xpathfind extends Testng{
	@Test
	public void axisxpath() throws InterruptedException
	{
		driver.get("http://www.axisbank.com/");
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.findElement(By.className("mobileBannerClose")).click();
//		WebElement prod=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='product']")));
		WebElement account=driver.findElement(By.xpath("//a[@title='Accounts']"));
		WebElement saving=driver.findElement(By.xpath("//a[starts-with(@title,'Savings')]"));
//		prod.click();
		action.moveToElement(account).moveToElement(saving).click().build().perform();
		List<WebElement> idattribute=driver.findElements(By.xpath("//a[@id]"));//Will return all elements which
					//have id attribute declared
		System.out.println(idattribute.size());
		for (int i = 0; i < idattribute.size(); i++) {
			System.out.println(idattribute.get(i).getText());}
		
	// 	ANOTHER EXAMPLE
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en");
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='FirstName']"))).sendKeys("Sahil");
		driver.findElement(By.xpath("//input[@n='2']")).sendKeys("Sehgal");
		/*driver.findElement(By.xpath("//input[]")).sendKeys("sahilsehgal");
		driver.findElement(By.xpath("//input[]")).sendKeys("password");
		driver.findElement(By.xpath("//input[]")).sendKeys("password");
		*/
		driver.findElement(By.cssSelector(".goog-inline-block.goog-flat-menu-button-dropdown")).click();
		List<WebElement> month=driver.findElements(By.cssSelector(".goog-menuitem-content"));
		month.get(2).click();
		
		driver.findElement(By.xpath("//input[@id='BirthDay' and @name='BirthDay']")).sendKeys("04");
		driver.findElement(By.xpath("//input[contains(@id,'Year')]")).sendKeys("1992");
		//ENDS-WITH not working
		}}
	
