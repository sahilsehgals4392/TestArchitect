package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*WebDriver has an AppCacheStatus enum that represents the current status of
the application cache. The current statuses are:
 0: UNCACHED
 1: IDLE
 2: CHECKING
 3: DOWNLOADING
 4: UPDATEREADY
 5: OBSOLETE*/

public class appcache {
	
	public void applicationcache()
	{WebDriver driver = new FirefoxDriver();
		driver.get("http://book.theautomatedtester.co.uk/");
		//AppCacheStatus status = (Applicationcache)driver).getStatus();
	}

}
