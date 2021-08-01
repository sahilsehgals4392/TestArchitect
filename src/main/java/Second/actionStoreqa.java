package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionStoreqa extends Testng {

@Test
public void toolsqa()
{
driver.get("http://store.demoqa.com/");

Actions action=new Actions(driver);
WebElement prodcateg=driver.findElement(By.cssSelector("#menu-item-33>a"));
WebElement accessories=driver.findElement(By.cssSelector("#menu-item-34>a"));
action.moveToElement(prodcateg).moveToElement(accessories).click().build().perform();
/*action..build().perform();
action.click(accessories);
*/

}


}
