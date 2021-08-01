package Second;

import org.testng.annotations.Test;



public class windowauthorisation extends Testng {
	
	@Test
	public void authenticate()
	{
		
		//Pass the User name and Password like this driver.get("http://username:password@URl);
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}
}
