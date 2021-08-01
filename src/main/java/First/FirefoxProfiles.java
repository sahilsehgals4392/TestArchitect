package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.IOException;

public class FirefoxProfiles {
	
	public static void main(String[] args) throws IOException{
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		FirefoxProfile fp=new FirefoxProfile();
		fp.addExtension(new File("C:\\Users\\Sahil\\Downloads\\firebug.xpi"));
		fp.setPreference("extensions.firebug.DBG_BREAKNOTIFICATION", true);
		fp.setPreference("extensions.firebug.DBG_BREAKONERROR", true);
		fp.setPreference("extensions.firebug.DBG_BREAKONNEXT", true);
		fp.setPreference("extensions.firebug.DBG_BREAKPOINTMODULE", true);
		fp.setPreference("extensions.firebug.DBG_BREAKPOINTPANEL", true);
		fp.setPreference("extensions.firebug.DBG_BREAKPOINTS", true);
		fp.setPreference("extensions.firebug.DBG_BREAKPOINTSTORE", true);
		fp.setPreference("extensions.firebug.DBG_BREAKPOINTTOOL", true);
		fp.setPreference("extensions.firebug.DBG_DEBUGGER", true);
		fp.setPreference("extensions.firebug.DBG_DEBUGGERCLIENT", true);
		fp.setPreference("extensions.firebug.DBG_DEBUGGERHALTER", true);
		fp.setPreference("extensions.firebug.DBG_DEBUGGER_COMMANDS", true);
		fp.setPreference("extensions.firebug.DBG_DOMBASETREE", true);
		fp.setPreference("extensions.firebug.DBG_DOMPANEL", true);
		fp.setPreference("extensions.firebug.DBG_FUNCTIONMONITOR", true);
		fp.setPreference("extensions.firebug.DBG_HTMLMODULE", true);
		fp.setPreference("extensions.firebug.DBG_NETCACHEREADER", true);
		fp.setPreference("extensions.firebug.DBG_PANELSELECTOR", true);
		fp.setPreference("extensions.firebug.DBG_QUICKINFOBOX", true);
		fp.setPreference("extensions.firebug.DBG_RETURNVALUEMODIFIER", true);
		fp.setPreference("extensions.firebug.DBG_SCOPECLIENT", true);
		fp.setPreference("extensions.firebug.DBG_SCRIPTPANEL", true);
		fp.setPreference("extensions.firebug.DBG_SCRIPTPANELLINEUPDATER", true);
		fp.setPreference("extensions.firebug.DBG_SCRIPTPANELWARNING", true);
		fp.setPreference("extensions.firebug.DBG_SOURCEEDITOR", true);
		fp.setPreference("extensions.firebug.DBG_SOURCEFILE", true);
		fp.setPreference("extensions.firebug.DBG_SOURCETOOL", true);
		fp.setPreference("extensions.firebug.DBG_SPY", true);
		fp.setPreference("extensions.firebug.DBG_STATUSPATH", true);
		fp.setPreference("extensions.firebug.DBG_TABCLIENT", true);
		fp.setPreference("extensions.firebug.DBG_TABCONTEXT", true);
		fp.setPreference("extensions.firebug.DBG_TABLEREP", true);
		fp.setPreference("extensions.firebug.DBG_TOGGLESIDEPANELS", true);
		fp.setPreference("extensions.firebug.DBG_WATCHPROVIDER", true);
		fp.setPreference("extensions.firebug.console.enableSites", true);
		fp.setPreference("extensions.firebug.consoleFilterTypes", "cookies");
		fp.setPreference("extensions.firebug.cookies.enableSites", true);
		fp.setPreference("extensions.firebug.currentVersion", "2.0.18");
		fp.setPreference("extensions.firebug.defaultPanelName", "firepath");
		fp.setPreference("extensions.firebug.firepath.evaluationMode", "css");
		fp.setPreference("extensions.firebug.firepath.generateAbsoluteXPath", true);
		fp.setPreference("extensions.firebug.previousPlacement", 1);
		fp.setPreference("extensions.firebug.script.enableSites", true);
		fp.setPreference("extensions.firebug.showErrorCount", true);
		String json=fp.toJson();
		System.out.println(json);
		WebDriver driver=new FirefoxDriver(org.openqa.selenium.firefox.FirefoxProfile.fromJson(json));
		
		driver.get("http://www.webmath.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		/*Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles.size());
		for(String a:windowHandles)
	{
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Firebug"))
			{
			driver.close();
			}
		}
	*/	driver.findElement(By.id("header-username")).sendKeys("abcde");
		driver.findElement(By.xpath("//*[@id='header-password']")).sendKeys("abcde");
		driver.findElement(By.className("header-btn")).click();
		String p=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissable>p")).getText();
		System.out.println(p);
		driver.navigate().back();
		
		}
	

}
