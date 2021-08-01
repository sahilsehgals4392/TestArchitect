package First;

import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class retryClass {
	
	
	@Test(retryAnalyzer = retryLogic.class)
	public void testForRetry()
	{
		assertTrue(false);
	}

}
