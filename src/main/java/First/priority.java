package First;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class priority extends Testng {
		
@Test ( priority=1 , enabled=true)
	public void login1()
	{
	System.out.println("Login1");
	}

@Test 	( dependsOnMethods ={"login1"} , description="Logout" )
	
	public void logout1()
	{
	System.out.println("Logout1");
	
	}

@Test ( dependsOnMethods ={"logout1"} , enabled=true)
	public void login2()
	{
	System.out.println("Login2");
	Assert.assertEquals("same","same");
	}
@Test ( dependsOnMethods ={"login2"} , alwaysRun=true )

	public void logout2()
	{
	System.out.println("Logout2");
	}
}
