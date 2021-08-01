package First;

import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;

public class storage extends Testng {

	public void sessionstorage()
	{
		driver.get("http://book.theautomatedtester.co.uk/localstorage.html");
		
		LocalStorage storageDriver=(LocalStorage) driver;
		System.out.println(storageDriver.size());
		SessionStorage storage=(SessionStorage) driver;
		System.out.println(storage.size());
		
	}
}
