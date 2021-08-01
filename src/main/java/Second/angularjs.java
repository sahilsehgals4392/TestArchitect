package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class angularjs   {
	WebElement a,b,h1,h2,h3,h4;
	WebDriver driver=new FirefoxDriver();
@Test
public void angularxpath()
{
driver.get("http://www.w3schools.com/angular/angular_application.asp");

WebElement a,b,h1,h2,h3,h4;

a=driver.findElement(By.xpath("//li[@class='w3-padding-hor-16 ng-binding ng-scope'][1]/following-sibling::li[1]"));
b=driver.findElement(By.xpath("//li[@class='w3-padding-hor-16 ng-binding ng-scope'][3]/preceding-sibling::li[2]"));
h1=driver.findElement(By.xpath("//h2[contains(text(),'Tutorial')]"));
h2=driver.findElement(By.xpath("//p[@class='intro']/following::h2[1]"));
h3=driver.findElement(By.xpath("//header[@class='w3-container w3-light-grey w3-padding-hor-16']/h3"));
h4=driver.findElement(By.xpath("//div/h4[contains(text(),'Top 10 Tutorials')]"));
System.out.println(a.getText());
System.out.println(b.getText());
System.out.println(h1.getText());
System.out.println(h2.getText());
System.out.println(h3.getText());
System.out.println(h4.getText());
}
@Test
public void angularcss()
{	
	
	driver.get("http://www.w3schools.com/angular/angular_application.asp");

	
List<WebElement> list=driver.findElements(By.cssSelector(".w3-padding-hor-16.ng-binding.ng-scope"));
		a=list.get(0);
		b=driver.findElement(By.cssSelector("li.w3-padding-hor-16.ng-binding.ng-scope+li+li"));
		//h1=driver.findElement(By.cssSelector("a.w3-closebtn.w3-hide-large.w3-large+h2"));
		h1=driver.findElement(By.cssSelector("a[class='w3-closebtn w3-hide-large w3-large']+h2"));
		h2=driver.findElement(By.cssSelector("p.intro+hr+h2"));
		h3=driver.findElement(By.cssSelector(".w3-container.w3-light-grey.w3-padding-hor-16:first-child>h3"));
		List<WebElement> li=driver.findElements(By.cssSelector(".top10>h4"));
		h4=li.get(0);
		System.out.println(h1.getText());
		System.out.println(h2.getText());
		System.out.println(h3.getText());
		System.out.println(h4.getText());

}
}
