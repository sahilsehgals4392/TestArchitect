package First;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class popup  extends Testng{
	@Test
	public void popuphandle() throws InterruptedException
	{
		/*driver.get("https://www.google.com/intl/en/mail/help/about.html");
		String window=driver.getWindowHandle();
		driver.findElement(By.cssSelector("#gmail-create-account")).click();
		driver.findElement(By.cssSelector("#TosLink")).click();
		String window2=driver.getWindowHandle();
		driver.switchTo().window(window);
		
		driver.findElement(By.cssSelector("#gmail-create-account")).click();
		driver.findElement(By.cssSelector("#TosLink")).click();
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		                                            // perform operations on popup

		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
	*/
		       driver.get("http://www.hdfcbank.com/");
		       String main=driver.getWindowHandle();
		       Thread.sleep(5000);
		       if(driver.getPageSource().contains("MyPopup"))
		    	 driver.findElement(By.cssSelector("#cee_closeBtn>img")).click();
		       driver.findElement(By.cssSelector("#loginsubmit")).click();
		       String popup=driver.getWindowHandle();
		        Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
		        Iterator<String> iterator = windowId.iterator();   
		        System.out.println(windowId.size());
		        String r;  
		        while(iterator.hasNext())
		        {
		        	r=iterator.next();
		        	System.out.println(r);
		        
		        if(!r.equals(main))
		        {
		        	driver.switchTo().window(r);
		        	Thread.sleep(5000);
		        	System.out.println(driver.getTitle());
		        	driver.findElement(By.cssSelector(".button>a>img")).click();
		        	driver.switchTo().window(main);
		        	System.out.println(driver.getTitle());
		        	driver.findElement(By.cssSelector(".christmas-band-img>a>img")).click();
		        }	
		       
		        }
		        }  
}
