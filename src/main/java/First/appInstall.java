package First;

/*
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

*/
public class appInstall{}
/*
	AndroidDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException 
	{
	DesiredCapabilities capabilities=DesiredCapabilities.chrome();
	
	capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");
	capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"My Android");
	capabilities.setCapability(MobileCapabilityType.VERSION," 4.4.2");
	capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"io.selendroid.testapp");
	capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,".HomeScreenActivity");
	
	URL url=new URL("http://127.0.0.1:4788/wd/hub");
	driver=new AndroidDriver(url,capabilities);
	}
	
	@Test
	public void testIFrame()
	{
	WebDriverWait wait=new WebDriverWait(driver,5);
	//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Mukesh Selenium Appium");
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("my_text_field")));
	driver.findElement(By.id("my_text_field")).sendKeys("Hello");
	driver.hideKeyboard();
	WebElement ckbox=driver.findElement(By.id("input_adds_check_box"));
	ckbox.click();
	System.out.println(driver.findElement(By.id("encodingTextview")).getText());
	driver.findElement(By.id("buttonStartWebview")).click();
	driver.findElement(By.className("android.widget.Spinner")).click();
	driver.findElement(By.name("iframes")).click();
	String text=driver.findElement(By.name("selendroid-test-app")).getText();
	System.out.println(text);
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Foo Link']")).click();
	
	
	}
	public void testDropdown()
	{
//DROPDOWN
	driver.findElement(By.id("startUserRegistration")).click();
	driver.hideKeyboard();
	driver.findElement(By.className("android.widget.Spinner")).click();
	driver.findElement(By.name("Scala")).click();
}

	@Test
	public void testAlert()
	{
	//NOT WORKING	
/*	driver.findElement(By.id("showPopupWindowButton")).click();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	alert.dismiss();
	driver.scrollTo("Dismiss").click();


	WebDriverWait wait=new WebDriverWait(driver,20);
	driver.findElement(By.id("topLevelElementTest")).click();
	String focussedText=driver.findElement(By.id("focusedText")).getText();
	Assert.assertEquals("Should only be found once",focussedText);
	driver.findElement(By.id("waitingButtonTest")).click();
    //driver.findElement(By.xpath("//android.widget.Button[@content-desc='waitingButtonTestCD']")).click();
	String dialog=driver.findElement(By.className("android.widget.TextView")).getText();
	Assert.assertTrue(dialog.matches("Waiting Dialog"));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("inputUsername")));
	driver.findElement(By.id("inputUsername")).sendKeys("Name");
}
	@Test
	public void webView()
	{	driver.findElement(By.id("buttonStartWebview")).click();
		Set <String>contextNames =driver.getContextHandles();
		for (String contextName : contextNames) {
		System.out.println(contextName);
		if (contextName.contains("WebView")){
		driver.context(contextName);
		}
		}
	WebElement edit=driver.findElement(By.className("android.widget.EditText"));
	edit.sendKeys("WebView");
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Prefered Car:']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Volvo']")).click();
	driver.findElement(By.name("Audi")).click();
driver.findElement(By.xpath("//android.widget.Button[@content-desc='Send me your name!']")).click();
	}
	
	@Test
	public void formPage() throws InterruptedException
	{	driver.findElement(By.id("buttonStartWebview")).click();
	driver.findElement(By.className("android.widget.Spinner")).click();
	driver.findElement(By.name("formPage")).click();
	System.out.println(driver.getPageSource());
/*	List<WebElement> ckbox=driver.findElements(By.className("android.widget.CheckBox"));

	//driver.scrollToExact("formPage").click();
	System.out.println(ckbox.size());
	
		for (int i = 0; i <= 2; i++) {
			ckbox.get(i).click();
		}
		
		//driver.scrollToExact("Label");
		
		driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc='Label']")).click();
		List<WebElement> fbox=driver.findElements(By.xpath("//android.widget.Button[@content-desc='One']"));
		
		fbox.get(0).click();
		driver.findElement(By.name("Two")).click();
		fbox.get(1).click();
		driver.findElement(By.name("Four")).click();
		fbox.get(2).click();
		driver.findElement(By.name("Still learning how to count, apparently")).click();
		List<WebElement> select_1=driver.findElements(By.name("select_1"));
		for (int i = 0; i < select_1.size()-1; i++) {
			select_1.get(i).click();
			driver.findElement(By.name("select_1")).click();
			driver.findElement(By.id("button1")).click();
			
		}
	

		driver.findElement(By.name("select_1")).click();
		Thread.sleep(2000);
		List<WebElement> text=driver.findElements(By.id("text1"));
		text.get(3).click();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.name("Ham")).click();
		driver.findElement(By.name("Eggs")).click();
		driver.findElement(By.id("button1")).click();
		List<WebElement> radio=driver.findElements(By.className("android.widget.RadioButton"));
		radio.get(1).click();
	
	
	Thread.sleep(1000);
	WebElement element=driver.findElement(By.className("android.widget.EditText"));
	TouchAction ta=new TouchAction(driver);
	ta.moveTo(element).perform();
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
	/*JavascriptExecutor js = (JavascriptExecutor) driver;
	HashMap<String, String> scrollObject = new HashMap<String, String>();
	scrollObject.put("direction", "down");
	js.executeScript("mobile: scroll", scrollObject);
	driver.swipe(0, 0,element.getLocation().getX()+100, element.getLocation().getY()+100,2000);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.className("android.widget.EditText")));
	driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
	js.executeScript("arguments[0].scrollIntoView(false);", element);
	}*
	/*
	@Test
	public void touch()
	{
		driver.findElement(By.name("Touch Actions")).click();
	WebElement element=driver.findElement(By.name("Gesture Type"));
		driver.tap(2, element,2000);
		driver.findElement(By.name("Canvas")).click();
		/*
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap tapObject = new HashMap();
		tapObject.put("x", 100); // in pixels from left
		tapObject.put("y", 400); // in pixels from top
		js.executeScript("mobile: tap", tapObject);		
		
		driver.swipe(0, 0, 500, 400, 2000);
	}
	
	}
	*/