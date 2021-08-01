package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory {

WebDriver driver;

@FindBy(id="user_login")
WebElement userid;

@FindBy(id="user_pass")
WebElement pswrd;

@FindBy(className="button-primary")
WebElement btnvalue;


public pagefactory(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void entrid(String strUserName)

{
	userid.sendKeys(strUserName);
}

public void entrpswd(String password)
{
	pswrd.sendKeys(password);
}

public void login()
{
	btnvalue.click();
}

public String getbtnvalue()
{	
	
	 
    return    btnvalue.getAttribute("value");

}

public void wplogin(String strUserName,String strPasword)
{
	 
    //Fill user name

    this.entrid(strUserName);

    //Fill password

    this.entrpswd(strPasword);

    //Click Login button

    this.login();             

}

}
