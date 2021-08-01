package First;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
public class testDemoCall {
	
	@Test
	public void javascript() throws SecurityException, IOException
	{
			System.out.println(System.getProperty("user.dir"));
			File firebug = new File("C:\\Users\\Sahil\\Desktop\\firebug-2.0.19-fx.xpi");
			File netExport = new File("C:\\Users\\Sahil\\Desktop\\netExport-0.8.xpi");
			FirefoxProfile profile = new FirefoxProfile();

		profile.addExtension(firebug);
		profile.addExtension(netExport);

		profile.setPreference("app.update.enabled", false);

			//Setting Firebug preferences
			profile.setPreference("extensions.firebug.currentVersion", "2.0.19");
			profile.setPreference("extensions.firebug.addonBarOpened", true);
			profile.setPreference("extensions.firebug.console.enableSites", true);
			profile.setPreference("extensions.firebug.script.enableSites", true);
			profile.setPreference("extensions.firebug.net.enableSites", true);
			profile.setPreference("extensions.firebug.previousPlacement", 1);
			profile.setPreference("extensions.firebug.allPagesActivation", "on");
			profile.setPreference("extensions.firebug.onByDefault", true);
			profile.setPreference("extensions.firebug.defaultPanelName", "net");

			// Setting netExport preferences
			profile.setPreference("extensions.firebug.netexport.alwaysEnableAutoExport", true);
			profile.setPreference("extensions.firebug.netexport.autoExportToFile", true);
			profile.setPreference("extensions.firebug.netexport.saveFiles", true);
			//profile.setPreference("extensions.firebug.netexport.showPreview", false);
			profile.setPreference("extensions.firebug.netexport.defaultLogDir", "C:\\Users\\Sahil\\Desktop\\SELENIUM\\PomExample\\");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(org.openqa.selenium.Platform.ANY);
			capabilities.setCapability(FirefoxDriver.PROFILE, profile);

			WebDriver driver = new FirefoxDriver(capabilities);
			try {
			Thread.sleep(10000);
			driver.get("http://www.linkedin.com");
			Thread.sleep(5000);
			} catch(InterruptedException ie) {
			ie.printStackTrace();
			}
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd+HH-mm-ss");
			Date date = new Date();
			String s=driver.getCurrentUrl();
			
			FileHandler fi=new FileHandler("C:\\Users\\Sahil\\Desktop\\SELENIUM\\PomExample\\"+driver.getCurrentUrl().substring(8,s.length()-1)+"+"+dateFormat.format(date)+".har");
			System.out.println(fi.toString());
			org.junit.Assert.assertTrue(fi.toString().contains("LinkedIn"));
			//readAsString("C:\\Users\\Sahil\\Desktop\\SELENIUM\\PomExample\\");
			driver.quit();
	}
	}
