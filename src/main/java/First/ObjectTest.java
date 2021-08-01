package First;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class ObjectTest   {
	  public WebDriver driver;
	  public Objectmap objmap;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
	  // Create a new instance of the Firefox driver
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("http://demosite.center/wordpress/wp-login.php");
	  Thread.sleep(2000);
	  }
	  
	  @Test
	  public void login() throws Exception{
	    
	    //Get current working directory
	    String workingDir=System.getProperty("user.dir");
	    //Get object map file
	     objmap = new Objectmap (workingDir+"\\src\\Object Properties\\objectmap.properties");
	      //Get the username element
	     WebElement username = driver.findElement(objmap.getLocator("Username_field"));
	     username.sendKeys("admin");
	    //Get the password element
	     WebElement password = driver.findElement(objmap.getLocator("Password_field"));
	     password.sendKeys("demo123");//password is omitted
	    //Click on the login button
	     WebElement login = driver.findElement(objmap.getLocator("Login_button"));
	     login.click();
	     
	     //Assert the user login by checking the Online user
	    /* WebElement onlineuser=driver.findElement(objmap.getLocator("online_user"));
	     assertEquals("Online users", onlineuser.getText());
	     */
	  }
	  }

