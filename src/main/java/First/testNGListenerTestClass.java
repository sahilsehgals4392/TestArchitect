package First;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNgListener.class)
public class testNGListenerTestClass {

	
	@Test
	public void passTest()
	{
		Assert.assertTrue(true);
	}


	@Test
	public void failTest()
	{
		Assert.assertTrue(false);
	}

}
